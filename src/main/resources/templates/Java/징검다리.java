public class 징검다리 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int distance1 = [21 17];
        int[] rocks1 = {2, 9, 3, 11};
        int expected1 = 2;
        int result1 = solution(distance1, rocks1, n1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int distance2 = [2 21];
        int[] rocks2 = {11, 3, 3, 8};
        int expected2 = 3;
        int result2 = solution(distance2, rocks2, n2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int distance3 = [2 11];
        int[] rocks3 = {14, 3, 4, 4};
        int expected3 = 3;
        int result3 = solution(distance3, rocks3, n3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int distance4 = [11 21];
        int[] rocks4 = {2, 12, 3, 8};
        int expected4 = 2;
        int result4 = solution(distance4, rocks4, n4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        int distance5 = [2 14];
        int[] rocks5 = {11, 6, 4, 4};
        int expected5 = 4;
        int result5 = solution(distance5, rocks5, n5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + expected5);
        System.out.println("결과값  : " + result5);
        System.out.println("비교    : " + (expected5 == result5));

    }

    public static int solution(int distance, int[] rocks, int n) {
        int answer = 0;
        return answer;
    }
}
