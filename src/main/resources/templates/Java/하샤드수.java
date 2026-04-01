public class 하샤드수 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int x1 = 10;
        boolean expected1 = true;
        boolean result1 = solution(x1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int x2 = 12;
        boolean expected2 = true;
        boolean result2 = solution(x2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int x3 = 11;
        boolean expected3 = false;
        boolean result3 = solution(x3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int x4 = 13;
        boolean expected4 = false;
        boolean result4 = solution(x4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));

    }

    public static boolean solution(int x) {
        boolean answer = true;
        return answer;
    }
}
