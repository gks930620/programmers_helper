import java.util.Arrays;

public class 행렬의덧셈 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] arr11 = {{1,2},{2,3}};
        int[][] arr21 = {{3,4},{5,6}};
        int[][] expected1 = {{4,6},{7,9}};
        int[][] result1 = solution(arr11, arr21);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected1));
        System.out.println("결과값  : " + Arrays.deepToString(result1));
        System.out.println("비교    : " + Arrays.deepEquals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[][] arr12 = {{1},{2}};
        int[][] arr22 = {{3},{4}};
        int[][] expected2 = {{4},{6}};
        int[][] result2 = solution(arr12, arr22);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected2));
        System.out.println("결과값  : " + Arrays.deepToString(result2));
        System.out.println("비교    : " + Arrays.deepEquals(expected2, result2));

    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        return answer;
    }
}
