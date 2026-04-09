import java.util.Arrays;

public class 아이스아메리카노 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int money1 = 5500;
        int[] expected1 = {1, 0};
        int[] result1 = solution(money1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int money2 = 15000;
        int[] expected2 = {2, 4000};
        int[] result2 = solution(money2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static int[] solution(int money) {
        int[] answer = {};
        return answer;
    }
}
