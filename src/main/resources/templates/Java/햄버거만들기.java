public class 햄버거만들기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] ingredient1 = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int expected1 = 2;
        int result1 = solution(ingredient1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] ingredient2 = {1, 3, 2, 1, 2, 1, 3, 1, 2};
        int expected2 = 0;
        int result2 = solution(ingredient2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int[] ingredient) {
        int answer = 0;
        return answer;
    }
}
