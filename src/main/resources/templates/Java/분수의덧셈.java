import java.util.Arrays;

public class 분수의덧셈 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int numer11 = 1;
        int denom11 = 2;
        int numer21 = 3;
        int denom21 = 4;
        int[] expected1 = {5, 4};
        int[] result1 = solution(numer11, denom11, numer21, denom21);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int numer12 = 9;
        int denom12 = 2;
        int numer22 = 1;
        int denom22 = 3;
        int[] expected2 = {29, 6};
        int[] result2 = solution(numer12, denom12, numer22, denom22);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        return answer;
    }
}
