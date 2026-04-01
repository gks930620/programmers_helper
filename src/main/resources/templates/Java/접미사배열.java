import java.util.Arrays;

public class 접미사배열 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String my_string1 = "banana";
        String[] expected1 = {"a", "ana", "anana", "banana", "na", "nana"};
        String[] result1 = solution(my_string1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String my_string2 = "programmers";
        String[] expected2 = {"ammers", "ers", "grammers", "mers", "mmers", "ogrammers", "programmers", "rammers", "rogrammers", "rs", "s"};
        String[] result2 = solution(my_string2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static String[] solution(String my_string) {
        String[] answer = {};
        return answer;
    }
}
