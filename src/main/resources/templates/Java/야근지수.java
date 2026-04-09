public class 야근지수 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 4;
        int[] works1 = {4, 3, 3};
        long expected1 = 12L;
        long result1 = solution(n1, works1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 1;
        int[] works2 = {2, 1, 2};
        long expected2 = 6L;
        long result2 = solution(n2, works2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int n3 = 3;
        int[] works3 = {1,1};
        long expected3 = 0L;
        long result3 = solution(n3, works3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static long solution(int n, int[] works) {
        long answer = 0;
        return answer;
    }
}
