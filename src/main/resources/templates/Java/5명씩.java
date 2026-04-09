import java.util.Arrays;

public class 5명씩 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] names1 = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        String[] expected1 = {"nami", "vex"};
        String[] result1 = solution(names1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));

    }

    public static String[] solution(String[] names) {
        String[] answer = {};
        return answer;
    }
}
