public class 마법의엘리베이터 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int storey1 = 16;
        int expected1 = 6;
        int result1 = solution(storey1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int storey2 = 2554;
        int expected2 = 16;
        int result2 = solution(storey2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int storey) {
        int answer = 0;
        return answer;
    }
}
