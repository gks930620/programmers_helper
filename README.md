# 🧩 Programmers Helper

> 프로그래머스 코딩테스트 문제를 IntelliJ IDE 안에서 바로 시작할 수 있도록 도와주는 플러그인입니다.

---

## 📌 플러그인 소개 (Overview)

프로그래머스에서 코딩테스트 문제를 풀 때, 매번 클래스를 만들고 `solution` 메소드 시그니처를 확인하고 테스트 케이스를 직접 옮겨 적는 과정이 번거롭습니다.

**Programmers Helper**는 문제마다 **테스트 케이스가 포함된 템플릿 파일**을 미리 제공하여, `main` 메소드를 실행하는 것만으로 바로 결과를 확인할 수 있게 해줍니다.

### ✨ 주요 기능

| 기능 | 설명 |
|------|------|
| 🔍 **문제 검색** | 우측 Tool Window에서 문제를 이름으로 검색하고 언어별로 필터링 |
| 👁️ **코드 미리보기** | 문제를 선택하면 템플릿 코드를 바로 미리보기 |
| 📄 **파일 생성** | 원하는 폴더를 선택하면 템플릿 파일을 생성하고 에디터에서 자동으로 열기 |
| 📋 **클립보드 복사** | 템플릿 코드를 클립보드에 복사하여 원하는 위치에 붙여넣기 |

### 🚀 사용 방법

1. IDE 우측의 **Programmers Helper** Tool Window를 엽니다.
2. 상단 검색창에 문제 이름을 입력하거나, 언어 필터로 원하는 언어를 선택합니다.
3. 목록에서 풀고 싶은 문제를 클릭하면 우측에 코드가 미리보기됩니다.
4. 아래 버튼 중 하나를 선택합니다.
   - **📄 내 프로젝트에 파일 생성** → 폴더를 선택하면 파일이 생성되고 에디터가 열립니다.
   - **📋 클립보드 복사** → 코드를 복사한 뒤 원하는 파일에 붙여넣습니다.
5. 생성된 파일의 `solution` 메소드 안에 풀이를 작성하고 `main`을 실행하여 결과를 확인합니다.

### 📺 실행 결과 예시

```
--- Test Case 1 ---
기대값  : 1316
결과값  : 1316
비교    : true

--- Test Case 2 ---
기대값  : 305793246910280479981
결과값  : 305793246910280479981
비교    : true
```

---

# 📘 기여 가이드 (Contribution Guide)

> **현재 Java 기준으로 설명합니다.** 다른 언어는 추후 추가 예정입니다.

이 프로젝트는 **Pull Request**를 통해 프로그래머스 문제 템플릿을 기여받고 있습니다.  
아래 규칙을 반드시 지켜주세요.

---

## 🔑 대전제

- 모든 문제 정보(시그니처, 파라미터 타입, 예제 테스트 케이스)는 **반드시 [프로그래머스](https://programmers.co.kr) 사이트의 실제 문제**에서 가져와야 합니다.
- 임의로 만들거나 기억에 의존하지 마세요. **프로그래머스 문제 페이지를 열어두고** 작성해주세요.

---

## 📁 파일 위치

파일은 반드시 아래 경로에 추가해야 합니다.

```
src/main/resources/templates/Java/문제이름.java
```

- 폴더명: `Java` (대문자 J)
- 파일명: **프로그래머스 문제 제목 그대로** 사용 (예: `두수의합.java`, `완전범죄.java`)
- 파일명에 공백이 있으면 공백 그대로 사용 (예: `두 수의 합.java`)

---

## ☕ Java 파일 작성 규칙

### 1. 기본 구조

```java
public class 문제이름 {

    public static void main(String[] args) {
        // 테스트 케이스 작성 (아래 규칙 참고)
    }

    public static 반환타입 solution(파라미터) {
        반환타입 answer = 초기값;
        return answer;
    }
}
```

**필수 사항:**

- 클래스명 = 파일명(문제 제목)과 **정확히 일치**
- `solution` 메소드의 **시그니처(파라미터 타입, 반환 타입)**는 프로그래머스 문제 페이지의 것과 **완전히 동일**해야 합니다
- `solution` 메소드 내부는 **빈 껍데기**로 둡니다 (풀이를 작성하지 않음)
- **JUnit 등 테스트 프레임워크 사용 금지** — `main` 메소드에서 직접 실행하는 방식만 허용
- `package` 선언 **금지** — 파일 최상단에 `package` 문을 넣지 마세요

---

### 2. main 메소드 — 테스트 케이스 작성

프로그래머스 문제 페이지에 제공된 **예제 테스트 케이스를 모두 포함**해야 합니다.

각 테스트 케이스는 아래 출력 형식을 따릅니다.

```
--- Test Case N ---
기대값  : [기대값]
결과값  : [실행결과]
비교    : [true/false]
```

여러 테스트 케이스를 작성할 때는 **변수명 뒤에 케이스 번호를 붙여** 충돌을 방지합니다.

```java
// Test Case 1 — 변수명 그대로 (또는 suffix 1)
int n1 = 12;
int result1 = solution(n1);

// Test Case 2 — suffix 2
int n2 = 5;
int result2 = solution(n2);
```

---

### 3. 파라미터/반환값 타입별 작성 방법

#### ✅ Case A — 기본 타입 파라미터 → 기본 타입 반환 (`int`, `long`, `boolean` 등)

`==`로 비교합니다.

```java
int n1 = 12;
int expected1 = 28;
int result1 = solution(n1);

System.out.println("--- Test Case 1 ---");
System.out.println("기대값  : " + expected1);
System.out.println("결과값  : " + result1);
System.out.println("비교    : " + (expected1 == result1));
```

---

#### ✅ Case B — `String` 파라미터 / 반환

`.equals()`로 비교합니다.

```java
String a = "582";
String b = "734";
String result = solution(a, b);

System.out.println("--- Test Case 1 ---");
System.out.println("기대값  : 1316");
System.out.println("결과값  : " + result);
System.out.println("비교    : " + "1316".equals(result));
```

---

#### ✅ Case C — 파라미터가 1차원 배열

배열 파라미터를 중괄호 `{}`로 선언합니다.

```java
int[] arr = {1, 1, 3, 3, 0, 1, 1};
int result = solution(arr);

System.out.println("--- Test Case 1 ---");
System.out.println("기대값  : 4");
System.out.println("결과값  : " + result);
System.out.println("비교    : " + (4 == result));
```

---

#### ✅ Case D — 반환값이 1차원 배열

`Arrays.toString()`으로 출력하고, `Arrays.equals()`로 비교합니다.  
**파일 상단에 `import java.util.Arrays;`가 필요합니다.**

```java
import java.util.Arrays;

// ...

int[] nums = {1, 5, 2, 6, 3, 7, 4};
int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
int[] expected = {5, 6, 3};
int[] result = solution(nums, commands);

System.out.println("--- Test Case 1 ---");
System.out.println("기대값  : " + Arrays.toString(expected));
System.out.println("결과값  : " + Arrays.toString(result));
System.out.println("비교    : " + Arrays.equals(expected, result));
```

---

#### ✅ Case E — 파라미터 또는 반환값이 2차원 배열

`Arrays.deepToString()`으로 출력하고, `Arrays.deepEquals()`로 비교합니다.

```java
import java.util.Arrays;

// ...

int[][] info = {{1, 2}, {2, 3}, {2, 1}};
int n = 4;
int m = 4;
int expected = 2;
int result = solution(info, n, m);

System.out.println("--- Test Case 1 ---");
System.out.println("기대값  : " + expected);
System.out.println("결과값  : " + result);
System.out.println("비교    : " + (expected == result));
```

반환값이 2차원 배열인 경우:

```java
int[][] expected = {{1, 2}, {3, 4}};
int[][] result = solution(input);

System.out.println("기대값  : " + Arrays.deepToString(expected));
System.out.println("결과값  : " + Arrays.deepToString(result));
System.out.println("비교    : " + Arrays.deepEquals(expected, result));
```

---

#### ✅ Case F — 반환값이 `String[]` 배열

```java
import java.util.Arrays;

// ...

String[] expected = {"banana", "sun"};
String[] result = solution(strings, n);

System.out.println("--- Test Case 1 ---");
System.out.println("기대값  : " + Arrays.toString(expected));
System.out.println("결과값  : " + Arrays.toString(result));
System.out.println("비교    : " + Arrays.equals(expected, result));
```

---

### 4. 비교 방법 요약 정리표

| 반환 타입 | 출력 방법 | 비교 방법 |
|-----------|-----------|-----------|
| `int`, `long`, `boolean` 등 기본 타입 | 그대로 출력 | `==` |
| `String` | 그대로 출력 | `.equals()` |
| `int[]`, `String[]` 등 1차원 배열 | `Arrays.toString()` | `Arrays.equals()` |
| `int[][]` 등 2차원 배열 | `Arrays.deepToString()` | `Arrays.deepEquals()` |

---

## 📝 index.txt 등록

파일을 추가한 뒤, **반드시** `src/main/resources/templates/index.txt`에 해당 파일 경로를 **한 줄 추가**해야 합니다.

### 형식

```
언어폴더/파일이름.확장자
```

### 규칙

- 경로 구분자는 `/` (슬래시) 사용
- 언어 폴더명은 대소문자 정확히 맞출 것: `Java`, `JavaScript`, `Kotlin`, `Python`
- 파일 하나당 한 줄
- 빈 줄, `#`으로 시작하는 줄은 무시됩니다 (주석 가능)
- **index.txt에 등록하지 않으면 플러그인에서 해당 문제가 표시되지 않습니다**

### 예시

```
Java/두수의합.java
Java/완전범죄.java
Java/새로추가한문제.java    ← 이렇게 맨 아래에 추가
```

---

## ✅ PR 체크리스트

PR을 올리기 전 아래 항목을 모두 확인하세요.

- [ ] **문제 출처 확인** — 프로그래머스 사이트의 실제 문제를 기반으로 작성했는가
- [ ] **파일 위치** — `src/main/resources/templates/Java/문제이름.java`에 넣었는가
- [ ] **index.txt 등록** — `index.txt`에 `Java/문제이름.java` 한 줄 추가했는가
- [ ] **클래스명 = 파일명** — 클래스명과 파일명(문제 제목)이 일치하는가
- [ ] **solution 시그니처** — 프로그래머스의 solution 함수 시그니처와 정확히 동일한가
- [ ] **solution 내부 비움** — solution 메소드 안에 풀이를 작성하지 않았는가
- [ ] **테스트 케이스** — 프로그래머스 예제 테스트 케이스를 **모두** 포함했는가
- [ ] **출력 형식** — `--- Test Case N ---` / `기대값` / `결과값` / `비교` 형식을 지켰는가
- [ ] **배열 처리** — 배열 반환 시 `Arrays.toString()` / `Arrays.deepToString()` 사용했는가
- [ ] **배열 비교** — 배열 비교 시 `Arrays.equals()` / `Arrays.deepEquals()` 사용했는가
- [ ] **package 선언 없음** — 파일에 `package` 문이 없는가
