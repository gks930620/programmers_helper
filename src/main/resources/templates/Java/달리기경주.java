import java.util.Arrays;

public class 달리기경주 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] players1 = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings1 = {"kai", "kai", "mine", "mine"};
        String[] expected1 = {"mumu", "kai", "mine", "soe", "poe"};
        String[] result1 = solution(players1, callings1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));

    }

    public static String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        return answer;
    }
}
