import java.util.Arrays;

public class 순서바꾸기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] num_list1 = {2, 1, 6};
        int n1 = 1;
        int[] expected1 = {1, 6, 2};
        int[] result1 = solution(num_list1, n1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] num_list2 = {5, 2, 1, 7, 5};
        int n2 = 3;
        int[] expected2 = {7, 5, 5, 2, 1};
        int[] result2 = solution(num_list2, n2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static int[] solution(int[] num_list, int n) {
        int[] answer = {};
        return answer;
    }
}
