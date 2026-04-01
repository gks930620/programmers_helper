public class 주사위게임1 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int a1 = 3;
        int b1 = 5;
        int expected1 = 34;
        int result1 = solution(a1, b1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int a2 = 6;
        int b2 = 1;
        int expected2 = 14;
        int result2 = solution(a2, b2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int a3 = 2;
        int b3 = 4;
        int expected3 = 2;
        int result3 = solution(a3, b3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(int a, int b) {
        int answer = 0;
        return answer;
    }
}
