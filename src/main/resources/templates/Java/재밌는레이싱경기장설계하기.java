public class 재밌는레이싱경기장설계하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] heights1 = {1, 8, 5};
        int expected1 = 4;
        int result1 = solution(heights1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] heights2 = {11, 6, 4, 11};
        int expected2 = 5;
        int result2 = solution(heights2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[] heights3 = {9, 9, 9, 9, 30};
        int expected3 = 0;
        int result3 = solution(heights3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(int[] heights) {
        int answer = 0;
        return answer;
    }
}
