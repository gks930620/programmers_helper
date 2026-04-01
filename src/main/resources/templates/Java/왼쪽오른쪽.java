import java.util.Arrays;

public class 왼쪽오른쪽 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] str_list1 = {"u", "u", "l", "r"};
        String[] expected1 = {"u", "u"};
        String[] result1 = solution(str_list1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] str_list2 = {"l"};
        String[] expected2 = {};
        String[] result2 = solution(str_list2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static String[] solution(String[] str_list) {
        String[] answer = {};
        return answer;
    }
}
