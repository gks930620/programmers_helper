public class 2차원동전뒤집기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] beginning1 = {{0, 1, 0, 0, 0}, {1, 0, 1, 0, 1}, {0, 1, 1, 1, 0}, {1, 0, 1, 1, 0}, {0, 1, 0, 1, 0}};
        int[][] target1 = {{0, 0, 0, 1, 1}, {0, 0, 0, 0, 1}, {0, 0, 1, 0, 1}, {0, 0, 0, 1, 0}, {0, 0, 0, 0, 1}};
        int expected1 = 5;
        int result1 = solution(beginning1, target1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[][] beginning2 = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int[][] target2 = {{1, 0, 1}, {0, 0, 0}, {0, 0, 0}};
        int expected2 = -1;
        int result2 = solution(beginning2, target2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int[][] beginning, int[][] target) {
        int answer = 0;
        return answer;
    }
}
