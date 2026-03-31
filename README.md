# Programmers Helper - 기여 규칙 (Contribution Rules)

> 현재 Java 기준으로 설명합니다. 다른 언어는 추후 추가 예정입니다.

---

## 📁 파일 위치

파일은 반드시 아래 경로에 추가해야 합니다.

```
src/main/resources/templates/Java/문제이름.java
```

- 폴더명: `Java` (대문자 J)
- 파일명: **프로그래머스 문제 제목 그대로** 사용 (예: `두수의합.java`, `완전범죄.java`)

---

## 📝 index.txt 등록

파일을 추가한 뒤, 반드시 `src/main/resources/templates/index.txt`에 해당 파일 경로를 한 줄 추가해야 합니다.

```
Java/문제이름.java
```

**예시 (`index.txt`)**
```
Java/두수의합.java
Java/완전범죄.java
Java/새로추가한문제.java   ← 이렇게 추가
```

---

## ☕ Java 파일 작성 규칙

### 1. 기본 구조

```java
package programers;

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

- 클래스명은 파일명(문제 제목)과 동일하게
- **테스트 코드(JUnit 등) 절대 사용 금지** — `main` 메소드 안에서 직접 실행하는 방식만 허용

---

### 2. main 메소드 — 테스트 케이스 출력 형식

프로그래머스에 제공된 예제 테스트 케이스를 **모두** 포함해야 합니다.

각 테스트 케이스는 아래 형식을 따릅니다.

```
--- Test Case N ---
기대값  : [기대값]
결과값  : [실행결과]
비교    : [true/false]
```

---

### 3. 파라미터/반환값 타입별 작성 방법

#### ✅ Case 1 — 기본 타입 (int, String, long, boolean 등)

```java
String a = "582";
String b = "734";
String result = solution(a, b);
System.out.println("--- Test Case 1 ---");
System.out.println("기대값  : 1316");
System.out.println("결과값  : " + result);
System.out.println("비교    : " + "1316".equals(result));
```

- 기본 타입 비교: `==` 사용
- String 비교: `.equals()` 사용

---

#### ✅ Case 2 — 파라미터가 배열 (1차원)

```java
int[] arr = {1, 2, 3, 4, 5};
int result = solution(arr);
System.out.println("--- Test Case 1 ---");
System.out.println("기대값  : 15");
System.out.println("결과값  : " + result);
System.out.println("비교    : " + (15 == result));
```

---

#### ✅ Case 3 — 반환값이 배열 (1차원)

`Arrays.toString()`으로 출력하고, `Arrays.equals()`로 비교합니다.

```java
import java.util.Arrays;

int[] input = {5, 4, 3, 2, 1};
int[] expected = {1, 2, 3, 4, 5};
int[] result = solution(input);
System.out.println("--- Test Case 1 ---");
System.out.println("기대값  : " + Arrays.toString(expected));
System.out.println("결과값  : " + Arrays.toString(result));
System.out.println("비교    : " + Arrays.equals(expected, result));
```

---

#### ✅ Case 4 — 파라미터 또는 반환값이 2차원 배열

`Arrays.deepToString()`으로 출력하고, `Arrays.deepEquals()`로 비교합니다.

```java
import java.util.Arrays;

int[][] info = {{1, 2}, {2, 3}, {2, 1}};
int n = 4, m = 4;
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

### 4. 여러 테스트 케이스 작성 시

변수명 충돌을 피하기 위해 케이스 번호를 suffix로 붙입니다.

```java
// Case 1
int[] arr1 = {1, 2, 3};
int result1 = solution(arr1);
System.out.println("--- Test Case 1 ---");
System.out.println("기대값  : 6");
System.out.println("결과값  : " + result1);
System.out.println("비교    : " + (6 == result1));
System.out.println();

// Case 2
int[] arr2 = {4, 5, 6};
int result2 = solution(arr2);
System.out.println("--- Test Case 2 ---");
System.out.println("기대값  : 15");
System.out.println("결과값  : " + result2);
System.out.println("비교    : " + (15 == result2));
System.out.println();
```

---

## ✅ PR 체크리스트

PR을 올리기 전 아래 항목을 확인하세요.

- [ ] 파일 위치: `src/main/resources/templates/Java/문제이름.java`
- [ ] `index.txt`에 `Java/문제이름.java` 한 줄 추가했는가
- [ ] 클래스명과 파일명이 일치하는가
- [ ] `main` 메소드에 프로그래머스 예제 테스트 케이스를 모두 포함했는가
- [ ] 출력 형식 (`--- Test Case N ---`, `기대값`, `결과값`, `비교`) 을 지켰는가
- [ ] 배열 출력 시 `Arrays.toString()` / `Arrays.deepToString()` 을 사용했는가
- [ ] 배열 비교 시 `Arrays.equals()` / `Arrays.deepEquals()` 를 사용했는가

