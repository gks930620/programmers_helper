import java.util.Arrays;

public class 삼각달팽이 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 4;
        int[] expected1 = {1,2,9,3,10,8,4,5,6,7};
        int[] result1 = solution(n1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 5;
        int[] expected2 = {1,2,12,3,13,11,4,14,15,10,5,6,7,8,9};
        int[] result2 = solution(n2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int n3 = 6;
        int[] expected3 = {1,2,15,3,16,14,4,17,21,13,5,18,19,20,12,6,7,8,9,10,11};
        int[] result3 = solution(n3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));

    }

    public static int[] solution(int n) {
        int[] answer = {};
        return answer;
    }
}
