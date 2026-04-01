import java.util.Arrays;

public class 모의고사 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] answers1 = {1,2,3,4,5};
        int[] expected1 = {1};
        int[] result1 = solution(answers1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] answers2 = {1,3,2,4,2};
        int[] expected2 = {1,2,3};
        int[] result2 = solution(answers2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static int[] solution(int[] answers) {
        int[] answer = {};
        return answer;
    }
}
