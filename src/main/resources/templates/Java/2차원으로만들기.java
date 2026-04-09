import java.util.Arrays;

public class 2차원으로만들기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] num_list1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int n1 = 2;
        int[][] expected1 = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int[][] result1 = solution(num_list1, n1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected1));
        System.out.println("결과값  : " + Arrays.deepToString(result1));
        System.out.println("비교    : " + Arrays.deepEquals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] num_list2 = num_list;
        int n2 = n;
        int[][] expected2 = result;
        int[][] result2 = solution(num_list2, n2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected2));
        System.out.println("결과값  : " + Arrays.deepToString(result2));
        System.out.println("비교    : " + Arrays.deepEquals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[] num_list3 = ---;
        int n3 = ---;
        int[][] expected3 = ---;
        int[][] result3 = solution(num_list3, n3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected3));
        System.out.println("결과값  : " + Arrays.deepToString(result3));
        System.out.println("비교    : " + Arrays.deepEquals(expected3, result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int[] num_list4 = {1, 2, 3, 4, 5, 6, 7, 8};
        int n4 = 2;
        int[][] expected4 = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int[][] result4 = solution(num_list4, n4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected4));
        System.out.println("결과값  : " + Arrays.deepToString(result4));
        System.out.println("비교    : " + Arrays.deepEquals(expected4, result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        int[] num_list5 = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        int n5 = 3;
        int[][] expected5 = {{100, 95, 2}, {4, 5, 6}, {18, 33, 948}};
        int[][] result5 = solution(num_list5, n5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected5));
        System.out.println("결과값  : " + Arrays.deepToString(result5));
        System.out.println("비교    : " + Arrays.deepEquals(expected5, result5));

    }

    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = {};
        return answer;
    }
}
