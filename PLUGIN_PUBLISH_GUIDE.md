# IntelliJ Marketplace 배포 가이드 (현재 프로젝트 기준)

## 현재 반영된 값
- Plugin ID: `com.ch.programmers_helper`
- Plugin Name: `Programmers Helper`
- Vendor Name: `programmers_helper`
- Vendor URL: `https://github.com/gks930620/programmers_helper`
- 배포 ZIP 경로: `build/distributions/programmers_helper-1.0.0.zip`

## 1. 토큰 준비
1. JetBrains Marketplace에서 Permanent Token 생성
2. 프로젝트 루트 `.env` 파일에 아래 키 저장

```env
JETBRAINS_MARKETPLACE_TOKEN=발급받은_토큰값
```

참고:
- `build.gradle.kts`는 `JETBRAINS_MARKETPLACE_TOKEN`을 환경변수 또는 `.env`에서 읽도록 설정됨
- 보안상 `.env` 파일은 Git에 올리지 않기

## 2. 로컬 빌드/검증
PowerShell:

```powershell
.\gradlew.bat clean buildPlugin verifyPlugin
```

성공하면 배포용 ZIP이 생성됨:
- `build/distributions/programmers_helper-1.0.0.zip`

## 3. 배포 방법 A: Gradle로 업로드
PowerShell:

```powershell
.\gradlew.bat publishPlugin
```
이 방식은 ZIP을 자동 업로드함.

중요:
- 현재 프로젝트에서 실제 실행해본 결과 `publishPlugin`은 아래 이유로 실패했음
- `Cannot find plugin ... upload the plugin to the repository at least once manually`
- 즉, **최초 1회 등록은 웹 수동 업로드(B 방법) 필수**
- 최초 등록 후에는 `publishPlugin`으로 업데이트 배포 가능

## 4. 배포 방법 B: Marketplace 웹에서 수동 업로드
Marketplace Upload 화면에서 아래 값 사용:
- Plugin file: `build/distributions/programmers_helper-1.0.0.zip`
- Source code URL: `https://github.com/gks930620/programmers_helper`

## 5. Marketplace에서 자주 확인하는 항목
- Vendor 정보가 실제 배포 계정과 일치하는지
- Plugin ID(`com.ch.programmers_helper`)가 기존 등록 플러그인과 충돌 없는지
- 변경사항(Change notes) 입력 여부
