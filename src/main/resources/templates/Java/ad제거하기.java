import java.util.Arrays;

public class ad제거하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] strArr1 = {"and", "notad", "abcd"};
        String[] expected1 = {"and", "abcd"};
        String[] result1 = solution(strArr1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] strArr2 = {"there", "are", "no", "a", "ds"};
        String[] expected2 = {"there", "are", "no", "a", "ds"};
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
