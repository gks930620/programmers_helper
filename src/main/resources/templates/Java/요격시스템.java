public class 요격시스템 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] targets1 = {{4,5},{4,8},{10,14},{11,13},{5,12},{3,7},{1,4}};
        int expected1 = 3;
        int result1 = solution(targets1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));

    }

    public static int solution(int[][] targets) {
        int answer = 0;
        return answer;
    }
}
