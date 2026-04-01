public class 편지 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String message1 = "happy birthday!";
        int expected1 = 30;
        int result1 = solution(message1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String message2 = "I love you~";
        int expected2 = 22;
        int result2 = solution(message2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(String message) {
        int answer = 0;
        return answer;
    }
}
