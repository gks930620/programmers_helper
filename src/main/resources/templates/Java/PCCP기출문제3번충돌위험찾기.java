public class PCCP기출문제3번충돌위험찾기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] points1 = {{3, 2}, {6, 4}, {4, 7}, {1, 4}};
        int[][] routes1 = {{4, 2}, {1, 3}, {2, 4}};
        int expected1 = 1;
        int result1 = solution(points1, routes1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[][] points2 = {{3, 2}, {6, 4}, {4, 7}, {1, 4}};
        int[][] routes2 = {{4, 2}, {1, 3}, {4, 2}, {4, 3}};
        int expected2 = 9;
        int result2 = solution(points2, routes2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[][] points3 = {{2, 2}, {2, 3}, {2, 7}, {6, 6}, {5, 2}};
        int[][] routes3 = {{2, 3, 4, 5}, {1, 3, 4, 5}};
        int expected3 = 0;
        int result3 = solution(points3, routes3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(int[][] points, int[][] routes) {
        int answer = 0;
        return answer;
    }
}
