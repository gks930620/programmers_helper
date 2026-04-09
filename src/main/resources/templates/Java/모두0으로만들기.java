public class 모두0으로만들기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] a1 = {-5,0,2,1,2};
        int[][] edges1 = {{0,1},{3,4},{2,3},{0,3}};
        long expected1 = 9L;
        long result1 = solution(a1, edges1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] a2 = {0,1,0};
        int[][] edges2 = {{0,1},{1,2}};
        long expected2 = -1L;
        long result2 = solution(a2, edges2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static long solution(int[] a, int[][] edges) {
        long answer = -2;
        return answer;
    }
}
