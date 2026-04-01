public class 문자열의아름다움 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String s1 = "baby";
        long expected1 = 9L;
        long result1 = solution(s1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String s2 = "oo";
        long expected2 = 0L;
        long result2 = solution(s2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static long solution(String s) {
        long answer = -1;
        return answer;
    }
}
