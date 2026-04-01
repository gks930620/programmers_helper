import java.util.Arrays;

public class K번째수 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] array1 = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands1 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] expected1 = {5, 6, 3};
        int[] result1 = solution(array1, commands1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));

    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        return answer;
    }
}
