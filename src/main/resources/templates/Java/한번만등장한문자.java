public class 한번만등장한문자 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String s1 = "abcabcadc";
        String expected1 = "d";
        String result1 = solution(s1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String s2 = "abdc";
        String expected2 = "abcd";
        String result2 = solution(s2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String s3 = "hello";
        String expected3 = "eho";
        String result3 = solution(s3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + expected3.equals(result3));

    }

    public static String solution(String s) {
        String answer = "";
        return answer;
    }
}
