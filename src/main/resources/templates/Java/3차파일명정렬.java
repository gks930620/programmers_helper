import java.util.Arrays;

public class 3차파일명정렬 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] files1 = foo9.txt;
        String[] expected1 = .txt;
        String[] result1 = solution(files1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] files2 = foo010bar020.zip;
        String[] expected2 = bar020.zip;
        String[] result2 = solution(files2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String[] files3 = F-15;
        String[] expected3 = (빈 문자열);
        String[] result3 = solution(files3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));

    }

    public static String[] solution(String[] files) {
        String[] answer = {};
        return answer;
    }
}
