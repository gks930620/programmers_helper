import java.util.Arrays;

public class n의배수고르기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 3;
        int[] numlist1 = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] expected1 = {6, 9, 12};
        int[] result1 = solution(n1, numlist1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 5;
        int[] numlist2 = {1, 9, 3, 10, 13, 5};
        int[] expected2 = {10, 5};
        int[] result2 = solution(n2, numlist2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int n3 = 12;
        int[] numlist3 = {2, 100, 120, 600, 12, 12};
        int[] expected3 = {120, 600, 12, 12};
        int[] result3 = solution(n3, numlist3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));

    }

    public static int[] solution(int n, int[] numlist) {
        int[] answer = {};
        return answer;
    }
}
