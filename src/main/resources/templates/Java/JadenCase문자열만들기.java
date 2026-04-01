public class JadenCase문자열만들기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String s1 = "3people unFollowed me";
        String expected1 = "3people Unfollowed Me";
        String result1 = solution(s1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String s2 = "for the last week";
        String expected2 = "For The Last Week";
        String result2 = solution(s2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));

    }

    public static String solution(String s) {
        String answer = "";
        return answer;
    }
}
