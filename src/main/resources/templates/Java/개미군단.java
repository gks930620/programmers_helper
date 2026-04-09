public class 개미군단 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int hp1 = 23;
        int expected1 = 5;
        int result1 = solution(hp1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int hp2 = 24;
        int expected2 = 6;
        int result2 = solution(hp2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int hp3 = 999;
        int expected3 = 201;
        int result3 = solution(hp3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(int hp) {
        int answer = 0;
        return answer;
    }
}
