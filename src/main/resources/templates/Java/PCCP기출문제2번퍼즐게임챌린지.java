public class PCCP기출문제2번퍼즐게임챌린지 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] diffs1 = {1, 5, 3};
        int[] times1 = {2, 4, 7};
        long limit1 = 30L;
        int expected1 = 3;
        int result1 = solution(diffs1, times1, limit1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] diffs2 = {1, 4, 4, 2};
        int[] times2 = {6, 3, 8, 2};
        long limit2 = 59L;
        int expected2 = 2;
        int result2 = solution(diffs2, times2, limit2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[] diffs3 = {1, 328, 467, 209, 54};
        int[] times3 = {2, 7, 1, 4, 3};
        long limit3 = 1723L;
        int expected3 = 294;
        int result3 = solution(diffs3, times3, limit3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int[] diffs4 = {1, 99999, 100000, 99995};
        int[] times4 = {9999, 9001, 9999, 9001};
        long limit4 = 3456789012L;
        int expected4 = 39354;
        int result4 = solution(diffs4, times4, limit4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));

    }

    public static int solution(int[] diffs, int[] times, long limit) {
        int answer = 0;
        return answer;
    }
}
