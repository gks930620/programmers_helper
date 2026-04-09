public class 연속펄스부분수열의합 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] sequence1 = {2, 3, -6, 1, 3, -1, 2, 4};
        long expected1 = 10L;
        long result1 = solution(sequence1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));

    }

    public static long solution(int[] sequence) {
        long answer = 0;
        return answer;
    }
}
