import java.util.Arrays;

public class 가장가까운같은글자 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String s1 = "banana";
        int[] expected1 = {-1, -1, -1, 2, 2, 2};
        int[] result1 = solution(s1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String s2 = "foobar";
        int[] expected2 = {-1, -1, 1, -1, -1, -1};
        int[] result2 = solution(s2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static int[] solution(String s) {
        int[] answer = {};
        return answer;
    }
}
