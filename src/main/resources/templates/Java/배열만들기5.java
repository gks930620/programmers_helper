import java.util.Arrays;

public class 배열만들기5 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] intStrs1 = {"0123456789", "9876543210", "9999999999999"};
        int k1 = 50000;
        int s1 = 5;
        int l1 = 5;
        int[] expected1 = {56789, 99999};
        int[] result1 = solution(intStrs1, k1, s1, l1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));

    }

    public static int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        return answer;
    }
}
