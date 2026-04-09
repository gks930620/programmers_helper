public class 문자열로변환 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 123;
        String expected1 = "123";
        String result1 = solution(n1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 2573;
        String expected2 = "2573";
        String result2 = solution(n2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));

    }

    public static String solution(int n) {
        String answer = "";
        return answer;
    }
}
