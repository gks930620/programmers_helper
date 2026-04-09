import java.util.Arrays;

public class 특이한정렬 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] numlist1 = {1, 2, 3, 4, 5, 6};
        int n1 = 4;
        int[] expected1 = {4, 5, 3, 6, 2, 1};
        int[] result1 = solution(numlist1, n1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] numlist2 = {10000,20,36,47,40,6,10,7000};
        int n2 = 30;
        int[] expected2 = {36, 40, 20, 47, 10, 6, 7000, 10000};
        int[] result2 = solution(numlist2, n2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static int[] solution(int[] numlist, int n) {
        int[] answer = {};
        return answer;
    }
}
