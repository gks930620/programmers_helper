import java.util.Arrays;

public class 리스트자르기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 3;
        int[] slicer1 = {1, 5, 2};
        int[] num_list1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expected1 = {2, 3, 4, 5, 6};
        int[] result1 = solution(n1, slicer1, num_list1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 4;
        int[] slicer2 = {1, 5, 2};
        int[] num_list2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expected2 = {2, 4, 6};
        int[] result2 = solution(n2, slicer2, num_list2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        return answer;
    }
}
