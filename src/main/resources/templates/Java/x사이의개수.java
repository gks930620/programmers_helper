import java.util.Arrays;

public class x사이의개수 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String myString1 = "oxooxoxxox";
        int[] expected1 = {1, 2, 1, 0, 1, 0};
        int[] result1 = solution(myString1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String myString2 = "xabcxdefxghi";
        int[] expected2 = {0, 3, 3, 3};
        int[] result2 = solution(myString2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static int[] solution(String myString) {
        int[] answer = {};
        return answer;
    }
}
