public class 암호해독 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String cipher1 = "dfjardstddetckdaccccdegk";
        int code1 = 4;
        String expected1 = "attack";
        String result1 = solution(cipher1, code1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String cipher2 = "pfqallllabwaoclk";
        int code2 = 2;
        String expected2 = "fallback";
        String result2 = solution(cipher2, code2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));

    }

    public static String solution(String cipher, int code) {
        String answer = "";
        return answer;
    }
}
