public class 두수의곱구하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int num11 = 3;
        int num21 = 4;
        int expected1 = 12;
        int result1 = solution(num11, num21);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int num12 = 27;
        int num22 = 19;
        int expected2 = 513;
        int result2 = solution(num12, num22);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int num1, int num2) {
        int answer = 0;
        return answer;
    }
}
