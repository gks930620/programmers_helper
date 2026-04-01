import java.util.Arrays;

public class 줄서는방법 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 3;
        long k1 = 5L;
        int[] expected1 = {3,1,2};
        int[] result1 = solution(n1, k1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));

    }

    public static int[] solution(int n, long k) {
        int[] answer = {};
        return answer;
    }
}
