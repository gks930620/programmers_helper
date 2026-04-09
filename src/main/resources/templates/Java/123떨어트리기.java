import java.util.Arrays;

public class 123떨어트리기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] edges1 = 1;
        int[] expected1 = 0;
        int[] result1 = solution(edges1, target1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[][] edges2 = 2;
        int[] expected2 = 0;
        int[] result2 = solution(edges2, target2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[][] edges3 = 3;
        int[] expected3 = 0;
        int[] result3 = solution(edges3, target3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int[][] edges4 = 4;
        int[] expected4 = 3;
        int[] result4 = solution(edges4, target4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + Arrays.toString(expected4));
        System.out.println("결과값  : " + Arrays.toString(result4));
        System.out.println("비교    : " + Arrays.equals(expected4, result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        int[][] edges5 = 5;
        int[] expected5 = 0;
        int[] result5 = solution(edges5, target5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + Arrays.toString(expected5));
        System.out.println("결과값  : " + Arrays.toString(result5));
        System.out.println("비교    : " + Arrays.equals(expected5, result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        int[][] edges6 = 6;
        int[] expected6 = 0;
        int[] result6 = solution(edges6, target6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + Arrays.toString(expected6));
        System.out.println("결과값  : " + Arrays.toString(result6));
        System.out.println("비교    : " + Arrays.equals(expected6, result6));
        System.out.println();

        // --- 테스트 케이스 7 ---
        int[][] edges7 = 7;
        int[] expected7 = 5;
        int[] result7 = solution(edges7, target7);

        System.out.println("--- Test Case 7 ---");
        System.out.println("기대값  : " + Arrays.toString(expected7));
        System.out.println("결과값  : " + Arrays.toString(result7));
        System.out.println("비교    : " + Arrays.equals(expected7, result7));
        System.out.println();

        // --- 테스트 케이스 8 ---
        int[][] edges8 = 8;
        int[] expected8 = 1;
        int[] result8 = solution(edges8, target8);

        System.out.println("--- Test Case 8 ---");
        System.out.println("기대값  : " + Arrays.toString(expected8));
        System.out.println("결과값  : " + Arrays.toString(result8));
        System.out.println("비교    : " + Arrays.equals(expected8, result8));
        System.out.println();

        // --- 테스트 케이스 9 ---
        int[][] edges9 = 9;
        int[] expected9 = 2;
        int[] result9 = solution(edges9, target9);

        System.out.println("--- Test Case 9 ---");
        System.out.println("기대값  : " + Arrays.toString(expected9));
        System.out.println("결과값  : " + Arrays.toString(result9));
        System.out.println("비교    : " + Arrays.equals(expected9, result9));
        System.out.println();

        // --- 테스트 케이스 10 ---
        int[][] edges10 = 10;
        int[] expected10 = 3;
        int[] result10 = solution(edges10, target10);

        System.out.println("--- Test Case 10 ---");
        System.out.println("기대값  : " + Arrays.toString(expected10));
        System.out.println("결과값  : " + Arrays.toString(result10));
        System.out.println("비교    : " + Arrays.equals(expected10, result10));

    }

    public static int[] solution(int[][] edges, int[] target) {
        int[] answer = {};
        return answer;
    }
}
