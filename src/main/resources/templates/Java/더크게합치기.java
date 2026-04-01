public class 더크게합치기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int a1 = 9;
        int b1 = 91;
        int expected1 = 991;
        int result1 = solution(a1, b1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int a2 = 89;
        int b2 = 8;
        int expected2 = 898;
        int result2 = solution(a2, b2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int a, int b) {
        int answer = 0;
        return answer;
    }
}
