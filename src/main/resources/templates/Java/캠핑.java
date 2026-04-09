public class 캠핑 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 4;
        int[][] data1 = {{0, 0}, {1, 1}, {0, 2}, {2, 0}};
        int expected1 = 3;
        int result1 = solution(n1, data1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));

    }

    public static int solution(int n, int[][] data) {
        int answer = 0;
        return answer;
    }
}
