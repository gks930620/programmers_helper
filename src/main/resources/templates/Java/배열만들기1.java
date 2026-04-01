import java.util.Arrays;

public class 배열만들기1 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 10;
        int k1 = 3;
        int[] expected1 = {3, 6, 9};
        int[] result1 = solution(n1, k1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 15;
        int k2 = 5;
        int[] expected2 = {5, 10, 15};
        int[] result2 = solution(n2, k2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static int[] solution(int n, int k) {
        int[] answer = {};
        return answer;
    }
}
