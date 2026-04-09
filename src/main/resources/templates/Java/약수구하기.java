import java.util.Arrays;

public class 약수구하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 24;
        int[] expected1 = {1, 2, 3, 4, 6, 8, 12, 24};
        int[] result1 = solution(n1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 29;
        int[] expected2 = {1, 29};
        int[] result2 = solution(n2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static int[] solution(int n) {
        int[] answer = {};
        return answer;
    }
}
