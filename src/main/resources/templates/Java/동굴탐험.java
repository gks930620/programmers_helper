public class 동굴탐험 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 9;
        int[][] path1 = {{0,1},{0,3},{0,7},{8,1},{3,6},{1,2},{4,7},{7,5}};
        int[][] order1 = {{8,5},{6,7},{4,1}};
        boolean expected1 = true;
        boolean result1 = solution(n1, path1, order1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 9;
        int[][] path2 = {{8,1},{0,1},{1,2},{0,7},{4,7},{0,3},{7,5},{3,6}};
        int[][] order2 = {{4,1},{5,2}};
        boolean expected2 = true;
        boolean result2 = solution(n2, path2, order2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int n3 = 9;
        int[][] path3 = {{0,1},{0,3},{0,7},{8,1},{3,6},{1,2},{4,7},{7,5}};
        int[][] order3 = {{4,1},{8,7},{6,5}};
        boolean expected3 = false;
        boolean result3 = solution(n3, path3, order3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static boolean solution(int n, int[][] path, int[][] order) {
        boolean answer = true;
        return answer;
    }
}
