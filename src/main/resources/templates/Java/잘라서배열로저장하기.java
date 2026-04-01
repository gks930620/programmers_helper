import java.util.Arrays;

public class 잘라서배열로저장하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String my_str1 = "abc1Addfggg4556b";
        int n1 = 6;
        String[] expected1 = {"abc1Ad", "dfggg4", "556b"};
        String[] result1 = solution(my_str1, n1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String my_str2 = "abcdef123";
        int n2 = 3;
        String[] expected2 = {"abc", "def", "123"};
        String[] result2 = solution(my_str2, n2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static String[] solution(String my_str, int n) {
        String[] answer = {};
        return answer;
    }
}
