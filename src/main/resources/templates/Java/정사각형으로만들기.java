import java.util.Arrays;

public class 정사각형으로만들기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] arr1 = {{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};
        int[][] expected1 = {{572, 22, 37, 0}, {287, 726, 384, 0}, {85, 137, 292, 0}, {487, 13, 876, 0}};
        int[][] result1 = solution(arr1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected1));
        System.out.println("결과값  : " + Arrays.deepToString(result1));
        System.out.println("비교    : " + Arrays.deepEquals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[][] arr2 = {{57, 192, 534, 2}, {9, 345, 192, 999}};
        int[][] expected2 = {{57, 192, 534, 2}, {9, 345, 192, 999}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int[][] result2 = solution(arr2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected2));
        System.out.println("결과값  : " + Arrays.deepToString(result2));
        System.out.println("비교    : " + Arrays.deepEquals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[][] arr3 = {{1, 2}, {3, 4}};
        int[][] expected3 = {{1, 2}, {3, 4}};
        int[][] result3 = solution(arr3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected3));
        System.out.println("결과값  : " + Arrays.deepToString(result3));
        System.out.println("비교    : " + Arrays.deepEquals(expected3, result3));

    }

    public static int[][] solution(int[][] arr) {
        int[][] answer = {};
        return answer;
    }
}
