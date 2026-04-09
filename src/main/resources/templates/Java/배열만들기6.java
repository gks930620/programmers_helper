import java.util.Arrays;

public class 배열만들기6 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] arr1 = {0, 1, 1, 1, 0};
        int[] expected1 = {0, 1, 0};
        int[] result1 = solution(arr1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] arr2 = {0, 1, 0, 1, 0};
        int[] expected2 = {0, 1, 0, 1, 0};
        int[] result2 = solution(arr2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[] arr3 = {0, 1, 1, 0};
        int[] expected3 = {-1};
        int[] result3 = solution(arr3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));

    }

    public static int[] solution(int[] arr) {
        int[] answer = {};
        return answer;
    }
}
