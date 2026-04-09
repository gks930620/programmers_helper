import java.util.Arrays;

public class 배열뒤집기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] num_list1 = {1, 2, 3, 4, 5};
        int[] expected1 = {5, 4, 3, 2, 1};
        int[] result1 = solution(num_list1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] num_list2 = {1, 1, 1, 1, 1, 2};
        int[] expected2 = {2, 1, 1, 1, 1, 1};
        int[] result2 = solution(num_list2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[] num_list3 = {1, 0, 1, 1, 1, 3, 5};
        int[] expected3 = {5, 3, 1, 1, 1, 0, 1};
        int[] result3 = solution(num_list3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));

    }

    public static int[] solution(int[] num_list) {
        int[] answer = {};
        return answer;
    }
}
