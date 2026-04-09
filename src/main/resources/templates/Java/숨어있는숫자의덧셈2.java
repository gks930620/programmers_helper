public class 숨어있는숫자의덧셈2 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String my_string1 = "aAb1B2cC34oOp";
        int expected1 = 37;
        int result1 = solution(my_string1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String my_string2 = "1a2b3c4d123Z";
        int expected2 = 133;
        int result2 = solution(my_string2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(String my_string) {
        int answer = 0;
        return answer;
    }
}
