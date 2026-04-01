public class 리코쳇로봇 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] board1 = {"...D..R", ".D.G...", "....D.D", "D....D.", "..D...."};
        int expected1 = 7;
        int result1 = solution(board1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] board2 = {".D.R", "....", ".G..", "...D"};
        int expected2 = -1;
        int result2 = solution(board2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(String[] board) {
        int answer = 0;
        return answer;
    }
}
