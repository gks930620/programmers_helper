import java.util.Arrays;

public class 대충만든자판 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] keymap1 = {"ABACD", "BCEFD"};
        String[] targets1 = {"ABCD", "AABB"};
        int[] expected1 = {9, 4};
        int[] result1 = solution(keymap1, targets1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] keymap2 = {"AA"};
        String[] targets2 = {"B"};
        int[] expected2 = {-1};
        int[] result2 = solution(keymap2, targets2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String[] keymap3 = {"AGZ", "BSSS"};
        String[] targets3 = {"ASA", "BGZ"};
        int[] expected3 = {4, 6};
        int[] result3 = solution(keymap3, targets3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));

    }

    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = {};
        return answer;
    }
}
