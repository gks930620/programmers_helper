public class 지형편집 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] land1 = {{1, 2}, {2, 3}};
        int P1 = 3;
        int Q1 = 2;
        long expected1 = 5L;
        long result1 = solution(land1, P1, Q1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[][] land2 = {{4, 4, 3}, {3, 2, 2}, { 2, 1, 0 }};
        int P2 = 5;
        int Q2 = 3;
        long expected2 = 33L;
        long result2 = solution(land2, P2, Q2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static long solution(int[][] land, int P, int Q) {
        long answer = -1;
        return answer;
    }
}
