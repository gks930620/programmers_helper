import java.util.Arrays;

public class 무인도여행 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] maps1 = {"X591X", "X1X5X", "X231X", "1XXX1"};
        int[] expected1 = {1, 1, 27};
        int[] result1 = solution(maps1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] maps2 = {"XXX", "XXX", "XXX"};
        int[] expected2 = {-1};
        int[] result2 = solution(maps2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static int[] solution(String[] maps) {
        int[] answer = {};
        return answer;
    }
}
