public class 직사각형넓이구하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] dots1 = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
        int expected1 = 1;
        int result1 = solution(dots1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[][] dots2 = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};
        int expected2 = 4;
        int result2 = solution(dots2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int[][] dots) {
        int answer = 0;
        return answer;
    }
}
