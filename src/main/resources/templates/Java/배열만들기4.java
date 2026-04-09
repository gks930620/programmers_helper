import java.util.Arrays;

public class 배열만들기4 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] arr1 = {1, 4, 2, 5, 3};
        int[] expected1 = {1, 2, 3};
        int[] result1 = solution(arr1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));

    }

    public static int[] solution(int[] arr) {
        int[] answer = {};
        return answer;
    }
}
