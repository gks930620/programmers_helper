public class 삼총사 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] number1 = {-2, 3, 0, 2, -5};
        int expected1 = 2;
        int result1 = solution(number1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] number2 = {-3, -2, -1, 0, 1, 2, 3};
        int expected2 = 5;
        int result2 = solution(number2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[] number3 = {-1, 1, -1, 1};
        int expected3 = 0;
        int result3 = solution(number3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(int[] number) {
        int answer = 0;
        return answer;
    }
}
