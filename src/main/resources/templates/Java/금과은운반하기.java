public class 금과은운반하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int a1 = 10;
        int b1 = 10;
        int[] g1 = {100};
        int[] s1 = {100};
        int[] w1 = {7};
        int[] t1 = {10};
        long expected1 = 50L;
        long result1 = solution(a1, b1, g1, s1, w1, t1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int a2 = 90;
        int b2 = 500;
        int[] g2 = {70,70,0};
        int[] s2 = {0,0,500};
        int[] w2 = {100,100,2};
        int[] t2 = {4,8,1};
        long expected2 = 499L;
        long result2 = solution(a2, b2, g2, s2, w2, t2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static long solution(int a, int b, int[] g, int[] s, int[] w, int[] t) {
        long answer = -1;
        return answer;
    }
}
