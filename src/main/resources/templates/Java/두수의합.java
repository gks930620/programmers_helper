public class 두수의합 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String a1 = "582";
        String b1 = "734";
        String expected1 = "1316";
        String result1 = solution(a1, b1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String a2 = "18446744073709551615";
        String b2 = "287346502836570928366";
        String expected2 = "305793246910280479981";
        String result2 = solution(a2, b2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String a3 = "0";
        String b3 = "0";
        String expected3 = "0";
        String result3 = solution(a3, b3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + expected3.equals(result3));

    }

    public static String solution(String a, String b) {
        String answer = "";
        return answer;
    }
}
