public class 문자열섞기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String str11 = "aaaaa";
        String str21 = "bbbbb";
        String expected1 = "ababababab";
        String result1 = solution(str11, str21);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));

    }

    public static String solution(String str1, String str2) {
        String answer = "";
        return answer;
    }
}
