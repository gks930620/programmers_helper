public class 정수부분 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        double flo1 = 1.42;
        int expected1 = 1;
        int result1 = solution(flo1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        double flo2 = 69.32;
        int expected2 = 69;
        int result2 = solution(flo2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(double flo) {
        int answer = 0;
        return answer;
    }
}
