public class 다항식더하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String polynomial1 = "3x + 7 + x";
        String expected1 = "4x + 7";
        String result1 = solution(polynomial1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String polynomial2 = "x + x + x";
        String expected2 = "3x";
        String result2 = solution(polynomial2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));

    }

    public static String solution(String polynomial) {
        String answer = "";
        return answer;
    }
}
