public class 시저암호 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String s1 = "AB";
        int n1 = 1;
        String expected1 = "BC";
        String result1 = solution(s1, n1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String s2 = "z";
        int n2 = 1;
        String expected2 = "a";
        String result2 = solution(s2, n2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String s3 = "a B z";
        int n3 = 4;
        String expected3 = "e F d";
        String result3 = solution(s3, n3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + expected3.equals(result3));

    }

    public static String solution(String s, int n) {
        String answer = "";
        return answer;
    }
}
