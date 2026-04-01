import java.util.Arrays;

public class n2배열자르기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 3;
        long left1 = 2L;
        long right1 = 5L;
        int[] expected1 = {3,2,2,3};
        int[] result1 = solution(n1, left1, right1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 4;
        long left2 = 7L;
        long right2 = 14L;
        int[] expected2 = {4,3,3,3,4,4,4,4};
        int[] result2 = solution(n2, left2, right2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static int[] solution(int n, long left, long right) {
        int[] answer = {};
        return answer;
    }
}
