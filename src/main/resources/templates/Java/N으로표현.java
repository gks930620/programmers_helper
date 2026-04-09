public class N으로표현 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int N1 = 5;
        int number1 = 12;
        int expected1 = 4;
        int result1 = solution(N1, number1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int N2 = 2;
        int number2 = 11;
        int expected2 = 3;
        int result2 = solution(N2, number2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int N, int number) {
        int answer = 0;
        return answer;
    }
}
