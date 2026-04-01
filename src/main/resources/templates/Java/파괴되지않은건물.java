public class 파괴되지않은건물 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] board1 = {{5,5,5,5,5},{5,5,5,5,5},{5,5,5,5,5},{5,5,5,5,5}};
        int[][] skill1 = {{1,0,0,3,4,4},{1,2,0,2,3,2},{2,1,0,3,1,2},{1,0,1,3,3,1}};
        int expected1 = 10;
        int result1 = solution(board1, skill1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[][] board2 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] skill2 = {{1,1,1,2,2,4},{1,0,0,1,1,2},{2,2,0,2,0,100}};
        int expected2 = 6;
        int result2 = solution(board2, skill2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int[][] board, int[][] skill) {
        int answer = 0;
        return answer;
    }
}
