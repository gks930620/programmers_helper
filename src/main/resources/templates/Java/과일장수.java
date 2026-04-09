public class 과일장수 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int k1 = 3;
        int m1 = 4;
        int[] score1 = {1, 2, 3, 1, 2, 3, 1};
        int expected1 = 8;
        int result1 = solution(k1, m1, score1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int k2 = 4;
        int m2 = 3;
        int[] score2 = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        int expected2 = 33;
        int result2 = solution(k2, m2, score2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        return answer;
    }
}
