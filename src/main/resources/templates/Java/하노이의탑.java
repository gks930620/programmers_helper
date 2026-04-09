import java.util.Arrays;

public class 하노이의탑 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 2;
        int[][] expected1 = { {1,2}, {1,3}, {2,3} };
        int[][] result1 = solution(n1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected1));
        System.out.println("결과값  : " + Arrays.deepToString(result1));
        System.out.println("비교    : " + Arrays.deepEquals(expected1, result1));

    }

    public static int[][] solution(int n) {
        int[][] answer = {};
        return answer;
    }
}
