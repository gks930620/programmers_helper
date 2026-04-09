public class 지형이동 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] land1 = {{1, 4, 8, 10}, {5, 5, 5, 5}, {10, 10, 10, 10}, {10, 10, 10, 20}};
        int height1 = 3;
        int expected1 = 15;
        int result1 = solution(land1, height1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[][] land2 = {{10, 11, 10, 11}, {2, 21, 20, 10}, {1, 20, 21, 11}, {2, 1, 2, 1}};
        int height2 = 1;
        int expected2 = 18;
        int result2 = solution(land2, height2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int[][] land, int height) {
        int answer = 0;
        return answer;
    }
}
