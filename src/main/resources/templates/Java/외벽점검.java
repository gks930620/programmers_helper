public class 외벽점검 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 12;
        int[] weak1 = {1, 5, 6, 10};
        int[] dist1 = {1, 2, 3, 4};
        int expected1 = 2;
        int result1 = solution(n1, weak1, dist1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 12;
        int[] weak2 = {1, 3, 4, 9, 10};
        int[] dist2 = {3, 5, 7};
        int expected2 = 1;
        int result2 = solution(n2, weak2, dist2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int n, int[] weak, int[] dist) {
        int answer = 0;
        return answer;
    }
}
