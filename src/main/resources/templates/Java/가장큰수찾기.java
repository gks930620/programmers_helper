import java.util.Arrays;

public class 가장큰수찾기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] array1 = {1, 8, 3};
        int[] expected1 = {8, 1};
        int[] result1 = solution(array1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] array2 = {9, 10, 11, 8};
        int[] expected2 = {11, 2};
        int[] result2 = solution(array2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static int[] solution(int[] array) {
        int[] answer = {};
        return answer;
    }
}
