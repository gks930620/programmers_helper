import java.util.Arrays;

public class 연속된부분수열의합 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] sequence1 = {1, 2, 3, 4, 5};
        int k1 = 7;
        int[] expected1 = {2, 3};
        int[] result1 = solution(sequence1, k1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] sequence2 = {1, 1, 1, 2, 3, 4, 5};
        int k2 = 5;
        int[] expected2 = {6, 6};
        int[] result2 = solution(sequence2, k2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[] sequence3 = {2, 2, 2, 2, 2};
        int k3 = 6;
        int[] expected3 = {0, 2};
        int[] result3 = solution(sequence3, k3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));

    }

    public static int[] solution(int[] sequence, int k) {
        int[] answer = {};
        return answer;
    }
}
