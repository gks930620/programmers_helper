import java.util.Arrays;

public class 카운트다운 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int target1 = 21;
        int[] expected1 = {1,0};
        int[] result1 = solution(target1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int target2 = 58;
        int[] expected2 = {2,2};
        int[] result2 = solution(target2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static int[] solution(int target) {
        int[] answer = {};
        return answer;
    }
}
