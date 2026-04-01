import java.util.Arrays;

public class 세개의구분자 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String myStr1 = "baconlettucetomato";
        String[] expected1 = {"onlettu", "etom", "to"};
        String[] result1 = solution(myStr1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String myStr2 = "abcd";
        String[] expected2 = {"d"};
        String[] result2 = solution(myStr2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String myStr3 = "cabab";
        String[] expected3 = {"EMPTY"};
        String[] result3 = solution(myStr3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));

    }

    public static String[] solution(String myStr) {
        String[] answer = {};
        return answer;
    }
}
