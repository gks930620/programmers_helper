import java.util.Arrays;

public class 가사검색 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] words1 = {"frodo", "front", "frost", "frozen", "frame", "kakao"};
        String[] queries1 = {"fro??", "????o", "fr???", "fro???", "pro?"};
        int[] expected1 = {3, 2, 4, 1, 0};
        int[] result1 = solution(words1, queries1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));

    }

    public static int[] solution(String[] words, String[] queries) {
        int[] answer = {};
        return answer;
    }
}
