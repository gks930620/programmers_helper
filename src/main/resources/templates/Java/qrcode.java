public class qrcode {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int q1 = 3;
        int r1 = 1;
        String code1 = "qjnwezgrpirldywt";
        String expected1 = "jerry";
        String result1 = solution(q1, r1, code1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int q2 = 1;
        int r2 = 0;
        String code2 = "programmers";
        String expected2 = "programmers";
        String result2 = solution(q2, r2, code2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));

    }

    public static String solution(int q, int r, String code) {
        String answer = "";
        return answer;
    }
}
