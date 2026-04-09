public class 이차원배열대각선순회하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] board1 = {{0, 1, 2},{1, 2, 3},{2, 3, 4},{3, 4, 5}};
        int k1 = 2;
        int expected1 = 8;
        int result1 = solution(board1, k1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));

    }

    public static int solution(int[][] board, int k) {
        int answer = 0;
        return answer;
    }
}
