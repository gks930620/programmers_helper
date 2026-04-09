public class 빠른이동 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 6;
        int[][] roads1 = {{1, 2}, {2, 6}, {2, 4}, {4, 3}, {3, 2}, {3, 5}};
        int expected1 = 1;
        int result1 = solution(n1, roads1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 5;
        int[][] roads2 = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        int expected2 = 0;
        int result2 = solution(n2, roads2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int n3 = 8;
        int[][] roads3 = {{6, 4}, {2, 3}, {1, 6}, {4, 5}, {1, 2}, {1, 8}, {3, 7}, {7, 2}};
        int expected3 = 2;
        int result3 = solution(n3, roads3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int n4 = 9;
        int[][] roads4 = {{1, 2}, {1, 3}, {1, 4}, {2, 5}, {4, 5}, {5, 6}, {5, 7}, {6, 9}, {7, 9}, {5, 8}};
        int expected4 = 3;
        int result4 = solution(n4, roads4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        int n5 = 7;
        int[][] roads5 = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {3, 6}, {1, 7}, {7, 4}};
        int expected5 = 1;
        int result5 = solution(n5, roads5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + expected5);
        System.out.println("결과값  : " + result5);
        System.out.println("비교    : " + (expected5 == result5));

    }

    public static int solution(int n, int[][] roads) {
        int answer = 0;
        return answer;
    }
}
