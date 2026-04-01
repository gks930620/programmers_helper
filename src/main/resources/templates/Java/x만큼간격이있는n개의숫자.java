import java.util.Arrays;

public class x만큼간격이있는n개의숫자 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int x1 = 2;
        int n1 = 5;
        long[] expected1 = {2,4,6,8,10};
        long[] result1 = solution(x1, n1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int x2 = 4;
        int n2 = 3;
        long[] expected2 = {4,8,12};
        long[] result2 = solution(x2, n2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int x3 = -4;
        int n3 = 2;
        long[] expected3 = {-4, -8};
        long[] result3 = solution(x3, n3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));

    }

    public static long[] solution(int x, int n) {
        long[] answer = {};
        return answer;
    }
}
