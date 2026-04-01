public class 간단한논리연산 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        boolean x11 = false;
        boolean x21 = true;
        boolean x31 = true;
        boolean x41 = true;
        boolean expected1 = true;
        boolean result1 = solution(x11, x21, x31, x41);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        boolean x12 = true;
        boolean x22 = false;
        boolean x32 = false;
        boolean x42 = false;
        boolean expected2 = false;
        boolean result2 = solution(x12, x22, x32, x42);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        return answer;
    }
}
