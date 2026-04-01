import java.util.Arrays;

public class 등산코스정하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 6;
        int[][] paths1 = {{1, 2, 3}, {2, 3, 5}, {2, 4, 2}, {2, 5, 4}, {3, 4, 4}, {4, 5, 3}, {4, 6, 1}, {5, 6, 1}};
        int[] gates1 = {1, 3};
        int[] summits1 = {5};
        int[] expected1 = {5, 3};
        int[] result1 = solution(n1, paths1, gates1, summits1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 7;
        int[][] paths2 = {{1, 4, 4}, {1, 6, 1}, {1, 7, 3}, {2, 5, 2}, {3, 7, 4}, {5, 6, 6}};
        int[] gates2 = {1};
        int[] summits2 = {2, 3, 4};
        int[] expected2 = {3, 4};
        int[] result2 = solution(n2, paths2, gates2, summits2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int n3 = 7;
        int[][] paths3 = {{1, 2, 5}, {1, 4, 1}, {2, 3, 1}, {2, 6, 7}, {4, 5, 1}, {5, 6, 1}, {6, 7, 1}};
        int[] gates3 = {3, 7};
        int[] summits3 = {1, 5};
        int[] expected3 = {5, 1};
        int[] result3 = solution(n3, paths3, gates3, summits3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int n4 = 5;
        int[][] paths4 = {{1, 3, 10}, {1, 4, 20}, {2, 3, 4}, {2, 4, 6}, {3, 5, 20}, {4, 5, 6}};
        int[] gates4 = {1, 2};
        int[] summits4 = {5};
        int[] expected4 = {5, 6};
        int[] result4 = solution(n4, paths4, gates4, summits4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + Arrays.toString(expected4));
        System.out.println("결과값  : " + Arrays.toString(result4));
        System.out.println("비교    : " + Arrays.equals(expected4, result4));

    }

    public static int[] solution(int n, int[][] paths, int[] gates, int[] summits) {
        int[] answer = {};
        return answer;
    }
}
