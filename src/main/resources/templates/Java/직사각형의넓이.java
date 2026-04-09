public class 직사각형의넓이 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] rectangles1 = {{0, 1, 4, 4}, {3, 1, 5, 3}};
        long expected1 = 14L;
        long result1 = solution(rectangles1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[][] rectangles2 = {{1, 1, 6, 5}, {2, 0, 4, 2}, {2, 4, 5, 7}, {4, 3, 8, 6}, {7, 5, 9, 7}};
        long expected2 = 38L;
        long result2 = solution(rectangles2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static long solution(int[][] rectangles) {
        long answer = -1;
        return answer;
    }
}
