public class 다음에올숫자 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] common1 = {1, 2, 3, 4};
        int expected1 = 5;
        int result1 = solution(common1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] common2 = {2, 4, 8};
        int expected2 = 16;
        int result2 = solution(common2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int[] common) {
        int answer = 0;
        return answer;
    }
}
