public class 두큐합같게만들기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] queue11 = {3, 2, 7, 2};
        int[] queue21 = {4, 6, 5, 1};
        int expected1 = 2;
        int result1 = solution(queue11, queue21);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] queue12 = {1, 2, 1, 2};
        int[] queue22 = {1, 10, 1, 2};
        int expected2 = 7;
        int result2 = solution(queue12, queue22);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[] queue13 = {1, 1};
        int[] queue23 = {1, 5};
        int expected3 = -1;
        int result3 = solution(queue13, queue23);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(int[] queue1, int[] queue2) {
        int answer = -2;
        return answer;
    }
}
