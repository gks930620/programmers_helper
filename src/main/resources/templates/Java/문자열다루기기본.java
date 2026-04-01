public class 문자열다루기기본 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String s1 = "a234";
        boolean expected1 = false;
        boolean result1 = solution(s1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String s2 = "1234";
        boolean expected2 = true;
        boolean result2 = solution(s2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static boolean solution(String s) {
        boolean answer = true;
        return answer;
    }
}
