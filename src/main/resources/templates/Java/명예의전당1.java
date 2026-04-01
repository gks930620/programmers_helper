import java.util.Arrays;

public class 명예의전당1 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int k1 = 3;
        int[] score1 = {10, 100, 20, 150, 1, 100, 200};
        int[] expected1 = {10, 10, 10, 20, 20, 100, 100};
        int[] result1 = solution(k1, score1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int k2 = 4;
        int[] score2 = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        int[] expected2 = {0, 0, 0, 0, 20, 40, 70, 70, 150, 300};
        int[] result2 = solution(k2, score2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static int[] solution(int k, int[] score) {
        int[] answer = {};
        return answer;
    }
}
