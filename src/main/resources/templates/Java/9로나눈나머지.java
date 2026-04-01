public class 9로나눈나머지 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String number1 = "123";
        int expected1 = 6;
        int result1 = solution(number1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String number2 = "78720646226947352489";
        int expected2 = 2;
        int result2 = solution(number2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(String number) {
        int answer = 0;
        return answer;
    }
}
