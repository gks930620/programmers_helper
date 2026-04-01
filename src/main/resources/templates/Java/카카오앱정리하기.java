import java.util.Arrays;

public class 카카오앱정리하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] board1 = #1;
        int[][] commands1 = 5%;
        int[][] expected1 = 1x1 크기의 앱 1개만 존재합니다.;
        int[][] result1 = solution(board1, commands1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected1));
        System.out.println("결과값  : " + Arrays.deepToString(result1));
        System.out.println("비교    : " + Arrays.deepEquals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[][] board2 = #2;
        int[][] commands2 = 10%;
        int[][] expected2 = 2x2 크기의 앱 1개만 존재합니다.;
        int[][] result2 = solution(board2, commands2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected2));
        System.out.println("결과값  : " + Arrays.deepToString(result2));
        System.out.println("비교    : " + Arrays.deepEquals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[][] board3 = #3;
        int[][] commands3 = 15%;
        int[][] expected3 = 모든 앱의 크기가 1x1입니다.;
        int[][] result3 = solution(board3, commands3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected3));
        System.out.println("결과값  : " + Arrays.deepToString(result3));
        System.out.println("비교    : " + Arrays.deepEquals(expected3, result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int[][] board4 = #4;
        int[][] commands4 = 20%;
        int[][] expected4 = 앱이 격자 밖으로 이동하는 명령이 주어지지 않습니다.;
        int[][] result4 = solution(board4, commands4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected4));
        System.out.println("결과값  : " + Arrays.deepToString(result4));
        System.out.println("비교    : " + Arrays.deepEquals(expected4, result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        int[][] board5 = #5;
        int[][] commands5 = 50%;
        int[][] expected5 = 추가 제한 사항 없음;
        int[][] result5 = solution(board5, commands5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected5));
        System.out.println("결과값  : " + Arrays.deepToString(result5));
        System.out.println("비교    : " + Arrays.deepEquals(expected5, result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        int[][] board6 = board;
        int[][] commands6 = commands;
        int[][] expected6 = result;
        int[][] result6 = solution(board6, commands6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected6));
        System.out.println("결과값  : " + Arrays.deepToString(result6));
        System.out.println("비교    : " + Arrays.deepEquals(expected6, result6));
        System.out.println();

        // --- 테스트 케이스 7 ---
        int[][] board7 = ---;
        int[][] commands7 = ---;
        int[][] expected7 = ---;
        int[][] result7 = solution(board7, commands7);

        System.out.println("--- Test Case 7 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected7));
        System.out.println("결과값  : " + Arrays.deepToString(result7));
        System.out.println("비교    : " + Arrays.deepEquals(expected7, result7));
        System.out.println();

        // --- 테스트 케이스 8 ---
        int[][] board8 = {{0, 2, 2, 0, 0, 0, 0, 0}, {0, 2, 2, 0, 0, 4, 4, 0}, {0, 3, 3, 3, 1, 4, 4, 0}, {0, 3, 3, 3, 0, 0, 0, 0}, {0, 3, 3, 3, 5, 5, 6, 0}, {0, 0, 0, 0, 5, 5, 0, 0}};
        int[][] commands8 = {{3, 1}, {3, 1}};
        int[][] expected8 = {{0, 0, 2, 2, 0, 0, 0, 0}, {4, 4, 2, 2, 0, 0, 0, 0}, {4, 4, 0, 3, 3, 3, 1, 0}, {0, 0, 0, 3, 3, 3, 0, 0}, {6, 0, 0, 3, 3, 3, 5, 5}, {0, 0, 0, 0, 0, 0, 5, 5}};
        int[][] result8 = solution(board8, commands8);

        System.out.println("--- Test Case 8 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected8));
        System.out.println("결과값  : " + Arrays.deepToString(result8));
        System.out.println("비교    : " + Arrays.deepEquals(expected8, result8));
        System.out.println();

        // --- 테스트 케이스 9 ---
        int[][] board9 = {{0, 9, 1, 1, 6, 0, 0, 0}, {2, 2, 1, 1, 0, 0, 0, 0}, {2, 2, 3, 4, 4, 4, 0, 0}, {5, 0, 0, 4, 4, 4, 7, 0}, {0, 0, 0, 4, 4, 4, 8, 8}, {0, 0, 0, 0, 0, 0, 8, 8}};
        int[][] commands9 = {{2, 1}, {3, 1}, {9, 2}, {4, 1}};
        int[][] expected9 = {{8, 8, 0, 1, 1, 6, 0, 0}, {8, 8, 0, 1, 1, 0, 0, 0}, {4, 4, 4, 9, 3, 0, 0, 0}, {4, 4, 4, 7, 2, 2, 0, 0}, {4, 4, 4, 0, 2, 2, 0, 0}, {0, 5, 0, 0, 0, 0, 0, 0}};
        int[][] result9 = solution(board9, commands9);

        System.out.println("--- Test Case 9 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected9));
        System.out.println("결과값  : " + Arrays.deepToString(result9));
        System.out.println("비교    : " + Arrays.deepEquals(expected9, result9));
        System.out.println();

        // --- 테스트 케이스 10 ---
        int[][] board10 = {{1, 1, 0}, {1, 1, 0}};
        int[][] commands10 = {{1, 4}, {1, 3}, {1, 2}};
        int[][] expected10 = {{0, 1, 1}, {0, 1, 1}};
        int[][] result10 = solution(board10, commands10);

        System.out.println("--- Test Case 10 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected10));
        System.out.println("결과값  : " + Arrays.deepToString(result10));
        System.out.println("비교    : " + Arrays.deepEquals(expected10, result10));

    }

    public static int[][] solution(int[][] board, int[][] commands) {
        int[][] answer = {};
        return answer;
    }
}
