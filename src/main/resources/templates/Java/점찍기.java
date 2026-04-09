public class 점찍기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int k1 = 2;
        int d1 = 4;
        long expected1 = 6L;
        long result1 = solution(k1, d1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int k2 = 1;
        int d2 = 5;
        long expected2 = 26L;
        long result2 = solution(k2, d2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static long solution(int k, int d) {
        long answer = 0;
        return answer;
    }
}
