import java.util.Arrays;

public class 개인정보수집유효기간 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String today1 = "A";
        int[] expected1 = 6 달;
        int[] result1 = solution(today1, terms1, privacies1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String today2 = "B";
        int[] expected2 = 12 달;
        int[] result2 = solution(today2, terms2, privacies2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String today3 = "C";
        int[] expected3 = 3 달;
        int[] result3 = solution(today3, terms3, privacies3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        String today4 = "약관 종류";
        int[] expected4 = 유효기간;
        int[] result4 = solution(today4, terms4, privacies4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + Arrays.toString(expected4));
        System.out.println("결과값  : " + Arrays.toString(result4));
        System.out.println("비교    : " + Arrays.equals(expected4, result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        String today5 = "---";
        int[] expected5 = ---;
        int[] result5 = solution(today5, terms5, privacies5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + Arrays.toString(expected5));
        System.out.println("결과값  : " + Arrays.toString(result5));
        System.out.println("비교    : " + Arrays.equals(expected5, result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        String today6 = "Z";
        int[] expected6 = 3 달;
        int[] result6 = solution(today6, terms6, privacies6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + Arrays.toString(expected6));
        System.out.println("결과값  : " + Arrays.toString(result6));
        System.out.println("비교    : " + Arrays.equals(expected6, result6));
        System.out.println();

        // --- 테스트 케이스 7 ---
        String today7 = "D";
        int[] expected7 = 5 달;
        int[] result7 = solution(today7, terms7, privacies7);

        System.out.println("--- Test Case 7 ---");
        System.out.println("기대값  : " + Arrays.toString(expected7));
        System.out.println("결과값  : " + Arrays.toString(result7));
        System.out.println("비교    : " + Arrays.equals(expected7, result7));

    }

    public static int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        return answer;
    }
}
