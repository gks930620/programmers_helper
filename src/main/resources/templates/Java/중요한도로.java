import java.util.Arrays;

public class 중요한도로 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 5;
        int[][] roads1 = {{1, 2, 10, 0}, {2, 4, 8, 0}, {1, 3, 9, 0}, {3, 4, 9, 0}, {3, 5, 10, 6}, {2, 5, 10, 2}, {4, 5, 2, 0}};
        int[] expected1 = {5, 7};
        int[] result1 = solution(n1, roads1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 4;
        int[][] roads2 = {{1, 2, 10, 10}, {2, 3, 10, 10}, {3, 4, 10, 10}};
        int[] expected2 = {1, 2, 3};
        int[] result2 = solution(n2, roads2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int n3 = 4;
        int[][] roads3 = {{1, 2, 5, 0}, {2, 4, 5, 0}, {1, 3, 5, 0}, {3, 4, 5, 0}};
        int[] expected3 = {-1};
        int[] result3 = solution(n3, roads3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int n4 = 4;
        int[][] roads4 = {{1, 2, 5, 0}, {2, 4, 5, 0}, {1, 3, 5, 0}, {3, 4, 5, 0}, {1, 4, 5, 5}};
        int[] expected4 = {5};
        int[] result4 = solution(n4, roads4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + Arrays.toString(expected4));
        System.out.println("결과값  : " + Arrays.toString(result4));
        System.out.println("비교    : " + Arrays.equals(expected4, result4));

    }

    public static int[] solution(int n, int[][] roads) {
        int[] answer = {};
        return answer;
    }
}
