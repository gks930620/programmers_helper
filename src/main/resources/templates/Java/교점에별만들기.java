import java.util.Arrays;

public class 교점에별만들기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] line1 = {{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}};
        String[] expected1 = {"....*....", ".........", ".........", "*.......*", ".........", ".........", ".........", ".........", "*.......*"};
        String[] result1 = solution(line1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[][] line2 = {{0, 1, -1}, {1, 0, -1}, {1, 0, 1}};
        String[] expected2 = {"*.*"};
        String[] result2 = solution(line2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[][] line3 = {{1, -1, 0}, {2, -1, 0}};
        String[] expected3 = {"*"};
        String[] result3 = solution(line3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int[][] line4 = {{1, -1, 0}, {2, -1, 0}, {4, -1, 0}};
        String[] expected4 = {"*"};
        String[] result4 = solution(line4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + Arrays.toString(expected4));
        System.out.println("결과값  : " + Arrays.toString(result4));
        System.out.println("비교    : " + Arrays.equals(expected4, result4));

    }

    public static String[] solution(int[][] line) {
        String[] answer = {};
        return answer;
    }
}
