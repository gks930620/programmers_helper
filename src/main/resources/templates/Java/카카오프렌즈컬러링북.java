import java.util.Arrays;

public class 카카오프렌즈컬러링북 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int m1 = 6;
        int n1 = 4;
        int[][] picture1 = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
        int[] expected1 = {4, 5};
        int[] result1 = solution(m1, n1, picture1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));

    }

    public static int[] solution(int m, int n, int[][] picture) {
        int[] answer = new int[2];
        return answer;
    }
}
