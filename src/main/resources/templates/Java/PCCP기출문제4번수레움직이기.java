public class PCCP기출문제4번수레움직이기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] maze1 = 0;
        int expected1 = 빈칸;
        int result1 = solution(maze1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[][] maze2 = 1;
        int expected2 = 빨간 수레의 시작 칸;
        int result2 = solution(maze2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[][] maze3 = 2;
        int expected3 = 파란 수레의 시작 칸;
        int result3 = solution(maze3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int[][] maze4 = 3;
        int expected4 = 빨간 수레의 도착 칸;
        int result4 = solution(maze4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        int[][] maze5 = 4;
        int expected5 = 파란 수레의 도착 칸;
        int result5 = solution(maze5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + expected5);
        System.out.println("결과값  : " + result5);
        System.out.println("비교    : " + (expected5 == result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        int[][] maze6 = 5;
        int expected6 = 벽;
        int result6 = solution(maze6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + expected6);
        System.out.println("결과값  : " + result6);
        System.out.println("비교    : " + (expected6 == result6));
        System.out.println();

        // --- 테스트 케이스 7 ---
        int[][] maze7 = maze;
        int expected7 = result;
        int result7 = solution(maze7);

        System.out.println("--- Test Case 7 ---");
        System.out.println("기대값  : " + expected7);
        System.out.println("결과값  : " + result7);
        System.out.println("비교    : " + (expected7 == result7));
        System.out.println();

        // --- 테스트 케이스 8 ---
        int[][] maze8 = ---;
        int expected8 = ---;
        int result8 = solution(maze8);

        System.out.println("--- Test Case 8 ---");
        System.out.println("기대값  : " + expected8);
        System.out.println("결과값  : " + result8);
        System.out.println("비교    : " + (expected8 == result8));
        System.out.println();

        // --- 테스트 케이스 9 ---
        int[][] maze9 = {{1, 4}, {0, 0}, {2, 3}};
        int expected9 = 3;
        int result9 = solution(maze9);

        System.out.println("--- Test Case 9 ---");
        System.out.println("기대값  : " + expected9);
        System.out.println("결과값  : " + result9);
        System.out.println("비교    : " + (expected9 == result9));
        System.out.println();

        // --- 테스트 케이스 10 ---
        int[][] maze10 = {{1, 0, 2}, {0, 0, 0}, {5, 0 ,5}, {4, 0, 3}};
        int expected10 = 7;
        int result10 = solution(maze10);

        System.out.println("--- Test Case 10 ---");
        System.out.println("기대값  : " + expected10);
        System.out.println("결과값  : " + result10);
        System.out.println("비교    : " + (expected10 == result10));
        System.out.println();

        // --- 테스트 케이스 11 ---
        int[][] maze11 = {{1, 5}, {2, 5}, {4, 5}, {3, 5}};
        int expected11 = 0;
        int result11 = solution(maze11);

        System.out.println("--- Test Case 11 ---");
        System.out.println("기대값  : " + expected11);
        System.out.println("결과값  : " + result11);
        System.out.println("비교    : " + (expected11 == result11));
        System.out.println();

        // --- 테스트 케이스 12 ---
        int[][] maze12 = {{4, 1, 2, 3}};
        int expected12 = 0;
        int result12 = solution(maze12);

        System.out.println("--- Test Case 12 ---");
        System.out.println("기대값  : " + expected12);
        System.out.println("결과값  : " + result12);
        System.out.println("비교    : " + (expected12 == result12));

    }

    public static int solution(int[][] maze) {
        int answer = 0;
        return answer;
    }
}
