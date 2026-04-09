public class 공배수 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int number1 = 60;
        int n1 = 2;
        int m1 = 3;
        int expected1 = 1;
        int result1 = solution(number1, n1, m1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int number2 = 55;
        int n2 = 10;
        int m2 = 5;
        int expected2 = 0;
        int result2 = solution(number2, n2, m2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int number, int n, int m) {
        int answer = 0;
        return answer;
    }
}
