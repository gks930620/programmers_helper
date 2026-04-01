import java.util.Arrays;

public class 행렬테두리회전하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int rows1 = 6;
        int columns1 = 6;
        int[][] queries1 = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
        int[] expected1 = {8, 10, 25};
        int[] result1 = solution(rows1, columns1, queries1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int rows2 = 3;
        int columns2 = 3;
        int[][] queries2 = {{1,1,2,2},{1,2,2,3},{2,1,3,2},{2,2,3,3}};
        int[] expected2 = {1, 1, 5, 3};
        int[] result2 = solution(rows2, columns2, queries2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int rows3 = 100;
        int columns3 = 97;
        int[][] queries3 = {{1,1,100,97}};
        int[] expected3 = {1};
        int[] result3 = solution(rows3, columns3, queries3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));

    }

    public static int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = {};
        return answer;
    }
}
