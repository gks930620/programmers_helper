public class 보물찾기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] depth1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int money1 = 55;
        int expected1 = 3;
        int result1 = solution(depth1, money1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] depth2 = {1, 1, 1, 1, 1};
        int money2 = 3;
        int expected2 = 5;
        int result2 = solution(depth2, money2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[] depth3 = {2, 100, 1, 100, 3, 100, 1};
        int money3 = 200;
        int expected3 = 6;
        int result3 = solution(depth3, money3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int[] depth4 = {2, 100, 1, 100, 3, 100, 1};
        int money4 = 200;
        int expected4 = 5;
        int result4 = solution(depth4, money4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        int[] depth5 = {3, 2, 1, 2, 3, 2, 1, 2};
        int money5 = 8;
        int expected5 = 5;
        int result5 = solution(depth5, money5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + expected5);
        System.out.println("결과값  : " + result5);
        System.out.println("비교    : " + (expected5 == result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        int[] depth6 = {1, 1000, 1, 1, 1, 10, 15, 1};
        int money6 = 1002;
        int expected6 = 2;
        int result6 = solution(depth6, money6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + expected6);
        System.out.println("결과값  : " + result6);
        System.out.println("비교    : " + (expected6 == result6));

    }

    public static int solution(int[] depth, int money) {
        int answer = 0;
        return answer;
    }
}
