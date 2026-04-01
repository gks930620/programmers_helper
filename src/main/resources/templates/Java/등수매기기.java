import java.util.Arrays;

public class 등수매기기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] score1 = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        int[] expected1 = {1, 2, 4, 3};
        int[] result1 = solution(score1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[][] score2 = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
        int[] expected2 = {4, 4, 6, 2, 2, 1, 7};
        int[] result2 = solution(score2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static int[] solution(int[][] score) {
        int[] answer = {};
        return answer;
    }
}
