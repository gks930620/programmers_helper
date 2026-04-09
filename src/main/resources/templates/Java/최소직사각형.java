public class 최소직사각형 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] sizes1 = 1;
        int expected1 = 50;
        int result1 = solution(sizes1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[][] sizes2 = 2;
        int expected2 = 70;
        int result2 = solution(sizes2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[][] sizes3 = 3;
        int expected3 = 30;
        int result3 = solution(sizes3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int[][] sizes4 = 4;
        int expected4 = 40;
        int result4 = solution(sizes4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));

    }

    public static int solution(int[][] sizes) {
        int answer = 0;
        return answer;
    }
}
