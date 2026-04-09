import java.util.Arrays;

public class 수열과구간쿼리3 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] arr1 = {0, 1, 2, 3, 4};
        int[][] queries1 = {{0, 3},{1, 2},{1, 4}};
        int[] expected1 = {3, 4, 1, 0, 2};
        int[] result1 = solution(arr1, queries1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));

    }

    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        return answer;
    }
}
