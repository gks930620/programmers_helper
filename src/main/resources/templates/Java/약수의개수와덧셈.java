public class 약수의개수와덧셈 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int left1 = 13;
        int right1 = 17;
        int expected1 = 43;
        int result1 = solution(left1, right1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int left2 = 24;
        int right2 = 27;
        int expected2 = 52;
        int result2 = solution(left2, right2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int left3 = 수;
        int right3 = 약수;
        int expected3 = 약수의 개수;
        int result3 = solution(left3, right3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int left4 = ---;
        int right4 = ---;
        int expected4 = ---;
        int result4 = solution(left4, right4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        int left5 = 13;
        int right5 = 1 13;
        int expected5 = 2;
        int result5 = solution(left5, right5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + expected5);
        System.out.println("결과값  : " + result5);
        System.out.println("비교    : " + (expected5 == result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        int left6 = 14;
        int right6 = 1 2 7 14;
        int expected6 = 4;
        int result6 = solution(left6, right6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + expected6);
        System.out.println("결과값  : " + result6);
        System.out.println("비교    : " + (expected6 == result6));
        System.out.println();

        // --- 테스트 케이스 7 ---
        int left7 = 15;
        int right7 = 1 3 5 15;
        int expected7 = 4;
        int result7 = solution(left7, right7);

        System.out.println("--- Test Case 7 ---");
        System.out.println("기대값  : " + expected7);
        System.out.println("결과값  : " + result7);
        System.out.println("비교    : " + (expected7 == result7));
        System.out.println();

        // --- 테스트 케이스 8 ---
        int left8 = 16;
        int right8 = 1 2 4 8 16;
        int expected8 = 5;
        int result8 = solution(left8, right8);

        System.out.println("--- Test Case 8 ---");
        System.out.println("기대값  : " + expected8);
        System.out.println("결과값  : " + result8);
        System.out.println("비교    : " + (expected8 == result8));
        System.out.println();

        // --- 테스트 케이스 9 ---
        int left9 = 17;
        int right9 = 1 17;
        int expected9 = 2;
        int result9 = solution(left9, right9);

        System.out.println("--- Test Case 9 ---");
        System.out.println("기대값  : " + expected9);
        System.out.println("결과값  : " + result9);
        System.out.println("비교    : " + (expected9 == result9));
        System.out.println();

        // --- 테스트 케이스 10 ---
        int left10 = 수;
        int right10 = 약수;
        int expected10 = 약수의 개수;
        int result10 = solution(left10, right10);

        System.out.println("--- Test Case 10 ---");
        System.out.println("기대값  : " + expected10);
        System.out.println("결과값  : " + result10);
        System.out.println("비교    : " + (expected10 == result10));
        System.out.println();

        // --- 테스트 케이스 11 ---
        int left11 = ---;
        int right11 = ---;
        int expected11 = ---;
        int result11 = solution(left11, right11);

        System.out.println("--- Test Case 11 ---");
        System.out.println("기대값  : " + expected11);
        System.out.println("결과값  : " + result11);
        System.out.println("비교    : " + (expected11 == result11));
        System.out.println();

        // --- 테스트 케이스 12 ---
        int left12 = 24;
        int right12 = 1 2 3 4 6 8 12 24;
        int expected12 = 8;
        int result12 = solution(left12, right12);

        System.out.println("--- Test Case 12 ---");
        System.out.println("기대값  : " + expected12);
        System.out.println("결과값  : " + result12);
        System.out.println("비교    : " + (expected12 == result12));
        System.out.println();

        // --- 테스트 케이스 13 ---
        int left13 = 25;
        int right13 = 1 5 25;
        int expected13 = 3;
        int result13 = solution(left13, right13);

        System.out.println("--- Test Case 13 ---");
        System.out.println("기대값  : " + expected13);
        System.out.println("결과값  : " + result13);
        System.out.println("비교    : " + (expected13 == result13));
        System.out.println();

        // --- 테스트 케이스 14 ---
        int left14 = 26;
        int right14 = 1 2 13 26;
        int expected14 = 4;
        int result14 = solution(left14, right14);

        System.out.println("--- Test Case 14 ---");
        System.out.println("기대값  : " + expected14);
        System.out.println("결과값  : " + result14);
        System.out.println("비교    : " + (expected14 == result14));
        System.out.println();

        // --- 테스트 케이스 15 ---
        int left15 = 27;
        int right15 = 1 3 9 27;
        int expected15 = 4;
        int result15 = solution(left15, right15);

        System.out.println("--- Test Case 15 ---");
        System.out.println("기대값  : " + expected15);
        System.out.println("결과값  : " + result15);
        System.out.println("비교    : " + (expected15 == result15));

    }

    public static int solution(int left, int right) {
        int answer = 0;
        return answer;
    }
}
