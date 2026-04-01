import java.util.Arrays;

public class 문자열내마음대로정렬하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] strings1 = {"sun", "bed", "car"};
        int n1 = 1;
        String[] expected1 = {"car", "bed", "sun"};
        String[] result1 = solution(strings1, n1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] strings2 = {"abce", "abcd", "cdx"};
        int n2 = 2;
        String[] expected2 = {"abcd", "abce", "cdx"};
        String[] result2 = solution(strings2, n2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static String[] solution(String[] strings, int n) {
        String[] answer = {};
        return answer;
    }
}
