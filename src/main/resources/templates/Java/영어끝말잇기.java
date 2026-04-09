import java.util.Arrays;

public class 영어끝말잇기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 3;
        String[] words1 = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        int[] expected1 = {3,3};
        int[] result1 = solution(n1, words1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 5;
        String[] words2 = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        int[] expected2 = {0,0};
        int[] result2 = solution(n2, words2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int n3 = 2;
        String[] words3 = {"hello", "one", "even", "never", "now", "world", "draw"};
        int[] expected3 = {1,3};
        int[] result3 = solution(n3, words3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));

    }

    public static int[] solution(int n, String[] words) {
        int[] answer = {};
        return answer;
    }
}
