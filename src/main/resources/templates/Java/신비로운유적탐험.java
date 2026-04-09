public class 신비로운유적탐험 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n11 = n1;
        int expected1 = 8;
        int result1 = solution(n11, g11, n21, g21);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n12 = g1;
        int expected2 = [[3 1] [5 7] [8 7] [2 3] [3 6] [1 5] [4 3]];
        int result2 = solution(n12, g12, n22, g22);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int n13 = n2;
        int expected3 = 9;
        int result3 = solution(n13, g13, n23, g23);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int n14 = g2;
        int expected4 = [[1 5] [5 6] [3 7] [3 1] [7 4] [7 2] [9 8] [5 9]];
        int result4 = solution(n14, g14, n24, g24);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        int n15 = answer;
        int expected5 = 7;
        int result5 = solution(n15, g15, n25, g25);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + expected5);
        System.out.println("결과값  : " + result5);
        System.out.println("비교    : " + (expected5 == result5));

    }

    public static int solution(int n1, int[][] g1, int n2, int[][] g2) {
        int answer = 0;
        return answer;
    }
}
