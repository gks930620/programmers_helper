import java.util.Arrays;

public class OX퀴즈 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] quiz1 = {"3 - 4 = -3", "5 + 6 = 11"};
        String[] expected1 = {"X", "O"};
        String[] result1 = solution(quiz1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] quiz2 = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
        String[] expected2 = {"O", "O", "X", "O"};
        String[] result2 = solution(quiz2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static String[] solution(String[] quiz) {
        String[] answer = {};
        return answer;
    }
}
