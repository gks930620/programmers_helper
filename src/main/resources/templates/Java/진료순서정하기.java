import java.util.Arrays;

public class 진료순서정하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] emergency1 = {3, 76, 24};
        int[] expected1 = {3, 1, 2};
        int[] result1 = solution(emergency1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] emergency2 = {1, 2, 3, 4, 5, 6, 7};
        int[] expected2 = {7, 6, 5, 4, 3, 2, 1};
        int[] result2 = solution(emergency2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[] emergency3 = {30, 10, 23, 6, 100};
        int[] expected3 = {2, 4, 3, 5, 1};
        int[] result3 = solution(emergency3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));

    }

    public static int[] solution(int[] emergency) {
        int[] answer = {};
        return answer;
    }
}
