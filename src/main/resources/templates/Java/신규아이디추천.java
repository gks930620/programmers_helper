public class 신규아이디추천 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String new_id1 = "...!@BaT#*..y.abcdefghijklm";
        String expected1 = "bat.y.abcdefghi";
        String result1 = solution(new_id1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String new_id2 = "z-+.^.";
        String expected2 = "z--";
        String result2 = solution(new_id2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String new_id3 = "=.=";
        String expected3 = "aaa";
        String result3 = solution(new_id3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + expected3.equals(result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        String new_id4 = "123_.def";
        String expected4 = "123_.def";
        String result4 = solution(new_id4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + expected4.equals(result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        String new_id5 = "abcdefghijklmn.p";
        String expected5 = "abcdefghijklmn";
        String result5 = solution(new_id5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + expected5);
        System.out.println("결과값  : " + result5);
        System.out.println("비교    : " + expected5.equals(result5));

    }

    public static String solution(String new_id) {
        String answer = "";
        return answer;
    }
}
