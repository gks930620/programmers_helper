import java.util.Arrays;

public class 홀짝트리 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] nodes1 = #1;
        int[][] edges1 = 10%;
        int[] expected1 = 하나의 트리만 주어집니다.nodes의 길이 ≤ 1,000,edges의 길이 ≤ 1,000;
        int[] result1 = solution(nodes1, edges1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] nodes2 = #2;
        int[][] edges2 = 10%;
        int[] expected2 = nodes의 길이 ≤ 1,000,edges의 길이 ≤ 1,000;
        int[] result2 = solution(nodes2, edges2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[] nodes3 = #3;
        int[][] edges3 = 30%;
        int[] expected3 = 하나의 트리만 주어집니다.;
        int[] result3 = solution(nodes3, edges3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int[] nodes4 = #4;
        int[][] edges4 = 50%;
        int[] expected4 = 추가 제한 사항 없음;
        int[] result4 = solution(nodes4, edges4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + Arrays.toString(expected4));
        System.out.println("결과값  : " + Arrays.toString(result4));
        System.out.println("비교    : " + Arrays.equals(expected4, result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        int[] nodes5 = nodes;
        int[][] edges5 = edges;
        int[] expected5 = result;
        int[] result5 = solution(nodes5, edges5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + Arrays.toString(expected5));
        System.out.println("결과값  : " + Arrays.toString(result5));
        System.out.println("비교    : " + Arrays.equals(expected5, result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        int[] nodes6 = ---;
        int[][] edges6 = ---;
        int[] expected6 = ---;
        int[] result6 = solution(nodes6, edges6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + Arrays.toString(expected6));
        System.out.println("결과값  : " + Arrays.toString(result6));
        System.out.println("비교    : " + Arrays.equals(expected6, result6));
        System.out.println();

        // --- 테스트 케이스 7 ---
        int[] nodes7 = {11, 9, 3, 2, 4, 6};
        int[][] edges7 = {{9, 11}, {2, 3}, {6, 3}, {3, 4}};
        int[] expected7 = {1, 0};
        int[] result7 = solution(nodes7, edges7);

        System.out.println("--- Test Case 7 ---");
        System.out.println("기대값  : " + Arrays.toString(expected7));
        System.out.println("결과값  : " + Arrays.toString(result7));
        System.out.println("비교    : " + Arrays.equals(expected7, result7));
        System.out.println();

        // --- 테스트 케이스 8 ---
        int[] nodes8 = {9, 15, 14, 7, 6, 1, 2, 4, 5, 11, 8, 10};
        int[][] edges8 = {{5, 14}, {1, 4}, {9, 11}, {2, 15}, {2, 5}, {9, 7}, {8, 1}, {6, 4}};
        int[] expected8 = {2, 1};
        int[] result8 = solution(nodes8, edges8);

        System.out.println("--- Test Case 8 ---");
        System.out.println("기대값  : " + Arrays.toString(expected8));
        System.out.println("결과값  : " + Arrays.toString(result8));
        System.out.println("비교    : " + Arrays.equals(expected8, result8));

    }

    public static int[] solution(int[] nodes, int[][] edges) {
        int[] answer = {};
        return answer;
    }
}
