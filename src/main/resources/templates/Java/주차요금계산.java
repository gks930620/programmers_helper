import java.util.Arrays;

public class 주차요금계산 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] fees1 = 180;
        String[] records1 = 5000;
        int[] expected1 = 600;
        int[] result1 = solution(fees1, records1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] fees2 = 기본 시간(분);
        String[] records2 = 기본 요금(원);
        int[] expected2 = 단위 요금(원);
        int[] result2 = solution(fees2, records2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[] fees3 = ---;
        String[] records3 = ---;
        int[] expected3 = ---;
        int[] result3 = solution(fees3, records3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int[] fees4 = 120;
        String[] records4 = 0;
        int[] expected4 = 591;
        int[] result4 = solution(fees4, records4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + Arrays.toString(expected4));
        System.out.println("결과값  : " + Arrays.toString(result4));
        System.out.println("비교    : " + Arrays.equals(expected4, result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        int[] fees5 = 기본 시간(분);
        String[] records5 = 기본 요금(원);
        int[] expected5 = 단위 요금(원);
        int[] result5 = solution(fees5, records5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + Arrays.toString(expected5));
        System.out.println("결과값  : " + Arrays.toString(result5));
        System.out.println("비교    : " + Arrays.equals(expected5, result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        int[] fees6 = ---;
        String[] records6 = ---;
        int[] expected6 = ---;
        int[] result6 = solution(fees6, records6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + Arrays.toString(expected6));
        System.out.println("결과값  : " + Arrays.toString(result6));
        System.out.println("비교    : " + Arrays.equals(expected6, result6));
        System.out.println();

        // --- 테스트 케이스 7 ---
        int[] fees7 = 1;
        String[] records7 = 461;
        int[] expected7 = 10;
        int[] result7 = solution(fees7, records7);

        System.out.println("--- Test Case 7 ---");
        System.out.println("기대값  : " + Arrays.toString(expected7));
        System.out.println("결과값  : " + Arrays.toString(result7));
        System.out.println("비교    : " + Arrays.equals(expected7, result7));

    }

    public static int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        return answer;
    }
}
