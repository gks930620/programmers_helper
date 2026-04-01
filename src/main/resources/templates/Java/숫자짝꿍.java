public class 숫자짝꿍 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String X1 = "100";
        String Y1 = "2345";
        String expected1 = "-1";
        String result1 = solution(X1, Y1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String X2 = "100";
        String Y2 = "203045";
        String expected2 = "0";
        String result2 = solution(X2, Y2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String X3 = "100";
        String Y3 = "123450";
        String expected3 = "10";
        String result3 = solution(X3, Y3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + expected3.equals(result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        String X4 = "12321";
        String Y4 = "42531";
        String expected4 = "321";
        String result4 = solution(X4, Y4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + expected4.equals(result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        String X5 = "5525";
        String Y5 = "1255";
        String expected5 = "552";
        String result5 = solution(X5, Y5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + expected5);
        System.out.println("결과값  : " + result5);
        System.out.println("비교    : " + expected5.equals(result5));

    }

    public static String solution(String X, String Y) {
        String answer = "";
        return answer;
    }
}
