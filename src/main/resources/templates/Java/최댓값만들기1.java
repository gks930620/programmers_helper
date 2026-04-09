public class 최댓값만들기1 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] numbers1 = {1, 2, 3, 4, 5};
        int expected1 = 20;
        int result1 = solution(numbers1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] numbers2 = {0, 31, 24, 10, 1, 9};
        int expected2 = 744;
        int result2 = solution(numbers2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int[] numbers) {
        int answer = 0;
        return answer;
    }
}
