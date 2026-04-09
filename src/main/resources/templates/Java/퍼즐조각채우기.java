public class 퍼즐조각채우기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] game_board1 = {{1,1,0,0,1,0},{0,0,1,0,1,0},{0,1,1,0,0,1},{1,1,0,1,1,1},{1,0,0,0,1,0},{0,1,1,1,0,0}};
        int[][] table1 = {{1,0,0,1,1,0},{1,0,1,0,1,0},{0,1,1,0,1,1},{0,0,1,0,0,0},{1,1,0,1,1,0},{0,1,0,0,0,0}};
        int expected1 = 14;
        int result1 = solution(game_board1, table1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[][] game_board2 = {{0,0,0},{1,1,0},{1,1,1}};
        int[][] table2 = {{1,1,1},{1,0,0},{0,0,0}};
        int expected2 = 0;
        int result2 = solution(game_board2, table2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int[][] game_board, int[][] table) {
        int answer = -1;
        return answer;
    }
}
