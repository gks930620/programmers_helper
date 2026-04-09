import java.util.Arrays;

public class 할일목록 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] todo_list1 = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished1 = {true, false, true, false};
        String[] expected1 = {"practiceguitar", "studygraph"};
        String[] result1 = solution(todo_list1, finished1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));

    }

    public static String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        return answer;
    }
}
