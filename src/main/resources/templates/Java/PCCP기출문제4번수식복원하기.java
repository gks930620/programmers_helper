import java.util.Arrays;

public class PCCP기출문제4번수식복원하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] expressions1 = {"14 + 3 = 17", "13 - 6 = X", "51 - 5 = 44"};
        String[] expected1 = {"13 - 6 = 5"};
        String[] result1 = solution(expressions1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] expressions2 = {"1 + 1 = 2", "1 + 3 = 4", "1 + 5 = X", "1 + 2 = X"};
        String[] expected2 = {"1 + 5 = ?", "1 + 2 = 3"};
        String[] result2 = solution(expressions2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String[] expressions3 = {"10 - 2 = X", "30 + 31 = 101", "3 + 3 = X", "33 + 33 = X"};
        String[] expected3 = {"10 - 2 = 4", "3 + 3 = 10", "33 + 33 = 110"};
        String[] result3 = solution(expressions3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        String[] expressions4 = {"2 - 1 = 1", "2 + 2 = X", "7 + 4 = X", "5 - 5 = X"};
        String[] expected4 = {"2 + 2 = 4", "7 + 4 = ?", "5 - 5 = 0"};
        String[] result4 = solution(expressions4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + Arrays.toString(expected4));
        System.out.println("결과값  : " + Arrays.toString(result4));
        System.out.println("비교    : " + Arrays.equals(expected4, result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        String[] expressions5 = {"2 - 1 = 1", "2 + 2 = X", "7 + 4 = X", "8 + 4 = X"};
        String[] expected5 = {"2 + 2 = 4", "7 + 4 = 12", "8 + 4 = 13"};
        String[] result5 = solution(expressions5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + Arrays.toString(expected5));
        System.out.println("결과값  : " + Arrays.toString(result5));
        System.out.println("비교    : " + Arrays.equals(expected5, result5));

    }

    public static String[] solution(String[] expressions) {
        String[] answer = {};
        return answer;
    }
}
