import java.util.Arrays;

public class 특별한이차원배열1 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 3;
        int[][] expected1 = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int[][] result1 = solution(n1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected1));
        System.out.println("결과값  : " + Arrays.deepToString(result1));
        System.out.println("비교    : " + Arrays.deepEquals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 6;
        int[][] expected2 = {{1, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 0, 1, 0, 0}, {0, 0, 0, 0, 1, 0}, {0, 0, 0, 0, 0, 1}};
        int[][] result2 = solution(n2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected2));
        System.out.println("결과값  : " + Arrays.deepToString(result2));
        System.out.println("비교    : " + Arrays.deepEquals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int n3 = 1;
        int[][] expected3 = {{1}};
        int[][] result3 = solution(n3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected3));
        System.out.println("결과값  : " + Arrays.deepToString(result3));
        System.out.println("비교    : " + Arrays.deepEquals(expected3, result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int n4 = i \ j;
        int[][] expected4 = 0;
        int[][] result4 = solution(n4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected4));
        System.out.println("결과값  : " + Arrays.deepToString(result4));
        System.out.println("비교    : " + Arrays.deepEquals(expected4, result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        int n5 = ---;
        int[][] expected5 = ---;
        int[][] result5 = solution(n5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected5));
        System.out.println("결과값  : " + Arrays.deepToString(result5));
        System.out.println("비교    : " + Arrays.deepEquals(expected5, result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        int n6 = 0;
        int[][] expected6 = 1;
        int[][] result6 = solution(n6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected6));
        System.out.println("결과값  : " + Arrays.deepToString(result6));
        System.out.println("비교    : " + Arrays.deepEquals(expected6, result6));

    }

    public static int[][] solution(int n) {
        int[][] answer = {};
        return answer;
    }
}
