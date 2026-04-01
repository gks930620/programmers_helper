#!/usr/bin/env python3
"""AI-powered PR reviewer for Java template files.

PR에 추가된 Java 파일의 main 메소드 구조를 검사하고,
통과 시 자동으로 PR을 머지합니다.

필요한 Repository Secrets:
  - GEMINI_API_KEY : Google Gemini API 키
"""

import os
import sys
import json
import re
import requests

GITHUB_TOKEN = os.environ["GITHUB_TOKEN"]
PR_NUMBER = os.environ["PR_NUMBER"]
REPO = os.environ["REPO"]
GEMINI_API_KEY = os.environ.get("GEMINI_API_KEY", "")

GITHUB_HEADERS = {
    "Authorization": f"token {GITHUB_TOKEN}",
    "Accept": "application/vnd.github.v3+json",
}

TEMPLATES_JAVA_PATH = "src/main/resources/templates/Java/"
INDEX_FILE = "src/main/resources/templates/index.txt"

# AI에게 전달할 검토 기준 (README.md 기반)
REVIEW_CRITERIA = """
다음 규칙에 따라 Java 파일의 main 메소드를 검토하세요.

1. 클래스명이 파일명(확장자 제외)과 일치해야 합니다.
2. `public static void main(String[] args)` 메소드가 있어야 합니다.
3. `solution` 메소드가 있어야 합니다 (솔루션 구현 없이 기본값만 반환하는 템플릿 형태).
4. main 메소드에 최소 1개 이상의 테스트 케이스가 있어야 합니다.
5. 각 테스트 케이스는 아래 형식을 따라야 합니다.
   - `System.out.println("--- Test Case N ---");`
   - `System.out.println("기대값  : ...")` (기대값 출력)
   - `System.out.println("결과값  : " + result);` (결과값 출력)
   - `System.out.println("비교    : " + ...);` (비교 결과 출력)
6. JUnit 등 테스트 프레임워크 import 절대 금지.
7. 1차원 배열 출력은 `Arrays.toString()`, 2차원 배열은 `Arrays.deepToString()` 사용.
8. 배열 비교는 `Arrays.equals()` 또는 `Arrays.deepEquals()` 사용.
9. String 비교는 `==` 대신 `.equals()` 사용.
"""


# ──────────────────────────────────────────────
# GitHub API 헬퍼
# ──────────────────────────────────────────────

def get_pr_files():
    url = f"https://api.github.com/repos/{REPO}/pulls/{PR_NUMBER}/files"
    r = requests.get(url, headers=GITHUB_HEADERS)
    r.raise_for_status()
    return r.json()


def get_file_content(raw_url):
    r = requests.get(raw_url, headers=GITHUB_HEADERS)
    r.raise_for_status()
    return r.text


def post_comment(body):
    url = f"https://api.github.com/repos/{REPO}/issues/{PR_NUMBER}/comments"
    r = requests.post(url, headers=GITHUB_HEADERS, json={"body": body})
    r.raise_for_status()


def merge_pr():
    url = f"https://api.github.com/repos/{REPO}/pulls/{PR_NUMBER}/merge"
    r = requests.put(
        url,
        headers=GITHUB_HEADERS,
        json={
            "commit_title": f"chore: auto-merge PR #{PR_NUMBER} [AI reviewed]",
            "merge_method": "squash",
        },
    )
    return r.status_code == 200


# ──────────────────────────────────────────────
# 구조 검사 (AI 없이)
# ──────────────────────────────────────────────

def structural_check(filename, content):
    """기본 구조를 검사합니다. 문제점 리스트를 반환합니다."""
    issues = []
    class_name = os.path.splitext(filename)[0]

    # JUnit / TestNG 사용 금지
    if re.search(r"import\s+org\.junit", content):
        issues.append("JUnit import가 있습니다. JUnit 사용은 금지되어 있습니다.")
    if re.search(r"import\s+org\.testng", content):
        issues.append("TestNG import가 있습니다. 테스트 프레임워크 사용은 금지되어 있습니다.")

    # 클래스명 확인
    if not re.search(r"public\s+class\s+" + re.escape(class_name) + r"[\s{<]", content):
        issues.append(f"클래스명이 파일명 `{class_name}`과 일치하지 않습니다.")

    # main 메소드 존재
    if not re.search(r"public\s+static\s+void\s+main\s*\(", content):
        issues.append("`main` 메소드가 없습니다.")

    # solution 메소드 존재
    if not re.search(r"public\s+static\s+\w[\w<>\[\]]*\s+solution\s*\(", content):
        issues.append("`solution` 메소드가 없습니다.")

    # 테스트 케이스 형식 확인
    if not re.search(r"--- Test Case \d+ ---", content):
        issues.append('main 메소드에 테스트 케이스(`--- Test Case N ---`)가 없습니다.')

    return issues


# ──────────────────────────────────────────────
# AI 리뷰
# ──────────────────────────────────────────────

def ai_review(filename, content):
    """Google Gemini API로 main 메소드를 검토합니다. API 키가 없으면 None 반환."""
    if not GEMINI_API_KEY:
        print("경고: GEMINI_API_KEY가 설정되지 않아 AI 리뷰를 건너뜁니다.", file=sys.stderr)
        return None

    try:
        import google.generativeai as genai

        genai.configure(api_key=GEMINI_API_KEY)
        model = genai.GenerativeModel("gemini-2.0-flash")

        prompt = f"""아래 Java 파일을 검토해주세요.
{REVIEW_CRITERIA}

파일명: {filename}

```java
{content}
```

반드시 아래 JSON 형식으로만 응답하세요 (다른 텍스트 없이 JSON만):
{{
  "approved": true 또는 false,
  "issues": ["문제점1", "문제점2"],
  "summary": "한 줄 요약 (한국어)"
}}

문제가 없으면 issues는 빈 배열, approved는 true로 응답하세요.
"""
        response = model.generate_content(
            prompt,
            generation_config=genai.GenerationConfig(
                response_mime_type="application/json",
                temperature=0,
            ),
        )
        return json.loads(response.text)
    except Exception as e:
        print(f"AI 리뷰 오류: {e}", file=sys.stderr)
        return None


# ──────────────────────────────────────────────
# index.txt 검사
# ──────────────────────────────────────────────

def check_index_txt(pr_files, new_java_filenames):
    """새로 추가된 Java 파일이 index.txt에 등록됐는지 확인합니다."""
    index_entry = next(
        (f for f in pr_files if f["filename"] == INDEX_FILE), None
    )
    if not index_entry:
        return [
            f"`index.txt`가 업데이트되지 않았습니다. "
            f"다음 파일을 등록해주세요: {', '.join(f'`Java/{n}`' for n in new_java_filenames)}"
        ]

    index_content = get_file_content(index_entry["raw_url"])
    issues = []
    for name in new_java_filenames:
        if f"Java/{name}" not in index_content:
            issues.append(f"`index.txt`에 `Java/{name}` 항목이 없습니다.")
    return issues


# ──────────────────────────────────────────────
# 댓글 본문 생성
# ──────────────────────────────────────────────

def build_comment(approved, all_issues, file_reviews):
    if approved:
        body = "## ✅ AI 코드 리뷰 결과 — 승인\n\n"
        body += "모든 검사를 통과했습니다. 자동으로 병합됩니다. 🎉\n"
    else:
        body = "## ❌ AI 코드 리뷰 결과 — 수정 필요\n\n"
        body += "아래 문제를 수정한 뒤 다시 Push해주세요.\n"
        body += "Push하면 자동으로 다시 검토됩니다.\n\n"
        body += "### 🔍 발견된 문제\n\n"
        for i, issue in enumerate(all_issues, 1):
            body += f"{i}. {issue}\n"

    if file_reviews:
        body += "\n---\n### 📄 파일별 리뷰\n"
        for review in file_reviews:
            status = "✅" if not review["issues"] else "❌"
            body += f"\n**{status} {review['filename']}**"
            if review.get("ai_summary"):
                body += f"\n> 🤖 AI: {review['ai_summary']}"
            if review["issues"]:
                body += "\n"
                for issue in review["issues"]:
                    body += f"  - {issue}\n"
            body += "\n"

    if not approved:
        body += "\n---\n"
        body += "<details>\n<summary>📘 작성 규칙 요약 (클릭하여 펼치기)</summary>\n\n"
        body += "#### 파일 위치\n"
        body += "```\nsrc/main/resources/templates/Java/문제이름.java\n```\n\n"
        body += "#### index.txt 등록\n"
        body += "`src/main/resources/templates/index.txt`에 `Java/문제이름.java` 한 줄 추가\n\n"
        body += "#### Java 파일 구조\n"
        body += "```java\npublic class 문제이름 {\n"
        body += "    public static void main(String[] args) {\n"
        body += '        // System.out.println("--- Test Case 1 ---");\n'
        body += '        // System.out.println("기대값  : ...");\n'
        body += '        // System.out.println("결과값  : " + result);\n'
        body += '        // System.out.println("비교    : " + ...);\n'
        body += "    }\n"
        body += "    public static 반환타입 solution(파라미터) {\n"
        body += "        반환타입 answer = 초기값;\n"
        body += "        return answer;\n"
        body += "    }\n}\n```\n\n"
        body += f"자세한 규칙은 [README.md](https://github.com/{REPO}/blob/main/README.md)를 참고하세요.\n"
        body += "</details>\n"

    return body


# ──────────────────────────────────────────────
# 메인
# ──────────────────────────────────────────────

def main():
    pr_files = get_pr_files()

    java_files = []
    other_files = []

    for f in pr_files:
        fname = f["filename"]
        if fname.startswith(TEMPLATES_JAVA_PATH) and fname.endswith(".java"):
            java_files.append(f)
        elif fname != INDEX_FILE:
            other_files.append(fname)

    all_issues = []

    # Java 템플릿 파일도 없고, 허용되지 않는 파일도 없고, index.txt 변경도 없으면
    # 이 워크플로우와 무관한 PR — 조용히 종료
    has_index_change = any(f["filename"] == INDEX_FILE for f in pr_files)
    if not java_files and not other_files and not has_index_change:
        print("Java 템플릿 파일 변경 없음. 검토를 건너뜁니다.")
        sys.exit(0)

    # index.txt만 변경되고 Java 파일이 없는 PR은 거부
    if not java_files and has_index_change and not other_files:
        all_issues.append(
            f"Java 파일 없이 `{INDEX_FILE}`만 변경되었습니다. "
            f"`{TEMPLATES_JAVA_PATH}*.java` 파일도 함께 추가해주세요."
        )
        post_comment(build_comment(False, all_issues, []))
        sys.exit(1)

    # 허용되지 않는 파일 확인
    if other_files:
        all_issues.append(
            f"허용되지 않는 파일이 포함되어 있습니다: "
            f"{', '.join(f'`{f}`' for f in other_files)}\n"
            f"  허용 경로: `{TEMPLATES_JAVA_PATH}*.java` 및 `{INDEX_FILE}`"
        )

    if not java_files:
        all_issues.append(f"`{TEMPLATES_JAVA_PATH}` 폴더에 Java 파일이 없습니다.")
        post_comment(build_comment(False, all_issues, []))
        sys.exit(1)

    # index.txt 검사
    new_java_filenames = [
        os.path.basename(f["filename"])
        for f in java_files
        if f["status"] == "added"
    ]
    if new_java_filenames:
        all_issues.extend(check_index_txt(pr_files, new_java_filenames))

    # 파일별 리뷰
    file_reviews = []
    for f in java_files:
        if f["status"] not in ("added", "modified"):
            continue

        filename = os.path.basename(f["filename"])
        content = get_file_content(f["raw_url"])

        struct_issues = structural_check(filename, content)

        # 구조 문제가 없을 때만 AI 리뷰 진행 (불필요한 API 호출 방지)
        ai_result = ai_review(filename, content) if not struct_issues else None

        file_issues = struct_issues[:]
        ai_summary = None

        if ai_result:
            if not ai_result.get("approved", False):
                file_issues.extend(ai_result.get("issues", []))
            ai_summary = ai_result.get("summary", "")

        file_reviews.append(
            {"filename": filename, "issues": file_issues, "ai_summary": ai_summary}
        )
        all_issues.extend([f"`{filename}`: {issue}" for issue in file_issues])

    approved = len(all_issues) == 0
    comment = build_comment(approved, all_issues, file_reviews)
    post_comment(comment)

    if approved:
        if not merge_pr():
            print("ERROR: PR 머지 실패", file=sys.stderr)
            sys.exit(1)
        print(f"PR #{PR_NUMBER} 승인 및 자동 머지 완료.")
    else:
        print("PR 리뷰 실패:", all_issues)
        sys.exit(1)


if __name__ == "__main__":
    main()
