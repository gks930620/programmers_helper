import java.util.Arrays;

public class 같은숫자는싫어 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] expected1 = {1,3,0,1};
        int[] result1 = solution();

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] expected2 = {4,3};
        int[] result2 = solution();

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static int[] solution() {
        int[] answer = {};
        return answer;
    }
}
