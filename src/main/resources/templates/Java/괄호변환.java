public class 괄호변환 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String p1 = "(()())()";
        String expected1 = "(()())()";
        String result1 = solution(p1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String p2 = ")(";
        String expected2 = "()";
        String result2 = solution(p2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String p3 = "()))((()";
        String expected3 = "()(())()";
        String result3 = solution(p3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + expected3.equals(result3));

    }

    public static String solution(String p) {
        String answer = "";
        return answer;
    }
}
