public class 산모양타일링 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 4;
        int[] tops1 = {1, 1, 0, 1};
        int expected1 = 149;
        int result1 = solution(n1, tops1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 2;
        int[] tops2 = {0, 1};
        int expected2 = 11;
        int result2 = solution(n2, tops2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int n3 = 10;
        int[] tops3 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int expected3 = 7704;
        int result3 = solution(n3, tops3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(int n, int[] tops) {
        int answer = 0;
        return answer;
    }
}
