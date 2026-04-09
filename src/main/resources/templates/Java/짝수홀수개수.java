import java.util.Arrays;

public class 짝수홀수개수 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] num_list1 = {1, 2, 3, 4, 5};
        int[] expected1 = {2, 3};
        int[] result1 = solution(num_list1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] num_list2 = {1, 3, 5, 7};
        int[] expected2 = {0, 4};
        int[] result2 = solution(num_list2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static int[] solution(int[] num_list) {
        int[] answer = {};
        return answer;
    }
}
