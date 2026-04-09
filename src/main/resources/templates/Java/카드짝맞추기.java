public class 카드짝맞추기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] board1 = {{1,0,0,3},{2,0,0,0},{0,0,0,2},{3,0,1,0}};
        int r1 = 1;
        int c1 = 0;
        int expected1 = 14;
        int result1 = solution(board1, r1, c1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[][] board2 = {{3,0,0,2},{0,0,1,0},{0,1,0,0},{2,0,0,3}};
        int r2 = 0;
        int c2 = 1;
        int expected2 = 16;
        int result2 = solution(board2, r2, c2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int[][] board, int r, int c) {
        int answer = 0;
        return answer;
    }
}
