public class 간단한식계산하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String binomial1 = "43 + 12";
        int expected1 = 55;
        int result1 = solution(binomial1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String binomial2 = "0 - 7777";
        int expected2 = -7777;
        int result2 = solution(binomial2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String binomial3 = "40000 * 40000";
        int expected3 = 1600000000;
        int result3 = solution(binomial3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(String binomial) {
        int answer = 0;
        return answer;
    }
}
