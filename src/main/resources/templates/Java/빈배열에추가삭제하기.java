import java.util.Arrays;

public class 빈배열에추가삭제하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] arr1 = {3, 2, 4, 1, 3};
        boolean[] flag1 = {true, false, true, false, false};
        int[] expected1 = {3, 3, 3, 3, 4, 4, 4, 4};
        int[] result1 = solution(arr1, flag1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));

    }

    public static int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        return answer;
    }
}
