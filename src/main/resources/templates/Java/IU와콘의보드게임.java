public class IU와콘의보드게임 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 2;
        int[][] triangle1 = {{0, 8}, {-4, 0}, {4, 0}};
        int[][] v1 = {{-1, 3}, {1, 4}};
        int expected1 = 6;
        int result1 = solution(n1, triangle1, v1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 10;
        int[][] triangle2 = {{-13, 40}, {-27, -48}, {31, 6}};
        int[][] v2 = {{2, 21}, {15, -1}, {6, -13}, {-20, -27}, {5, 9}, {5, 11}, {-18, -26}, {-15, 19}, {7, 4}, {-5, -18}};
        int expected2 = 73;
        int result2 = solution(n2, triangle2, v2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int n, int[][] triangle, int[][] v) {
        int answer = 0;
        return answer;
    }
}
