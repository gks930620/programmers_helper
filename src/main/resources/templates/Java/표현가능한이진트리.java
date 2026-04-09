import java.util.Arrays;

public class 표현가능한이진트리 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        long[] numbers1 = {7, 42, 5};
        int[] expected1 = {1, 1, 0};
        int[] result1 = solution(numbers1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        long[] numbers2 = {63, 111, 95};
        int[] expected2 = {1, 1, 0};
        int[] result2 = solution(numbers2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static int[] solution(long[] numbers) {
        int[] answer = {};
        return answer;
    }
}
