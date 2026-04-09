import java.util.Arrays;

public class 나누어떨어지는숫자배열 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] arr1 = {5, 9, 7, 10};
        int divisor1 = 5;
        int[] expected1 = {5, 10};
        int[] result1 = solution(arr1, divisor1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] arr2 = {2, 36, 1, 3};
        int divisor2 = 1;
        int[] expected2 = {1, 2, 3, 36};
        int[] result2 = solution(arr2, divisor2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[] arr3 = {3,2,6};
        int divisor3 = 10;
        int[] expected3 = {-1};
        int[] result3 = solution(arr3, divisor3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));

    }

    public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        return answer;
    }
}
