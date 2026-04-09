public class HIndex {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] citations1 = {3, 0, 6, 1, 5};
        int expected1 = 3;
        int result1 = solution(citations1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));

    }

    public static int solution(int[] citations) {
        int answer = 0;
        return answer;
    }
}
