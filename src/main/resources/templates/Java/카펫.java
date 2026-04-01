import java.util.Arrays;

public class 카펫 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int brown1 = 10;
        int yellow1 = 2;
        int[] expected1 = {4, 3};
        int[] result1 = solution(brown1, yellow1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int brown2 = 8;
        int yellow2 = 1;
        int[] expected2 = {3, 3};
        int[] result2 = solution(brown2, yellow2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int brown3 = 24;
        int yellow3 = 24;
        int[] expected3 = {8, 6};
        int[] result3 = solution(brown3, yellow3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));

    }

    public static int[] solution(int brown, int yellow) {
        int[] answer = {};
        return answer;
    }
}
