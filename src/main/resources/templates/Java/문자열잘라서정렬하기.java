import java.util.Arrays;

public class 문자열잘라서정렬하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String myString1 = "axbxcxdx";
        String[] expected1 = {"a", "b", "c", "d"};
        String[] result1 = solution(myString1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String myString2 = "dxccxbbbxaaaa";
        String[] expected2 = {"aaaa", "bbb", "cc", "d"};
        String[] result2 = solution(myString2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static String[] solution(String myString) {
        String[] answer = {};
        return answer;
    }
}
