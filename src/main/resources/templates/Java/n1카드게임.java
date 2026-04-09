public class n1카드게임 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int coin1 = 4;
        int[] cards1 = {3, 6, 7, 2, 1, 10, 5, 9, 8, 12, 11, 4};
        int expected1 = 5;
        int result1 = solution(coin1, cards1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int coin2 = 3;
        int[] cards2 = {1, 2, 3, 4, 5, 8, 6, 7, 9, 10, 11, 12};
        int expected2 = 2;
        int result2 = solution(coin2, cards2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int coin3 = 2;
        int[] cards3 = {5, 8, 1, 2, 9, 4, 12, 11, 3, 10, 6, 7};
        int expected3 = 4;
        int result3 = solution(coin3, cards3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int coin4 = 10;
        int[] cards4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
        int expected4 = 1;
        int result4 = solution(coin4, cards4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));

    }

    public static int solution(int coin, int[] cards) {
        int answer = 0;
        return answer;
    }
}
