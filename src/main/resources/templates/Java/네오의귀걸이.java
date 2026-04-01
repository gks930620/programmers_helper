import java.util.Arrays;

public class 네오의귀걸이 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 3;
        int[][] point1 = {{0, 4, 1}, {2, 2, 4}, {4, 0, 4}};
        int[][] query1 = {{0, 3, 3, 4}, {0, 3, 1, 2}, {1, 2, 2, 0}};
        int[] expected1 = {1, 2, 1, 0};
        int[] result1 = solution(n1, point1, query1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));

    }

    public static int[] solution(int n, int[][] point, int[][] query) {
        int[] answer = {};
        return answer;
    }
}
