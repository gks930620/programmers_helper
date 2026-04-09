public class 시험장나누기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int k1 = 3;
        int[] num1 = {12, 30, 1, 8, 8, 6, 20, 7, 5, 10, 4, 1};
        int[][] links1 = {{-1, -1}, {-1, -1}, {-1, -1}, {-1, -1}, {8, 5}, {2, 10}, {3, 0}, {6, 1}, {11, -1}, {7, 4}, {-1, -1}, {-1, -1}};
        int expected1 = 40;
        int result1 = solution(k1, num1, links1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int k2 = 1;
        int[] num2 = {6, 9, 7, 5};
        int[][] links2 = {{-1, -1}, {-1, -1}, {-1, 0}, {2, 1}};
        int expected2 = 27;
        int result2 = solution(k2, num2, links2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int k3 = 2;
        int[] num3 = {6, 9, 7, 5};
        int[][] links3 = {{-1, -1}, {-1, -1}, {-1, 0}, {2, 1}};
        int expected3 = 14;
        int result3 = solution(k3, num3, links3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int k4 = 4;
        int[] num4 = {6, 9, 7, 5};
        int[][] links4 = {{-1, -1}, {-1, -1}, {-1, 0}, {2, 1}};
        int expected4 = 9;
        int result4 = solution(k4, num4, links4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));

    }

    public static int solution(int k, int[] num, int[][] links) {
        int answer = 0;
        return answer;
    }
}
