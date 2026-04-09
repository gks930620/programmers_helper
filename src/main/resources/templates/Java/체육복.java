public class 체육복 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 5;
        int[] lost1 = {2, 4};
        int[] reserve1 = {1, 3, 5};
        int expected1 = 5;
        int result1 = solution(n1, lost1, reserve1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 5;
        int[] lost2 = {2, 4};
        int[] reserve2 = {3};
        int expected2 = 4;
        int result2 = solution(n2, lost2, reserve2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int n3 = 3;
        int[] lost3 = {3};
        int[] reserve3 = {1};
        int expected3 = 2;
        int result3 = solution(n3, lost3, reserve3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        return answer;
    }
}
