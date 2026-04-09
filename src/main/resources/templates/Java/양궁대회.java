import java.util.Arrays;

public class 양궁대회 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 5;
        int[] info1 = {2,1,1,1,0,0,0,0,0,0,0};
        int[] expected1 = {0,2,2,0,1,0,0,0,0,0,0};
        int[] result1 = solution(n1, info1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 1;
        int[] info2 = {1,0,0,0,0,0,0,0,0,0,0};
        int[] expected2 = {-1};
        int[] result2 = solution(n2, info2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int n3 = 9;
        int[] info3 = {0,0,1,2,0,1,1,1,1,1,1};
        int[] expected3 = {1,1,2,0,1,2,2,0,0,0,0};
        int[] result3 = solution(n3, info3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int n4 = 10;
        int[] info4 = {0,0,0,0,0,0,0,0,3,4,3};
        int[] expected4 = {1,1,1,1,1,1,1,1,0,0,2};
        int[] result4 = solution(n4, info4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + Arrays.toString(expected4));
        System.out.println("결과값  : " + Arrays.toString(result4));
        System.out.println("비교    : " + Arrays.equals(expected4, result4));

    }

    public static int[] solution(int n, int[] info) {
        int[] answer = {};
        return answer;
    }
}
