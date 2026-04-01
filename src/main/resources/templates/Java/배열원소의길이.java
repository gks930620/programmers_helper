import java.util.Arrays;

public class 배열원소의길이 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] strlist1 = {"We", "are", "the", "world!"};
        int[] expected1 = {2, 3, 3, 6};
        int[] result1 = solution(strlist1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] strlist2 = {"I", "Love", "Programmers."};
        int[] expected2 = {1, 4, 12};
        int[] result2 = solution(strlist2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static int[] solution(String[] strlist) {
        int[] answer = {};
        return answer;
    }
}
