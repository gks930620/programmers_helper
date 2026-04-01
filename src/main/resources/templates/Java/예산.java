public class 예산 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] d1 = {1,3,2,5,4};
        int budget1 = 9;
        int expected1 = 3;
        int result1 = solution(d1, budget1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] d2 = {2,2,3,3};
        int budget2 = 10;
        int expected2 = 4;
        int result2 = solution(d2, budget2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int[] d, int budget) {
        int answer = 0;
        return answer;
    }
}
