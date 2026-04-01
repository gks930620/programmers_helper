import java.util.Arrays;

public class 배열두배만들기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] expected1 = {2, 4, 6, 8, 10};
        int[] result1 = solution(numbers1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] numbers2 = {1, 2, 100, -99, 1, 2, 3};
        int[] expected2 = {2, 4, 200, -198, 2, 4, 6};
        int[] result2 = solution(numbers2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static int[] solution(int[] numbers) {
        int[] answer = {};
        return answer;
    }
}
