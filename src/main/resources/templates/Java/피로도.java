public class 피로도 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int k1 = 80;
        int[][] dungeons1 = {{80,20},{50,40},{30,10}};
        int expected1 = 3;
        int result1 = solution(k1, dungeons1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));

    }

    public static int solution(int k, int[][] dungeons) {
        int answer = -1;
        return answer;
    }
}
