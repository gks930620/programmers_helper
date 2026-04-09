public class 구슬을나누는경우의수 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int balls1 = 3;
        int share1 = 2;
        int expected1 = 3;
        int result1 = solution(balls1, share1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int balls2 = 5;
        int share2 = 3;
        int expected2 = 10;
        int result2 = solution(balls2, share2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int balls, int share) {
        int answer = 0;
        return answer;
    }
}
