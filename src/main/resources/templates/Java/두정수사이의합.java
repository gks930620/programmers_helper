public class 두정수사이의합 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int a1 = 3;
        int b1 = 5;
        long expected1 = 12L;
        long result1 = solution(a1, b1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int a2 = 3;
        int b2 = 3;
        long expected2 = 3L;
        long result2 = solution(a2, b2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int a3 = 5;
        int b3 = 3;
        long expected3 = 12L;
        long result3 = solution(a3, b3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static long solution(int a, int b) {
        long answer = 0;
        return answer;
    }
}
