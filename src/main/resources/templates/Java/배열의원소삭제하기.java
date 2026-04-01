import java.util.Arrays;

public class 배열의원소삭제하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] arr1 = {293, 1000, 395, 678, 94};
        int[] delete_list1 = {94, 777, 104, 1000, 1, 12};
        int[] expected1 = {293, 395, 678};
        int[] result1 = solution(arr1, delete_list1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] arr2 = {110, 66, 439, 785, 1};
        int[] delete_list2 = {377, 823, 119, 43};
        int[] expected2 = {110, 66, 439, 785, 1};
        int[] result2 = solution(arr2, delete_list2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        return answer;
    }
}
