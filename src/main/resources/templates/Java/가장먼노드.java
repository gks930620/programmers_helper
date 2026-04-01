public class 가장먼노드 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 6;
        int[][] edge1 = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
        int expected1 = 3;
        int result1 = solution(n1, edge1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));

    }

    public static int solution(int n, int[][] edge) {
        int answer = 0;
        return answer;
    }
}
