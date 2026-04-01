public class 수식최대화 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String expression1 = "100-200*300-500+20";
        long expected1 = 60420L;
        long result1 = solution(expression1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String expression2 = "50*6-3*2";
        long expected2 = 300L;
        long result2 = solution(expression2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static long solution(String expression) {
        long answer = 0;
        return answer;
    }
}
