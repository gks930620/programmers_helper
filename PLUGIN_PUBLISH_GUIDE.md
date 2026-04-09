# IntelliJ Marketplace 배포 가이드 (현재 프로젝트 기준)

이 문서는 현재 프로젝트의 배포 절차를 하나로 정리한 통합 가이드입니다.  
기본 권장 흐름은 **수동 업로드(B 방식) + ZIP 빠른 생성**입니다.

## 현재 반영된 값
- Plugin ID: `com.ch.programmers_helper`
- Plugin Name: `Programmers Helper`
- Vendor Name: `programmers_helper`
- Vendor URL: `https://github.com/gks930620/programmers_helper`
- ZIP 경로 패턴: `build/distributions/programmers_helper-<version>.zip`

## 1. 권장 배포 흐름 (수동 B, 빠른 ZIP)
### 1) 버전 올리기 (필수)
`build.gradle.kts`의 버전을 기존 배포 버전보다 크게 올립니다.

```kotlin
version = "1.0.0"
```

예: `1.0.0` -> `1.0.1`

### 2) ZIP만 빠르게 생성
PowerShell:

```powershell
cmd /c gradlew.bat buildPlugin --no-daemon --console=plain
```

필요할 때만 `clean` 추가:

```powershell
cmd /c gradlew.bat clean buildPlugin --no-daemon --console=plain
```

### 3) ZIP 확인
예시 결과물:

```text
build/distributions/programmers_helper-1.0.1.zip
```

### 4) Marketplace 웹에서 수동 업로드 (B 방법)
Marketplace Upload 화면에서 입력:
- Plugin file: 방금 생성한 ZIP 파일
- Source code URL: `https://github.com/gks930620/programmers_helper`

## 2. 검증이 필요할 때만 실행
호환성 검증까지 포함한 전체 빌드:

```powershell
cmd /c gradlew.bat clean buildPlugin verifyPlugin --no-daemon --console=plain
```

참고: `verifyPlugin`은 시간이 오래 걸리므로, 매번 업데이트에는 보통 생략합니다.

## 3. 자동 업로드(A 방법, 선택)
최초 수동 등록 이후에는 Gradle 업로드도 사용 가능합니다.

### 토큰 준비
1. JetBrains Marketplace에서 Permanent Token 생성
2. 프로젝트 루트 `.env` 파일에 아래 키 저장

```env
JETBRAINS_MARKETPLACE_TOKEN=발급받은_토큰값
```

참고:
- `build.gradle.kts`는 `JETBRAINS_MARKETPLACE_TOKEN`을 환경변수 또는 `.env`에서 읽도록 설정됨
- 보안상 `.env` 파일은 Git에 올리지 않기

### 업로드 명령
PowerShell:

```powershell
cmd /c gradlew.bat publishPlugin --no-daemon --console=plain
```

## 4. 체크리스트
- 버전을 올렸는지
- 최신 ZIP 파일을 업로드했는지
- Vendor/Plugin ID 정보가 Marketplace 등록 정보와 일치하는지
- 변경사항(Change notes)을 입력했는지


https://plugins.jetbrains.com/plugin/31172-programmers-helper/edit
