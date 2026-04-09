public class 정수삼각형 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] triangle1 = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        int expected1 = 30;
        int result1 = solution(triangle1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));

    }

    public static int solution(int[][] triangle) {
        int answer = 0;
        return answer;
    }
}
