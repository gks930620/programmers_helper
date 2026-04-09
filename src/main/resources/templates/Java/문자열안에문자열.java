public class 문자열안에문자열 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String str11 = "ab6CDE443fgh22iJKlmn1o";
        String str21 = "6CD";
        int expected1 = 1;
        int result1 = solution(str11, str21);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String str12 = "ppprrrogrammers";
        String str22 = "pppp";
        int expected2 = 2;
        int result2 = solution(str12, str22);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String str13 = "AbcAbcA";
        String str23 = "AAA";
        int expected3 = 2;
        int result3 = solution(str13, str23);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(String str1, String str2) {
        int answer = 0;
        return answer;
    }
}
