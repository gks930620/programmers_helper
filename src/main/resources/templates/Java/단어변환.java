public class 단어변환 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String begin1 = "hit";
        String target1 = "cog";
        String[] words1 = {"hot", "dot", "dog", "lot", "log", "cog"};
        int expected1 = 4;
        int result1 = solution(begin1, target1, words1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String begin2 = "hit";
        String target2 = "cog";
        String[] words2 = {"hot", "dot", "dog", "lot", "log"};
        int expected2 = 0;
        int result2 = solution(begin2, target2, words2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(String begin, String target, String[] words) {
        int answer = 0;
        return answer;
    }
}
