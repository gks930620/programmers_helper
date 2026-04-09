public class 봉인된주문 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        long n1 = 30L;
        String[] bans1 = {"d", "e", "bb", "aa", "ae"};
        String expected1 = "ah";
        String result1 = solution(n1, bans1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        long n2 = 7388L;
        String[] bans2 = {"gqk", "kdn", "jxj", "jxi", "fug", "jxg", "ewq", "len", "bhc"};
        String expected2 = "jxk";
        String result2 = solution(n2, bans2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        long n3 = 그룹L;
        String[] bans3 = 총점;
        String expected3 = "추가 제한 사항";
        String result3 = solution(n3, bans3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + expected3.equals(result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        long n4 = ---L;
        String[] bans4 = ---;
        String expected4 = "---";
        String result4 = solution(n4, bans4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + expected4.equals(result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        long n5 = #1L;
        String[] bans5 = 15%;
        String expected5 = "n≤ 1,000,bans의 길이 ≤ 100";
        String result5 = solution(n5, bans5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + expected5);
        System.out.println("결과값  : " + result5);
        System.out.println("비교    : " + expected5.equals(result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        long n6 = #2L;
        String[] bans6 = 15%;
        String expected6 = "n≤ 1,000,000";
        String result6 = solution(n6, bans6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + expected6);
        System.out.println("결과값  : " + result6);
        System.out.println("비교    : " + expected6.equals(result6));
        System.out.println();

        // --- 테스트 케이스 7 ---
        long n7 = #3L;
        String[] bans7 = 70%;
        String expected7 = "추가 제한 사항 없음";
        String result7 = solution(n7, bans7);

        System.out.println("--- Test Case 7 ---");
        System.out.println("기대값  : " + expected7);
        System.out.println("결과값  : " + result7);
        System.out.println("비교    : " + expected7.equals(result7));

    }

    public static String solution(long n, String[] bans) {
        String answer = "";
        return answer;
    }
}
