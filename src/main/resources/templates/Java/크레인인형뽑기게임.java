public class 크레인인형뽑기게임 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] board1 = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves1 = {1,5,3,5,1,2,1,4};
        int expected1 = 4;
        int result1 = solution(board1, moves1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));

    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        return answer;
    }
}
