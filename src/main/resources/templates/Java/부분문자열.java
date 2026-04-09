public class 부분문자열 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String str11 = "abc";
        String str21 = "aabcc";
        int expected1 = 1;
        int result1 = solution(str11, str21);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String str12 = "tbt";
        String str22 = "tbbttb";
        int expected2 = 0;
        int result2 = solution(str12, str22);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(String str1, String str2) {
        int answer = 0;
        return answer;
    }
}
