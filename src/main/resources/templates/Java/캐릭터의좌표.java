import java.util.Arrays;

public class 캐릭터의좌표 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] keyinput1 = {"left", "right", "up", "right", "right"};
        int[] board1 = {11, 11};
        int[] expected1 = {2, 1};
        int[] result1 = solution(keyinput1, board1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] keyinput2 = {"down", "down", "down", "down", "down"};
        int[] board2 = {7, 9};
        int[] expected2 = {0, -4};
        int[] result2 = solution(keyinput2, board2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static int[] solution(String[] keyinput, int[] board) {
        int[] answer = {};
        return answer;
    }
}
