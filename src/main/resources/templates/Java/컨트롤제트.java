public class 컨트롤제트 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String s1 = "1 2 Z 3";
        int expected1 = 4;
        int result1 = solution(s1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String s2 = "10 20 30 40";
        int expected2 = 100;
        int result2 = solution(s2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String s3 = "10 Z 20 Z 1";
        int expected3 = 1;
        int result3 = solution(s3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        String s4 = "10 Z 20 Z";
        int expected4 = 0;
        int result4 = solution(s4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        String s5 = "-1 -2 -3 Z";
        int expected5 = -3;
        int result5 = solution(s5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + expected5);
        System.out.println("결과값  : " + result5);
        System.out.println("비교    : " + (expected5 == result5));

    }

    public static int solution(String s) {
        int answer = 0;
        return answer;
    }
}
