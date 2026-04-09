public class 세균증식 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 2;
        int t1 = 10;
        int expected1 = 2048;
        int result1 = solution(n1, t1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 7;
        int t2 = 15;
        int expected2 = 229376;
        int result2 = solution(n2, t2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int n, int t) {
        int answer = 0;
        return answer;
    }
}
