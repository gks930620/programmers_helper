import java.util.Arrays;

public class 공원산책 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] park1 = {"SOO", "OOO", "OOO"};
        String[] routes1 = {"E 2", "S 2", "W 1"};
        int[] expected1 = {2,1};
        int[] result1 = solution(park1, routes1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] park2 = {"SOO", "OXX", "OOO"};
        String[] routes2 = {"E 2", "S 2", "W 1"};
        int[] expected2 = {0,1};
        int[] result2 = solution(park2, routes2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String[] park3 = {"OSO", "OOO", "OXO", "OOO"};
        String[] routes3 = {"E 2", "S 3", "W 1"};
        int[] expected3 = {0,0};
        int[] result3 = solution(park3, routes3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));

    }

    public static int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        return answer;
    }
}
