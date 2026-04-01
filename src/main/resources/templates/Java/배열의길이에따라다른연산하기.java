import java.util.Arrays;

public class 배열의길이에따라다른연산하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] arr1 = {49, 12, 100, 276, 33};
        int n1 = 27;
        int[] expected1 = {76, 12, 127, 276, 60};
        int[] result1 = solution(arr1, n1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] arr2 = {444, 555, 666, 777};
        int n2 = 100;
        int[] expected2 = {444, 655, 666, 877};
        int[] result2 = solution(arr2, n2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static int[] solution(int[] arr, int n) {
        int[] answer = {};
        return answer;
    }
}
