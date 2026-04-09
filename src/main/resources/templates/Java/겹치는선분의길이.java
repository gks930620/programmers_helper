public class 겹치는선분의길이 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] lines1 = {{0, 1}, {2, 5}, {3, 9}};
        int expected1 = 2;
        int result1 = solution(lines1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[][] lines2 = {{-1, 1}, {1, 3}, {3, 9}};
        int expected2 = 0;
        int result2 = solution(lines2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[][] lines3 = {{0, 5}, {3, 9}, {1, 10}};
        int expected3 = 8;
        int result3 = solution(lines3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(int[][] lines) {
        int answer = 0;
        return answer;
    }
}
