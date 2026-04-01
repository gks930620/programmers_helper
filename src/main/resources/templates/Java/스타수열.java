public class 스타수열 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] a1 = {0};
        int expected1 = 0;
        int result1 = solution(a1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] a2 = {5,2,3,3,5,3};
        int expected2 = 4;
        int result2 = solution(a2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[] a3 = {0,3,3,0,7,2,0,2,2,0};
        int expected3 = 8;
        int result3 = solution(a3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(int[] a) {
        int answer = -1;
        return answer;
    }
}
