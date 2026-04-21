"""
프로그래머스 코딩테스트 문제 스크래퍼
==============================================
- 목록 API 로 문제 ID + 제목 수집 (page 1~30)
- 상세 페이지 HTML 에서 입출력 예 테이블 + Java 코드 템플릿 추출
- CSV 파일로 저장 (문제제목, 입출력 예, 자바파일)
"""

import csv
import time

import requests
from bs4 import BeautifulSoup

# ── 설정 ──────────────────────────────────────────────────────
BASE_URL = "https://school.programmers.co.kr"
LIST_API = BASE_URL + "/api/v2/school/challenges"
DETAIL_URL = BASE_URL + "/learn/courses/30/lessons/{lesson_id}?language=java"

HEADERS = {
    "User-Agent": (
        "Mozilla/5.0 (Windows NT 10.0; Win64; x64) "
        "AppleWebKit/537.36 (KHTML, like Gecko) "
        "Chrome/131.0.0.0 Safari/537.36"
    ),
    "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
    "Accept-Language": "ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7",
}

DELAY_LIST = 0.5       # 목록 API 호출 사이 대기(초)
DELAY_DETAIL = 1.0     # 상세 페이지 호출 사이 대기(초)
OUTPUT_FILE = "programmers_java_problems.csv"


# ====================================================================
#  1) 목록 API 로 (lesson_id, 제목) 수집
# ====================================================================
def collect_all_problems(session: requests.Session, max_page: int = 30):
    """
    GET /api/v2/school/challenges?languages[]=java&order=acceptance_desc&page=N
    각 항목: {"id": 120804, "title": "두 수의 곱 구하기", ...}
    """
    problems: list[tuple[int, str]] = []

    for page in range(1, max_page + 1):
        print(f"📋 목록 API page {page}/{max_page} ...")
        resp = session.get(
            LIST_API,
            params={
                "languages[]": "java",
                "order": "acceptance_desc",
                "page": page,
                "perPage": 20,
            },
            headers={**HEADERS, "Accept": "application/json"},
            timeout=30,
        )
        resp.raise_for_status()
        data = resp.json()

        for item in data["result"]:
            problems.append((item["id"], item["title"]))

        print(f"   → 누적 {len(problems)}개")

        # 마지막 페이지 체크
        if page >= data.get("totalPages", max_page):
            break

        time.sleep(DELAY_LIST)

    return problems


# ====================================================================
#  2) 상세 페이지 → 입출력 예 추출
# ====================================================================
def extract_io_examples(soup: BeautifulSoup) -> str:
    """
    div.markdown 안의 table.table 을 텍스트로 변환.
    예: "num1 | num2 | result\n--- | --- | ---\n3 | 4 | 12\n27 | 19 | 513"
    """
    markdown = soup.select_one("div.markdown")
    if not markdown:
        return ""

    tables = markdown.select("table.table")
    if not tables:
        return ""

    parts: list[str] = []
    for table in tables:
        headers = [th.get_text(strip=True) for th in table.select("thead th")]
        rows = []
        for tr in table.select("tbody tr"):
            cells = [td.get_text(strip=True) for td in tr.select("td")]
            rows.append(cells)

        lines: list[str] = []
        if headers:
            lines.append(" | ".join(headers))
            lines.append(" | ".join(["---"] * len(headers)))
        for r in rows:
            lines.append(" | ".join(r))
        parts.append("\n".join(lines))

    return "\n\n".join(parts)


# ====================================================================
#  3) 상세 페이지 → Java 코드 템플릿 추출
# ====================================================================
def extract_java_code(soup: BeautifulSoup) -> str:
    """textarea#code 에서 Java 코드 추출."""
    textarea = soup.select_one("textarea#code")
    if textarea:
        return textarea.get_text().strip()
    return ""


# ====================================================================
#  4) 상세 페이지 크롤링
# ====================================================================
def scrape_detail(session: requests.Session, lesson_id: int):
    """
    GET /learn/courses/30/lessons/{id}?language=java
    → (입출력 예 텍스트, Java 코드 텍스트)
    """
    url = DETAIL_URL.format(lesson_id=lesson_id)
    resp = session.get(url, timeout=30)
    resp.raise_for_status()

    soup = BeautifulSoup(resp.text, "html.parser")
    io_examples = extract_io_examples(soup)
    java_code = extract_java_code(soup)

    return io_examples, java_code


# ====================================================================
#  메인
# ====================================================================
def main():
    session = requests.Session()
    session.headers.update(HEADERS)

    # 쿠키 확보를 위해 메인 페이지 1회 방문
    session.get(BASE_URL + "/learn/challenges", timeout=30)

    print("=" * 60)
    print(" 프로그래머스 Java 문제 스크래퍼")
    print("=" * 60)

    # ── 1단계: 문제 목록 수집 ──
    problems = collect_all_problems(session, max_page=30)
    print(f"\n✅ 총 {len(problems)}개 문제 수집\n")

    # ── 2단계: 각 문제 상세 수집 ──
    results: list[tuple[str, str, str]] = []
    total = len(problems)

    for idx, (lesson_id, title) in enumerate(problems, 1):
        print(f"[{idx:3d}/{total}] {title} (id={lesson_id})")
        try:
            io_ex, java_code = scrape_detail(session, lesson_id)
            results.append((title, io_ex, java_code))
            s_io = "✅" if io_ex else "⬜(없음)"
            s_code = "✅" if java_code else "❌"
            print(f"         입출력예 {s_io}  자바코드 {s_code}")
        except Exception as e:
            print(f"         ⚠️ 오류: {e}")
            results.append((title, "", ""))
        time.sleep(DELAY_DETAIL)

    # ── 3단계: CSV 저장 ──
    with open(OUTPUT_FILE, "w", newline="", encoding="utf-8-sig") as f:
        writer = csv.writer(f)
        writer.writerow(["문제제목", "입출력 예", "자바파일"])
        writer.writerows(results)

    # ── 통계 출력 ──
    io_ok = sum(1 for _, io, _ in results if io)
    code_ok = sum(1 for _, _, code in results if code)
    print(f"\n{'=' * 60}")
    print(f"📁 저장 완료: {OUTPUT_FILE}")
    print(f"   총 {len(results)}문제 | 입출력 예 {io_ok}개 | 자바코드 {code_ok}개")
    print(f"{'=' * 60}")


if __name__ == "__main__":
    main()

