public class 멀리뛰기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 4;
        long expected1 = 5L;
        long result1 = solution(n1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 3;
        long expected2 = 3L;
        long result2 = solution(n2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static long solution(int n) {
        long answer = 0;
        return answer;
    }
}
