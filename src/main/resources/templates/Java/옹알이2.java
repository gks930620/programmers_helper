public class 옹알이2 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] babbling1 = {"aya", "yee", "u", "maa"};
        int expected1 = 1;
        int result1 = solution(babbling1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] babbling2 = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        int expected2 = 2;
        int result2 = solution(babbling2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(String[] babbling) {
        int answer = 0;
        return answer;
    }
}
