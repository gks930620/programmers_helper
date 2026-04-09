import java.util.Arrays;

public class 억억단을외우자 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int e1 = 8;
        int[] starts1 = {1,3,7};
        int[] expected1 = {6,6,8};
        int[] result1 = solution(e1, starts1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));

    }

    public static int[] solution(int e, int[] starts) {
        int[] answer = {};
        return answer;
    }
}
