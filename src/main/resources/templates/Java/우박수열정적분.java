import java.util.Arrays;

public class 우박수열정적분 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int k1 = 5;
        int[][] ranges1 = {{0,0},{0,-1},{2,-3},{3,-3}};
        double[] expected1 = {33.0,31.5,0.0,-1.0};
        double[] result1 = solution(k1, ranges1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int k2 = 3;
        int[][] ranges2 = {{0,0}, {1,-2}, {3,-3}};
        double[] expected2 = {47.0,36.0,12.0};
        double[] result2 = solution(k2, ranges2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static double[] solution(int k, int[][] ranges) {
        double[] answer = {};
        return answer;
    }
}
