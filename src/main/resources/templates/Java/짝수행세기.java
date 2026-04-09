public class 짝수행세기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] a1 = {{0,1,0},{1,1,1},{1,1,0},{0,1,1}};
        int expected1 = 6;
        int result1 = solution(a1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[][] a2 = {{1,0,0},{1,0,0}};
        int expected2 = 0;
        int result2 = solution(a2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[][] a3 = {{1,0,0,1,1},{0,0,0,0,0},{1,1,0,0,0},{0,0,0,0,1}};
        int expected3 = 72;
        int result3 = solution(a3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(int[][] a) {
        int answer = -1;
        return answer;
    }
}
