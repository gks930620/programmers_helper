public class 배달 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int N1 = 5;
        int[][] road1 = {{1,2,1},{2,3,3},{5,2,2},{1,4,2},{5,3,1},{5,4,2}};
        int K1 = 3;
        int expected1 = 4;
        int result1 = solution(N1, road1, K1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int N2 = 6;
        int[][] road2 = {{1,2,1},{1,3,2},{2,3,2},{3,4,3},{3,5,2},{3,5,3},{5,6,1}};
        int K2 = 4;
        int expected2 = 4;
        int result2 = solution(N2, road2, K2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int N, int[][] road, int K) {
        int answer = 0;
        return answer;
    }
}
