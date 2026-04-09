public class 타겟넘버 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] numbers1 = {1, 1, 1, 1, 1};
        int target1 = 3;
        int expected1 = 5;
        int result1 = solution(numbers1, target1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] numbers2 = {4, 1, 2, 1};
        int target2 = 4;
        int expected2 = 2;
        int result2 = solution(numbers2, target2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int[] numbers, int target) {
        int answer = 0;
        return answer;
    }
}
