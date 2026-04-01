import java.util.Arrays;

public class 문자열정렬하기1 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String my_string1 = "hi12392";
        int[] expected1 = {1, 2, 2, 3, 9};
        int[] result1 = solution(my_string1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String my_string2 = "p2o4i8gj2";
        int[] expected2 = {2, 2, 4, 8};
        int[] result2 = solution(my_string2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String my_string3 = "abcde0";
        int[] expected3 = {0};
        int[] result3 = solution(my_string3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));

    }

    public static int[] solution(String my_string) {
        int[] answer = {};
        return answer;
    }
}
