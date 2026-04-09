import java.util.Arrays;

public class 도넛과막대그래프 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] edges1 = {{2, 3}, {4, 3}, {1, 1}, {2, 1}};
        int[] expected1 = {2, 1, 1, 0};
        int[] result1 = solution(edges1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[][] edges2 = {{4, 11}, {1, 12}, {8, 3}, {12, 7}, {4, 2}, {7, 11}, {4, 8}, {9, 6}, {10, 11}, {6, 10}, {3, 5}, {11, 1}, {5, 3}, {11, 9}, {3, 8}};
        int[] expected2 = {4, 0, 1, 2};
        int[] result2 = solution(edges2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static int[] solution(int[][] edges) {
        int[] answer = {};
        return answer;
    }
}
