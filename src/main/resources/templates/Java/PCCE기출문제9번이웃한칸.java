public class PCCE기출문제9번이웃한칸 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[][] board1 = {{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"}, {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}};
        int h1 = 1;
        int w1 = 1;
        int expected1 = 2;
        int result1 = solution(board1, h1, w1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[][] board2 = {{"yellow", "green", "blue"}, {"blue", "green", "yellow"}, {"yellow", "blue", "blue"}};
        int h2 = 0;
        int w2 = 1;
        int expected2 = 1;
        int result2 = solution(board2, h2, w2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(String[][] board, int h, int w) {
        int answer = 0;
        return answer;
    }
}
