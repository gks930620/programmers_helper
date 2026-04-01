public class 전국대회선발고사 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] rank1 = {3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance1 = {false, true, true, true, true, false, false};
        int expected1 = 20403;
        int result1 = solution(rank1, attendance1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] rank2 = {1, 2, 3};
        boolean[] attendance2 = {true, true, true};
        int expected2 = 102;
        int result2 = solution(rank2, attendance2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[] rank3 = {6, 1, 5, 2, 3, 4};
        boolean[] attendance3 = {true, false, true, false, false, true};
        int expected3 = 50200;
        int result3 = solution(rank3, attendance3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        return answer;
    }
}
