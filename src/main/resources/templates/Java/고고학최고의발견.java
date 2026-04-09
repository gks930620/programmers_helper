public class 고고학최고의발견 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] clockHands1 = {{0,3,3,0},{3,2,2,3},{0,3,2,0},{0,3,3,3}};
        int expected1 = 3;
        int result1 = solution(clockHands1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));

    }

    public static int solution(int[][] clockHands) {
        int answer = 0;
        return answer;
    }
}
