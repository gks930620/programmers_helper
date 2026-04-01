public class 기사단원의무기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int number1 = 5;
        int limit1 = 3;
        int power1 = 2;
        int expected1 = 10;
        int result1 = solution(number1, limit1, power1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int number2 = 10;
        int limit2 = 3;
        int power2 = 2;
        int expected2 = 21;
        int result2 = solution(number2, limit2, power2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int number, int limit, int power) {
        int answer = 0;
        return answer;
    }
}
