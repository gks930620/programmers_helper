import java.util.Arrays;

public class PCCE기출문제6번가채점 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] numbers1 = {1};
        int[] our_score1 = {100};
        int[] score_list1 = {100, 80, 90, 84, 20};
        String[] expected1 = {"Same"};
        String[] result1 = solution(numbers1, our_score1, score_list1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] numbers2 = {3, 4};
        int[] our_score2 = {85, 93};
        int[] score_list2 = {85, 92, 38, 93, 48, 85, 92, 56};
        String[] expected2 = {"Different", "Same"};
        String[] result2 = solution(numbers2, our_score2, score_list2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        String[] answer = new String[num_student];
        return answer;
    }
}
