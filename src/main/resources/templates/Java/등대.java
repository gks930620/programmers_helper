public class 등대 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 8;
        int[][] lighthouse1 = {{1, 2}, {1, 3}, {1, 4}, {1, 5}, {5, 6}, {5, 7}, {5, 8}};
        int expected1 = 2;
        int result1 = solution(n1, lighthouse1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 10;
        int[][] lighthouse2 = {{4, 1}, {5, 1}, {5, 6}, {7, 6}, {1, 2}, {1, 3}, {6, 8}, {2, 9}, {9, 10}};
        int expected2 = 3;
        int result2 = solution(n2, lighthouse2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int n, int[][] lighthouse) {
        int answer = 0;
        return answer;
    }
}
