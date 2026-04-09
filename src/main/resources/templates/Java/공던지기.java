public class 공던지기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] numbers1 = {1, 2, 3, 4};
        int k1 = 2;
        int expected1 = 3;
        int result1 = solution(numbers1, k1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] numbers2 = {1, 2, 3, 4, 5, 6};
        int k2 = 5;
        int expected2 = 3;
        int result2 = solution(numbers2, k2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[] numbers3 = {1, 2, 3};
        int k3 = 3;
        int expected3 = 2;
        int result3 = solution(numbers3, k3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(int[] numbers, int k) {
        int answer = 0;
        return answer;
    }
}
