public class 홀짝에따라다른값반환하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 7;
        int expected1 = 16;
        int result1 = solution(n1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 10;
        int expected2 = 220;
        int result2 = solution(n2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int n) {
        int answer = 0;
        return answer;
    }
}
