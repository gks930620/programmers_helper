public class 1차프렌즈4블록 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int m1 = 4;
        int n1 = 5;
        String[] board1 = {"CCBDE", "AAADE", "AAABF", "CCBBF"};
        int expected1 = 14;
        int result1 = solution(m1, n1, board1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int m2 = 6;
        int n2 = 6;
        String[] board2 = {"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"};
        int expected2 = 15;
        int result2 = solution(m2, n2, board2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int m, int n, String[] board) {
        int answer = 0;
        return answer;
    }
}
