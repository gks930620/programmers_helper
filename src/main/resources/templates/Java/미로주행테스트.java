public class 미로주행테스트 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = #1;
        int m1 = (2 3);
        int[][] tests1 = 2;
        long expected1 = OL;
        long result1 = solution(n1, m1, tests1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = #2;
        int m2 = (1 0);
        int[][] tests2 = 4;
        long expected2 = XL;
        long result2 = solution(n2, m2, tests2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int n3 = #3;
        int m3 = (0 4);
        int[][] tests3 = 1;
        long expected3 = XL;
        long result3 = solution(n3, m3, tests3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int n4 = n;
        int m4 = m;
        int[][] tests4 = tests;
        long expected4 = resultL;
        long result4 = solution(n4, m4, tests4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        int n5 = ---;
        int m5 = ---;
        int[][] tests5 = ---;
        long expected5 = ---L;
        long result5 = solution(n5, m5, tests5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + expected5);
        System.out.println("결과값  : " + result5);
        System.out.println("비교    : " + (expected5 == result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        int n6 = 3;
        int m6 = 5;
        int[][] tests6 = {{2, 3, 2, 1}, {1, 0, 4, 0}, {0, 4, 1, 0}};
        long expected6 = 4L;
        long result6 = solution(n6, m6, tests6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + expected6);
        System.out.println("결과값  : " + result6);
        System.out.println("비교    : " + (expected6 == result6));
        System.out.println();

        // --- 테스트 케이스 7 ---
        int n7 = 99999;
        int m7 = 99999;
        int[][] tests7 = {{0, 0, 199997, 1}};
        long expected7 = 9999999999L;
        long result7 = solution(n7, m7, tests7);

        System.out.println("--- Test Case 7 ---");
        System.out.println("기대값  : " + expected7);
        System.out.println("결과값  : " + result7);
        System.out.println("비교    : " + (expected7 == result7));
        System.out.println();

        // --- 테스트 케이스 8 ---
        int n8 = 99999;
        int m8 = 99999;
        int[][] tests8 = {{50000, 50000, 3, 0}};
        long expected8 = 9999999975L;
        long result8 = solution(n8, m8, tests8);

        System.out.println("--- Test Case 8 ---");
        System.out.println("기대값  : " + expected8);
        System.out.println("결과값  : " + result8);
        System.out.println("비교    : " + (expected8 == result8));
        System.out.println();

        // --- 테스트 케이스 9 ---
        int n9 = 300;
        int m9 = 100;
        int[][] tests9 = {{123, 28, 124, 1}, {183, 22, 34, 0}, {188, 81, 116, 1}, {167, 53, 33, 0}, {125, 55, 20, 0}};
        long expected9 = 6535L;
        long result9 = solution(n9, m9, tests9);

        System.out.println("--- Test Case 9 ---");
        System.out.println("기대값  : " + expected9);
        System.out.println("결과값  : " + result9);
        System.out.println("비교    : " + (expected9 == result9));

    }

    public static long solution(int n, int m, int[][] tests) {
        long answer = 0;
        return answer;
    }
}
