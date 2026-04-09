public class 지게차와크레인 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] storage1 = #1;
        String[] requests1 = 10%;
        int expected1 = requests에 크레인을 사용한 출고 요청만 존재합니다.;
        int result1 = solution(storage1, requests1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] storage2 = #2;
        String[] requests2 = 15%;
        int expected2 = requests에 지게차를 사용한 출고 요청만 존재합니다.;
        int result2 = solution(storage2, requests2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String[] storage3 = #3;
        String[] requests3 = 25%;
        int expected3 = requests에 컨테이너의 종류가 최대 한 번씩 등장합니다. 즉 이전에 꺼낸 컨테이너 종류를 다시 꺼내지 않습니다.;
        int result3 = solution(storage3, requests3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        String[] storage4 = #4;
        String[] requests4 = 50%;
        int expected4 = 제한사항 외 추가조건이 없습니다.;
        int result4 = solution(storage4, requests4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        String[] storage5 = storage;
        String[] requests5 = requests;
        int expected5 = result;
        int result5 = solution(storage5, requests5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + expected5);
        System.out.println("결과값  : " + result5);
        System.out.println("비교    : " + (expected5 == result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        String[] storage6 = ---;
        String[] requests6 = ---;
        int expected6 = ---;
        int result6 = solution(storage6, requests6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + expected6);
        System.out.println("결과값  : " + result6);
        System.out.println("비교    : " + (expected6 == result6));
        System.out.println();

        // --- 테스트 케이스 7 ---
        String[] storage7 = {"AZWQY", "CAABX", "BBDDA", "ACACA"};
        String[] requests7 = {"A", "BB", "A"};
        int expected7 = 11;
        int result7 = solution(storage7, requests7);

        System.out.println("--- Test Case 7 ---");
        System.out.println("기대값  : " + expected7);
        System.out.println("결과값  : " + result7);
        System.out.println("비교    : " + (expected7 == result7));
        System.out.println();

        // --- 테스트 케이스 8 ---
        String[] storage8 = {"HAH", "HBH", "HHH", "HAH", "HBH"};
        String[] requests8 = {"C", "B", "B", "B", "B", "H"};
        int expected8 = 4;
        int result8 = solution(storage8, requests8);

        System.out.println("--- Test Case 8 ---");
        System.out.println("기대값  : " + expected8);
        System.out.println("결과값  : " + result8);
        System.out.println("비교    : " + (expected8 == result8));

    }

    public static int solution(String[] storage, String[] requests) {
        int answer = 0;
        return answer;
    }
}
