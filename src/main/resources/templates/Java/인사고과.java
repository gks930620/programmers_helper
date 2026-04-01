public class 인사고과 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] scores1 = {{2,2},{1,4},{3,2},{3,2},{2,1}};
        int expected1 = 4;
        int result1 = solution(scores1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));

    }

    public static int solution(int[][] scores) {
        int answer = 0;
        return answer;
    }
}
