import java.util.Arrays;

public class 연속된수의합 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int num1 = 3;
        int total1 = 12;
        int[] expected1 = {3, 4, 5};
        int[] result1 = solution(num1, total1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int num2 = 5;
        int total2 = 15;
        int[] expected2 = {1, 2, 3, 4, 5};
        int[] result2 = solution(num2, total2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int num3 = 4;
        int total3 = 14;
        int[] expected3 = {2, 3, 4, 5};
        int[] result3 = solution(num3, total3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int num4 = 5;
        int total4 = 5;
        int[] expected4 = {-1, 0, 1, 2, 3};
        int[] result4 = solution(num4, total4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + Arrays.toString(expected4));
        System.out.println("결과값  : " + Arrays.toString(result4));
        System.out.println("비교    : " + Arrays.equals(expected4, result4));

    }

    public static int[] solution(int num, int total) {
        int[] answer = {};
        return answer;
    }
}
