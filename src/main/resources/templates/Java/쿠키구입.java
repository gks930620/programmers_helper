public class 쿠키구입 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] cookie1 = {1,1,2,3};
        int expected1 = 3;
        int result1 = solution(cookie1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] cookie2 = {1,2,4,5};
        int expected2 = 0;
        int result2 = solution(cookie2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int[] cookie) {
        int answer = -1;
        return answer;
    }
}
