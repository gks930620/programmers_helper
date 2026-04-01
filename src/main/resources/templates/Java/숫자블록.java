import java.util.Arrays;

public class 숫자블록 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        long begin1 = 1L;
        long end1 = 10L;
        int[] expected1 = {0, 1, 1, 2, 1, 3, 1, 4, 3, 5};
        int[] result1 = solution(begin1, end1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));

    }

    public static int[] solution(long begin, long end) {
        int[] answer = {};
        return answer;
    }
}
