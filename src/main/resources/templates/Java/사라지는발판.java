public class 사라지는발판 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] board1 = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        int[] aloc1 = {1, 0};
        int[] bloc1 = {1, 2};
        int expected1 = 5;
        int result1 = solution(board1, aloc1, bloc1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[][] board2 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[] aloc2 = {1, 0};
        int[] bloc2 = {1, 2};
        int expected2 = 4;
        int result2 = solution(board2, aloc2, bloc2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[][] board3 = {{1, 1, 1, 1, 1}};
        int[] aloc3 = {0, 0};
        int[] bloc3 = {0, 4};
        int expected3 = 4;
        int result3 = solution(board3, aloc3, bloc3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int[][] board4 = {{1}};
        int[] aloc4 = {0, 0};
        int[] bloc4 = {0, 0};
        int expected4 = 0;
        int result4 = solution(board4, aloc4, bloc4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));

    }

    public static int solution(int[][] board, int[] aloc, int[] bloc) {
        int answer = -1;
        return answer;
    }
}
