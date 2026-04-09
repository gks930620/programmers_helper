public class 양과늑대 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] info1 = {0,0,1,1,1,0,1,0,1,0,1,1};
        int[][] edges1 = {{0,1},{1,2},{1,4},{0,8},{8,7},{9,10},{9,11},{4,3},{6,5},{4,6},{8,9}};
        int expected1 = 5;
        int result1 = solution(info1, edges1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] info2 = {0,1,0,1,1,0,1,0,0,1,0};
        int[][] edges2 = {{0,1},{0,2},{1,3},{1,4},{2,5},{2,6},{3,7},{4,8},{6,9},{9,10}};
        int expected2 = 5;
        int result2 = solution(info2, edges2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int[] info, int[][] edges) {
        int answer = 0;
        return answer;
    }
}
