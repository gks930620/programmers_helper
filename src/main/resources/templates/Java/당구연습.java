import java.util.Arrays;

public class 당구연습 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int m1 = 10;
        int n1 = 10;
        int startX1 = 3;
        int startY1 = 7;
        int[][] balls1 = {{7, 7}, {2, 7}, {7, 3}};
        int[] expected1 = {52, 37, 116};
        int[] result1 = solution(m1, n1, startX1, startY1, balls1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));

    }

    public static int[] solution(int m, int n, int startX, int startY, int[][] balls) {
        int[] answer = {};
        return answer;
    }
}
