import java.util.Arrays;

public class 부대복귀 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 3;
        int[][] roads1 = {{1, 2}, {2, 3}};
        int[] sources1 = {2, 3};
        int destination1 = 1;
        int[] expected1 = {1, 2};
        int[] result1 = solution(n1, roads1, sources1, destination1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 5;
        int[][] roads2 = {{1, 2}, {1, 4}, {2, 4}, {2, 5}, {4, 5}};
        int[] sources2 = {1, 3, 5};
        int destination2 = 5;
        int[] expected2 = {2, -1, 0};
        int[] result2 = solution(n2, roads2, sources2, destination2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static int[] solution(int n, int[][] roads, int[] sources, int destination) {
        int[] answer = {};
        return answer;
    }
}
