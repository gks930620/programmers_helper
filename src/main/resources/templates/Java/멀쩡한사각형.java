public class 멀쩡한사각형 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int w1 = 8;
        int h1 = 12;
        long expected1 = 80L;
        long result1 = solution(w1, h1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));

    }

    public static long solution(int w, int h) {
        long answer = 1;
        return answer;
    }
}
