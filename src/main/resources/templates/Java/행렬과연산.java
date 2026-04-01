import java.util.Arrays;

public class 행렬과연산 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] rc1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        String[] operations1 = {"Rotate", "ShiftRow"};
        int[][] expected1 = {{8, 9, 6}, {4, 1, 2}, {7, 5, 3}};
        int[][] result1 = solution(rc1, operations1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected1));
        System.out.println("결과값  : " + Arrays.deepToString(result1));
        System.out.println("비교    : " + Arrays.deepEquals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[][] rc2 = {{8, 6, 3}, {3, 3, 7}, {8, 4, 9}};
        String[] operations2 = {"Rotate", "ShiftRow", "ShiftRow"};
        int[][] expected2 = {{8, 3, 3}, {4, 9, 7}, {3, 8, 6}};
        int[][] result2 = solution(rc2, operations2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected2));
        System.out.println("결과값  : " + Arrays.deepToString(result2));
        System.out.println("비교    : " + Arrays.deepEquals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[][] rc3 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        String[] operations3 = {"ShiftRow", "Rotate", "ShiftRow", "Rotate"};
        int[][] expected3 = {{1, 6, 7 ,8}, {5, 9, 10, 4}, {2, 3, 12, 11}};
        int[][] result3 = solution(rc3, operations3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected3));
        System.out.println("결과값  : " + Arrays.deepToString(result3));
        System.out.println("비교    : " + Arrays.deepEquals(expected3, result3));

    }

    public static int[][] solution(int[][] rc, String[] operations) {
        int[][] answer = {};
        return answer;
    }
}
