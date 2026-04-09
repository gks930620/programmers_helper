import java.util.Arrays;

public class 배열의길이를2의거듭제곱으로만들기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] expected1 = {1, 2, 3, 4, 5, 6, 0, 0};
        int[] result1 = solution(arr1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] arr2 = {58, 172, 746, 89};
        int[] expected2 = {58, 172, 746, 89};
        int[] result2 = solution(arr2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static int[] solution(int[] arr) {
        int[] answer = {};
        return answer;
    }
}
