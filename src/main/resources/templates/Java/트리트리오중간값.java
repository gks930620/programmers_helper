public class 트리트리오중간값 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 4;
        int[][] edges1 = {{1,2},{2,3},{3,4}};
        int expected1 = 2;
        int result1 = solution(n1, edges1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 5;
        int[][] edges2 = {{1,5},{2,5},{3,5},{4,5}};
        int expected2 = 2;
        int result2 = solution(n2, edges2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int n, int[][] edges) {
        int answer = 0;
        return answer;
    }
}
