public class 섬연결하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 4;
        int[][] costs1 = {{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}};
        int expected1 = 4;
        int result1 = solution(n1, costs1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));

    }

    public static int solution(int n, int[][] costs) {
        int answer = 0;
        return answer;
    }
}
