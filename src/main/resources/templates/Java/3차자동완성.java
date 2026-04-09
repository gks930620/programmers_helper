public class 3차자동완성 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] words1 = {"go", "gone", "guild"};
        int expected1 = 7;
        int result1 = solution(words1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] words2 = {"abc", "def", "ghi", "jklm"};
        int expected2 = 4;
        int result2 = solution(words2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String[] words3 = {"word", "war", "warrior", "world"};
        int expected3 = 15;
        int result3 = solution(words3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(String[] words) {
        int answer = 0;
        return answer;
    }
}
