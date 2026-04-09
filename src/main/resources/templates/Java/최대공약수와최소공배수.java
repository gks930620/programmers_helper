import java.util.Arrays;

public class 최대공약수와최소공배수 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 3;
        int m1 = 12;
        int[] expected1 = {3, 12};
        int[] result1 = solution(n1, m1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 2;
        int m2 = 5;
        int[] expected2 = {1, 10};
        int[] result2 = solution(n2, m2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static int[] solution(int n, int m) {
        int[] answer = {};
        return answer;
    }
}
