import java.util.Arrays;

public class 최고의집합 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 2;
        int s1 = 9;
        int[] expected1 = {4, 5};
        int[] result1 = solution(n1, s1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 2;
        int s2 = 1;
        int[] expected2 = {-1};
        int[] result2 = solution(n2, s2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int n3 = 2;
        int s3 = 8;
        int[] expected3 = {4, 4};
        int[] result3 = solution(n3, s3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));

    }

    public static int[] solution(int n, int s) {
        int[] answer = {};
        return answer;
    }
}
