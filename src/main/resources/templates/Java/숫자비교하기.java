public class 숫자비교하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int num11 = 2;
        int num21 = 3;
        int expected1 = -1;
        int result1 = solution(num11, num21);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int num12 = 11;
        int num22 = 11;
        int expected2 = 1;
        int result2 = solution(num12, num22);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int num13 = 7;
        int num23 = 99;
        int expected3 = -1;
        int result3 = solution(num13, num23);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(int num1, int num2) {
        int answer = 0;
        return answer;
    }
}
