public class 모음사전 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String word1 = "AAAAE";
        int expected1 = 6;
        int result1 = solution(word1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String word2 = "AAAE";
        int expected2 = 10;
        int result2 = solution(word2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String word3 = "I";
        int expected3 = 1563;
        int result3 = solution(word3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        String word4 = "EIO";
        int expected4 = 1189;
        int result4 = solution(word4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));

    }

    public static int solution(String word) {
        int answer = 0;
        return answer;
    }
}
