public class 테이블해시함수 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] data1 = {{2,2,6},{1,5,10},{4,2,9},{3,8,3}};
        int col1 = 2;
        int row_begin1 = 2;
        int row_end1 = 3;
        int expected1 = 4;
        int result1 = solution(data1, col1, row_begin1, row_end1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));

    }

    public static int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        return answer;
    }
}
