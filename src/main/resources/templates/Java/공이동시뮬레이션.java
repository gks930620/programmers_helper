public class 공이동시뮬레이션 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 2;
        int m1 = 2;
        int x1 = 0;
        int y1 = 0;
        int[][] queries1 = {{2,1},{0,1},{1,1},{0,1},{2,1}};
        long expected1 = 4L;
        long result1 = solution(n1, m1, x1, y1, queries1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 2;
        int m2 = 5;
        int x2 = 0;
        int y2 = 1;
        int[][] queries2 = {{3,1},{2,2},{1,1},{2,3},{0,1},{2,1}};
        long expected2 = 2L;
        long result2 = solution(n2, m2, x2, y2, queries2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static long solution(int n, int m, int x, int y, int[][] queries) {
        long answer = -1;
        return answer;
    }
}
