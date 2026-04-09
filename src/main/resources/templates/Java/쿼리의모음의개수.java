public class 쿼리의모음의개수 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int q1 = 2;
        int[] a1 = {1,2};
        int expected1 = 4;
        int result1 = solution(q1, a1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int q2 = 3;
        int[] a2 = {3};
        int expected2 = 19;
        int result2 = solution(q2, a2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int q3 = 5;
        int[] a3 = {1,4,4};
        int expected3 = 157740;
        int result3 = solution(q3, a3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int q4 = 50;
        int[] a4 = {1,6,5,2,4};
        int expected4 = 61953538;
        int result4 = solution(q4, a4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));

    }

    public static int solution(int q, int[] a) {
        int answer = -1;
        return answer;
    }
}
