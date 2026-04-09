public class 네트워크 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 3;
        int[][] computers1 = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        int expected1 = 2;
        int result1 = solution(n1, computers1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 3;
        int[][] computers2 = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
        int expected2 = 1;
        int result2 = solution(n2, computers2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int n, int[][] computers) {
        int answer = 0;
        return answer;
    }
}
