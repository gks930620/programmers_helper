import java.util.Arrays;

public class 110옮기기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] s1 = {"1110", "100111100", "0111111010"};
        String[] expected1 = {"1101", "100110110", "0110110111"};
        String[] result1 = solution(s1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));

    }

    public static String[] solution(String[] s) {
        String[] answer = {};
        return answer;
    }
}
