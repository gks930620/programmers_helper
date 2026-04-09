import java.util.Arrays;

public class 실패율 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int N1 = 5;
        int[] stages1 = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] expected1 = {3,4,2,1,5};
        int[] result1 = solution(N1, stages1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int N2 = 4;
        int[] stages2 = {4,4,4,4,4};
        int[] expected2 = {4,1,2,3};
        int[] result2 = solution(N2, stages2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = {};
        return answer;
    }
}
