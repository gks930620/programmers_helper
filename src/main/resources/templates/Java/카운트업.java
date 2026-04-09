import java.util.Arrays;

public class 카운트업 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int start_num1 = 3;
        int end_num1 = 10;
        int[] expected1 = {3, 4, 5, 6, 7, 8, 9, 10};
        int[] result1 = solution(start_num1, end_num1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));

    }

    public static int[] solution(int start_num, int end_num) {
        int[] answer = {};
        return answer;
    }
}
