public class 주사위게임3 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int a1 = 2;
        int b1 = 2;
        int c1 = 2;
        int d1 = 2;
        int expected1 = 2222;
        int result1 = solution(a1, b1, c1, d1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int a2 = 4;
        int b2 = 1;
        int c2 = 4;
        int d2 = 4;
        int expected2 = 1681;
        int result2 = solution(a2, b2, c2, d2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int a3 = 6;
        int b3 = 3;
        int c3 = 3;
        int d3 = 6;
        int expected3 = 27;
        int result3 = solution(a3, b3, c3, d3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int a4 = 2;
        int b4 = 5;
        int c4 = 2;
        int d4 = 6;
        int expected4 = 30;
        int result4 = solution(a4, b4, c4, d4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        int a5 = 6;
        int b5 = 4;
        int c5 = 2;
        int d5 = 5;
        int expected5 = 2;
        int result5 = solution(a5, b5, c5, d5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + expected5);
        System.out.println("결과값  : " + result5);
        System.out.println("비교    : " + (expected5 == result5));

    }

    public static int solution(int a, int b, int c, int d) {
        int answer = 0;
        return answer;
    }
}
