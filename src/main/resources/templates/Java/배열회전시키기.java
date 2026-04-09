import java.util.Arrays;

public class 배열회전시키기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] numbers1 = {1, 2, 3};
        String direction1 = "right";
        int[] expected1 = {3, 1, 2};
        int[] result1 = solution(numbers1, direction1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] numbers2 = {4, 455, 6, 4, -1, 45, 6};
        String direction2 = "left";
        int[] expected2 = {455, 6, 4, -1, 45, 6, 4};
        int[] result2 = solution(numbers2, direction2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        return answer;
    }
}
