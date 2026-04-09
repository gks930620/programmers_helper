public class 문자열정수의합 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String num_str1 = "123456789";
        int expected1 = 45;
        int result1 = solution(num_str1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String num_str2 = "1000000";
        int expected2 = 1;
        int result2 = solution(num_str2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(String num_str) {
        int answer = 0;
        return answer;
    }
}
