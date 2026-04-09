import java.util.Arrays;

public class 집합과쿼리 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 4;
        int[][] queries1 = {{3, 2, 3}, {1, 3, 2}, {3, 2, 3}, {1, 2, 0}, {3, 0, 1}, {2, 2, 0}, {3, 2, 3}, {3, 0, 2}};
        String[] expected1 = {"No", "Yes", "No", "No", "Yes"};
        String[] result1 = solution(n1, queries1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 7;
        int[][] queries2 = {{1, 0, 1}, {1, 2, 3}, {3, 1, 3}, {1, 2, 0}, {3, 1, 3}, {1, 1, 5}, {1, 5, 4}, {3, 4, 5}, {2, 2, 5}, {3, 4, 5}};
        String[] expected2 = {"No", "Yes", "Yes", "No"};
        String[] result2 = solution(n2, queries2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static String[] solution(int n, int[][] queries) {
        String[] answer = {};
        return answer;
    }
}
