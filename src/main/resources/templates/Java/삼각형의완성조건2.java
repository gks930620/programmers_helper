public class 삼각형의완성조건2 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] sides1 = {1, 2};
        int expected1 = 1;
        int result1 = solution(sides1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] sides2 = {3, 6};
        int expected2 = 5;
        int result2 = solution(sides2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[] sides3 = {11, 7};
        int expected3 = 13;
        int result3 = solution(sides3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(int[] sides) {
        int answer = 0;
        return answer;
    }
}
