public class 조건문자열 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String ineq1 = "<";
        String eq1 = "=";
        int n1 = 20;
        int m1 = 50;
        int expected1 = 1;
        int result1 = solution(ineq1, eq1, n1, m1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String ineq2 = ">";
        String eq2 = "!";
        int n2 = 41;
        int m2 = 78;
        int expected2 = 0;
        int result2 = solution(ineq2, eq2, n2, m2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        return answer;
    }
}
