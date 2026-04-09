public class 1차뉴스클러스터링 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String str11 = "FRANCE";
        String str21 = "french";
        int expected1 = 16384;
        int result1 = solution(str11, str21);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String str12 = "handshake";
        String str22 = "shake hands";
        int expected2 = 65536;
        int result2 = solution(str12, str22);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String str13 = "aa1+aa2";
        String str23 = "AAAA12";
        int expected3 = 43690;
        int result3 = solution(str13, str23);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        String str14 = "E=M*C^2";
        String str24 = "e=m*c^2";
        int expected4 = 65536;
        int result4 = solution(str14, str24);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));

    }

    public static int solution(String str1, String str2) {
        int answer = 0;
        return answer;
    }
}
