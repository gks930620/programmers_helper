public class PCCE기출문제9번지폐접기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] wallet1 = {30, 15};
        int[] bill1 = {26, 17};
        int expected1 = 1;
        int result1 = solution(wallet1, bill1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] wallet2 = {50, 50};
        int[] bill2 = {100, 241};
        int expected2 = 4;
        int result2 = solution(wallet2, bill2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int[] wallet, int[] bill) {
        int answer = 0;
        return answer;
    }
}
