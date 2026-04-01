public class n의배수 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int num1 = 98;
        int n1 = 2;
        int expected1 = 1;
        int result1 = solution(num1, n1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int num2 = 34;
        int n2 = 3;
        int expected2 = 0;
        int result2 = solution(num2, n2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int num, int n) {
        int answer = 0;
        return answer;
    }
}
