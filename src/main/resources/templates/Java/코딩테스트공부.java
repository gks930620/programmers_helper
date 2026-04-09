public class 코딩테스트공부 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int alp1 = 10;
        int cop1 = 10;
        int[][] problems1 = {{10,15,2,1,2},{20,20,3,3,4}};
        int expected1 = 15;
        int result1 = solution(alp1, cop1, problems1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int alp2 = 0;
        int cop2 = 0;
        int[][] problems2 = {{0,0,2,1,2},{4,5,3,1,2},{4,11,4,0,2},{10,4,0,4,2}};
        int expected2 = 13;
        int result2 = solution(alp2, cop2, problems2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int alp, int cop, int[][] problems) {
        int answer = 0;
        return answer;
    }
}
