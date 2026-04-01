public class 혼자서하는틱택토 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] board1 = {"O.X", ".O.", "..X"};
        int expected1 = 1;
        int result1 = solution(board1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] board2 = {"OOO", "...", "XXX"};
        int expected2 = 0;
        int result2 = solution(board2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String[] board3 = {"...", ".X.", "..."};
        int expected3 = 0;
        int result3 = solution(board3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        String[] board4 = {"...", "...", "..."};
        int expected4 = 1;
        int result4 = solution(board4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));

    }

    public static int solution(String[] board) {
        int answer = -1;
        return answer;
    }
}
