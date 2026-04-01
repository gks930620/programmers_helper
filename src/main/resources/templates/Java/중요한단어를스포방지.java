public class 중요한단어를스포방지 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String message1 = "#1";
        int[][] spoiler_ranges1 = 7%;
        int expected1 = message의 모든 단어는 중복없이 한 번씩만 등장합니다.;
        int result1 = solution(message1, spoiler_ranges1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String message2 = "#2";
        int[][] spoiler_ranges2 = 13%;
        int expected2 = 모든 스포 방지 구간은 각각 정확히 한 단어의 시작과 끝을 가리킵니다.spoiler_ranges의 길이 = 1;
        int result2 = solution(message2, spoiler_ranges2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String message3 = "#3";
        int[][] spoiler_ranges3 = 45%;
        int expected3 = 모든 스포 방지 구간은 각각 정확히 한 단어의 시작과 끝을 가리킵니다.;
        int result3 = solution(message3, spoiler_ranges3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        String message4 = "#4";
        int[][] spoiler_ranges4 = 35%;
        int expected4 = 추가 제한 사항 없음;
        int result4 = solution(message4, spoiler_ranges4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        String message5 = "message";
        int[][] spoiler_ranges5 = spoiler_ranges;
        int expected5 = result;
        int result5 = solution(message5, spoiler_ranges5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + expected5);
        System.out.println("결과값  : " + result5);
        System.out.println("비교    : " + (expected5 == result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        String message6 = "---";
        int[][] spoiler_ranges6 = ---;
        int expected6 = ---;
        int result6 = solution(message6, spoiler_ranges6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + expected6);
        System.out.println("결과값  : " + result6);
        System.out.println("비교    : " + (expected6 == result6));
        System.out.println();

        // --- 테스트 케이스 7 ---
        String message7 = "here is muzi here is a secret message";
        int[][] spoiler_ranges7 = {{0, 3}, {23, 28}};
        int expected7 = 1;
        int result7 = solution(message7, spoiler_ranges7);

        System.out.println("--- Test Case 7 ---");
        System.out.println("기대값  : " + expected7);
        System.out.println("결과값  : " + result7);
        System.out.println("비교    : " + (expected7 == result7));
        System.out.println();

        // --- 테스트 케이스 8 ---
        String message8 = "my phone number is 01012345678 and may i have your phone number";
        int[][] spoiler_ranges8 = {{5, 5}, {25, 28}, {34, 40}, {53, 59}};
        int expected8 = 4;
        int result8 = solution(message8, spoiler_ranges8);

        System.out.println("--- Test Case 8 ---");
        System.out.println("기대값  : " + expected8);
        System.out.println("결과값  : " + result8);
        System.out.println("비교    : " + (expected8 == result8));

    }

    public static int solution(String message, int[][] spoiler_ranges) {
        int answer = 0;
        return answer;
    }
}
