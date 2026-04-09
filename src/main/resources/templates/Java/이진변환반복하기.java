import java.util.Arrays;

public class 이진변환반복하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String s1 = "110010101001";
        int[] expected1 = {3,8};
        int[] result1 = solution(s1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String s2 = "01110";
        int[] expected2 = {3,3};
        int[] result2 = solution(s2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String s3 = "1111111";
        int[] expected3 = {4,1};
        int[] result3 = solution(s3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));

    }

    public static int[] solution(String s) {
        int[] answer = {};
        return answer;
    }
}
