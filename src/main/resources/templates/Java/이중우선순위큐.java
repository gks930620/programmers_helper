import java.util.Arrays;

public class 이중우선순위큐 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] operations1 = I 숫자;
        int[] expected1 = 큐에 주어진 숫자를 삽입합니다.;
        int[] result1 = solution(operations1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] operations2 = D 1;
        int[] expected2 = 큐에서 최댓값을 삭제합니다.;
        int[] result2 = solution(operations2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String[] operations3 = D -1;
        int[] expected3 = 큐에서 최솟값을 삭제합니다.;
        int[] result3 = solution(operations3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        String[] operations4 = operations;
        int[] expected4 = return;
        int[] result4 = solution(operations4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + Arrays.toString(expected4));
        System.out.println("결과값  : " + Arrays.toString(result4));
        System.out.println("비교    : " + Arrays.equals(expected4, result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        String[] operations5 = ---;
        int[] expected5 = ---;
        int[] result5 = solution(operations5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + Arrays.toString(expected5));
        System.out.println("결과값  : " + Arrays.toString(result5));
        System.out.println("비교    : " + Arrays.equals(expected5, result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        String[] operations6 = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        int[] expected6 = {0,0};
        int[] result6 = solution(operations6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + Arrays.toString(expected6));
        System.out.println("결과값  : " + Arrays.toString(result6));
        System.out.println("비교    : " + Arrays.equals(expected6, result6));
        System.out.println();

        // --- 테스트 케이스 7 ---
        String[] operations7 = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        int[] expected7 = {333, -45};
        int[] result7 = solution(operations7);

        System.out.println("--- Test Case 7 ---");
        System.out.println("기대값  : " + Arrays.toString(expected7));
        System.out.println("결과값  : " + Arrays.toString(result7));
        System.out.println("비교    : " + Arrays.equals(expected7, result7));

    }

    public static int[] solution(String[] operations) {
        int[] answer = {};
        return answer;
    }
}
