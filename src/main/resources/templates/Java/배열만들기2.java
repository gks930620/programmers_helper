import java.util.Arrays;

public class 배열만들기2 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int l1 = 5;
        int r1 = 555;
        int[] expected1 = {5, 50, 55, 500, 505, 550, 555};
        int[] result1 = solution(l1, r1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int l2 = 10;
        int r2 = 20;
        int[] expected2 = {-1};
        int[] result2 = solution(l2, r2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static int[] solution(int l, int r) {
        int[] answer = {};
        return answer;
    }
}
