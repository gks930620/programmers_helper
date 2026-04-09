public class flag에따라다른값반환하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int a1 = -4;
        int b1 = 7;
        boolean flag1 = true;
        int expected1 = 3;
        int result1 = solution(a1, b1, flag1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int a2 = -4;
        int b2 = 7;
        boolean flag2 = false;
        int expected2 = -11;
        int result2 = solution(a2, b2, flag2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int a, int b, boolean flag) {
        int answer = 0;
        return answer;
    }
}
