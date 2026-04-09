import java.util.Arrays;

public class 배열에서문자열대소문자변환하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] strArr1 = {"AAA", "BBB", "CCC", "DDD"};
        String[] expected1 = {"aaa", "BBB", "ccc", "DDD"};
        String[] result1 = solution(strArr1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] strArr2 = {"aBc", "AbC"};
        String[] expected2 = {"abc", "ABC"};
        String[] result2 = solution(strArr2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static String[] solution(String[] strArr) {
        String[] answer = {};
        return answer;
    }
}
