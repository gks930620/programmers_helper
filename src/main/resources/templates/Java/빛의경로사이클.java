import java.util.Arrays;

public class 빛의경로사이클 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] grid1 = {"SL", "LR"};
        int[] expected1 = {16};
        int[] result1 = solution(grid1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] grid2 = {"S"};
        int[] expected2 = {1,1,1,1};
        int[] result2 = solution(grid2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String[] grid3 = {"R", "R"};
        int[] expected3 = {4,4};
        int[] result3 = solution(grid3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));

    }

    public static int[] solution(String[] grid) {
        int[] answer = {};
        return answer;
    }
}
