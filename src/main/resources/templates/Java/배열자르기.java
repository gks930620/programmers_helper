import java.util.Arrays;

public class 배열자르기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] numbers1 = {1, 2, 3, 4, 5};
        int num11 = 1;
        int num21 = 3;
        int[] expected1 = {2, 3, 4};
        int[] result1 = solution(numbers1, num11, num21);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] numbers2 = {1, 3, 5};
        int num12 = 1;
        int num22 = 2;
        int[] expected2 = {3, 5};
        int[] result2 = solution(numbers2, num12, num22);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        return answer;
    }
}
