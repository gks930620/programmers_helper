import java.util.Arrays;

public class 수열과구간쿼리1 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] arr1 = {0, 1, 2, 3, 4};
        int[][] queries1 = {{0, 1},{1, 2},{2, 3}};
        int[] expected1 = {1, 3, 4, 4, 4};
        int[] result1 = solution(arr1, queries1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] arr2 = i;
        int[][] queries2 = queries{i};
        int[] expected2 = arr;
        int[] result2 = solution(arr2, queries2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[] arr3 = ---;
        int[][] queries3 = ---;
        int[] expected3 = ---;
        int[] result3 = solution(arr3, queries3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int[] arr4 = -;
        int[][] queries4 = -;
        int[] expected4 = {0, 1, 2, 3, 4};
        int[] result4 = solution(arr4, queries4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + Arrays.toString(expected4));
        System.out.println("결과값  : " + Arrays.toString(result4));
        System.out.println("비교    : " + Arrays.equals(expected4, result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        int[] arr5 = 0;
        int[][] queries5 = {0,1};
        int[] expected5 = {1, 2, 2, 3, 4};
        int[] result5 = solution(arr5, queries5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + Arrays.toString(expected5));
        System.out.println("결과값  : " + Arrays.toString(result5));
        System.out.println("비교    : " + Arrays.equals(expected5, result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        int[] arr6 = 1;
        int[][] queries6 = {1,2};
        int[] expected6 = {1, 3, 3, 3, 4};
        int[] result6 = solution(arr6, queries6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + Arrays.toString(expected6));
        System.out.println("결과값  : " + Arrays.toString(result6));
        System.out.println("비교    : " + Arrays.equals(expected6, result6));
        System.out.println();

        // --- 테스트 케이스 7 ---
        int[] arr7 = 2;
        int[][] queries7 = {2,3};
        int[] expected7 = {1, 3, 4, 4, 4};
        int[] result7 = solution(arr7, queries7);

        System.out.println("--- Test Case 7 ---");
        System.out.println("기대값  : " + Arrays.toString(expected7));
        System.out.println("결과값  : " + Arrays.toString(result7));
        System.out.println("비교    : " + Arrays.equals(expected7, result7));

    }

    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        return answer;
    }
}
