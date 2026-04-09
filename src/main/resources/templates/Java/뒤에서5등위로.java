import java.util.Arrays;

public class 뒤에서5등위로 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] num_list1 = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
        int[] expected1 = {15, 32, 38, 46, 56};
        int[] result1 = solution(num_list1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));

    }

    public static int[] solution(int[] num_list) {
        int[] answer = {};
        return answer;
    }
}
