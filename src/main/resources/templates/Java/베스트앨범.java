import java.util.Arrays;

public class 베스트앨범 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] genres1 = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays1 = {500, 600, 150, 800, 2500};
        int[] expected1 = {4, 1, 3, 0};
        int[] result1 = solution(genres1, plays1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));

    }

    public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        return answer;
    }
}
