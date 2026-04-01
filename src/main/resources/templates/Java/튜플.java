import java.util.Arrays;

public class 튜플 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String s1 = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        int[] expected1 = {2, 1, 3, 4};
        int[] result1 = solution(s1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String s2 = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
        int[] expected2 = {2, 1, 3, 4};
        int[] result2 = solution(s2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String s3 = "{{20,111},{111}}";
        int[] expected3 = {111, 20};
        int[] result3 = solution(s3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        String s4 = "{{123}}";
        int[] expected4 = {123};
        int[] result4 = solution(s4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + Arrays.toString(expected4));
        System.out.println("결과값  : " + Arrays.toString(result4));
        System.out.println("비교    : " + Arrays.equals(expected4, result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        String s5 = "{{4,2,3},{3},{2,3,4,1},{2,3}}";
        int[] expected5 = {3, 2, 4, 1};
        int[] result5 = solution(s5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + Arrays.toString(expected5));
        System.out.println("결과값  : " + Arrays.toString(result5));
        System.out.println("비교    : " + Arrays.equals(expected5, result5));

    }

    public static int[] solution(String s) {
        int[] answer = {};
        return answer;
    }
}
