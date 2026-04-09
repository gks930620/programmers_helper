public class 최적의행렬곱셈 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] matrix_sizes1 = {{5,3},{3,10},{10,6}};
        int expected1 = 270;
        int result1 = solution(matrix_sizes1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));

    }

    public static int solution(int[][] matrix_sizes) {
        int answer = 0;
        return answer;
    }
}
