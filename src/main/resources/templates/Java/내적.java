public class 내적 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] a1 = {1,2,3,4};
        int[] b1 = {-3,-1,0,2};
        int expected1 = 3;
        int result1 = solution(a1, b1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] a2 = {-1,0,1};
        int[] b2 = {1,0,-1};
        int expected2 = -2;
        int result2 = solution(a2, b2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int[] a, int[] b) {
        int answer = 1234567890;
        return answer;
    }
}
