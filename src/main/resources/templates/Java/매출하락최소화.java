public class 매출하락최소화 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] sales1 = {14, 17, 15, 18, 19, 14, 13, 16, 28, 17};
        int[][] links1 = {{10, 8}, {1, 9}, {9, 7}, {5, 4}, {1, 5}, {5, 10}, {10, 6}, {1, 3}, {10, 2}};
        int expected1 = 44;
        int result1 = solution(sales1, links1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] sales2 = {5, 6, 5, 3, 4};
        int[][] links2 = {{2,3}, {1,4}, {2,5}, {1,2}};
        int expected2 = 6;
        int result2 = solution(sales2, links2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[] sales3 = {5, 6, 5, 1, 4};
        int[][] links3 = {{2,3}, {1,4}, {2,5}, {1,2}};
        int expected3 = 5;
        int result3 = solution(sales3, links3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int[] sales4 = {10, 10, 1, 1};
        int[][] links4 = {{3,2}, {4,3}, {1,4}};
        int expected4 = 2;
        int result4 = solution(sales4, links4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));

    }

    public static int solution(int[] sales, int[][] links) {
        int answer = 0;
        return answer;
    }
}
