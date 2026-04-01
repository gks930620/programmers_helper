public class 순위 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 5;
        int[][] results1 = {{4, 3}, {4, 2}, {3, 2}, {1, 2}, {2, 5}};
        int expected1 = 2;
        int result1 = solution(n1, results1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));

    }

    public static int solution(int n, int[][] results) {
        int answer = 0;
        return answer;
    }
}
