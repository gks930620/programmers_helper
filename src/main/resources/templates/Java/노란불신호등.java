public class 노란불신호등 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] signals1 = 1번;
        int expected1 = 2초;
        int result1 = solution(signals1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[][] signals2 = 2번;
        int expected2 = 1초;
        int result2 = solution(signals2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[][] signals3 = 신호등;
        int expected3 = 빨간불;
        int result3 = solution(signals3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int[][] signals4 = ---;
        int expected4 = ---;
        int result4 = solution(signals4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        int[][] signals5 = 1번;
        int expected5 = 2초;
        int result5 = solution(signals5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + expected5);
        System.out.println("결과값  : " + result5);
        System.out.println("비교    : " + (expected5 == result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        int[][] signals6 = 2번;
        int expected6 = 3초;
        int result6 = solution(signals6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + expected6);
        System.out.println("결과값  : " + result6);
        System.out.println("비교    : " + (expected6 == result6));
        System.out.println();

        // --- 테스트 케이스 7 ---
        int[][] signals7 = 3번;
        int expected7 = 1초;
        int result7 = solution(signals7);

        System.out.println("--- Test Case 7 ---");
        System.out.println("기대값  : " + expected7);
        System.out.println("결과값  : " + result7);
        System.out.println("비교    : " + (expected7 == result7));
        System.out.println();

        // --- 테스트 케이스 8 ---
        int[][] signals8 = 신호등;
        int expected8 = 빨간불;
        int result8 = solution(signals8);

        System.out.println("--- Test Case 8 ---");
        System.out.println("기대값  : " + expected8);
        System.out.println("결과값  : " + result8);
        System.out.println("비교    : " + (expected8 == result8));
        System.out.println();

        // --- 테스트 케이스 9 ---
        int[][] signals9 = ---;
        int expected9 = ---;
        int result9 = solution(signals9);

        System.out.println("--- Test Case 9 ---");
        System.out.println("기대값  : " + expected9);
        System.out.println("결과값  : " + result9);
        System.out.println("비교    : " + (expected9 == result9));
        System.out.println();

        // --- 테스트 케이스 10 ---
        int[][] signals10 = 1번;
        int expected10 = 3초;
        int result10 = solution(signals10);

        System.out.println("--- Test Case 10 ---");
        System.out.println("기대값  : " + expected10);
        System.out.println("결과값  : " + result10);
        System.out.println("비교    : " + (expected10 == result10));
        System.out.println();

        // --- 테스트 케이스 11 ---
        int[][] signals11 = 2번;
        int expected11 = 2초;
        int result11 = solution(signals11);

        System.out.println("--- Test Case 11 ---");
        System.out.println("기대값  : " + expected11);
        System.out.println("결과값  : " + result11);
        System.out.println("비교    : " + (expected11 == result11));
        System.out.println();

        // --- 테스트 케이스 12 ---
        int[][] signals12 = 3번;
        int expected12 = 2초;
        int result12 = solution(signals12);

        System.out.println("--- Test Case 12 ---");
        System.out.println("기대값  : " + expected12);
        System.out.println("결과값  : " + result12);
        System.out.println("비교    : " + (expected12 == result12));

    }

    public static int solution(int[][] signals) {
        int answer = 0;
        return answer;
    }
}
