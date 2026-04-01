public class 블록이동하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] board1 = {{0, 0, 0, 1, 1},{0, 0, 0, 1, 0},{0, 1, 0, 1, 1},{1, 1, 0, 0, 1},{0, 0, 0, 0, 0}};
        int expected1 = 7;
        int result1 = solution(board1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));

    }

    public static int solution(int[][] board) {
        int answer = 0;
        return answer;
    }
}
