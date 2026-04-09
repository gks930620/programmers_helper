public class 콜라츠추측 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int num1 = 6;
        int expected1 = 8;
        int result1 = solution(num1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int num2 = 16;
        int expected2 = 4;
        int result2 = solution(num2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int num3 = 626331;
        int expected3 = -1;
        int result3 = solution(num3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(int num) {
        int answer = 0;
        return answer;
    }
}
