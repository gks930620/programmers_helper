import java.util.Arrays;

public class 주사위고르기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] dice1 = #1;
        int[] expected1 = {1, 2, 3, 4, 5, 6};
        int[] result1 = solution(dice1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[][] dice2 = #2;
        int[] expected2 = {3, 3, 3, 3, 4, 4};
        int[] result2 = solution(dice2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[][] dice3 = #3;
        int[] expected3 = {1, 3, 3, 4, 4, 4};
        int[] result3 = solution(dice3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int[][] dice4 = #4;
        int[] expected4 = {1, 1, 4, 4, 5, 5};
        int[] result4 = solution(dice4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + Arrays.toString(expected4));
        System.out.println("결과값  : " + Arrays.toString(result4));
        System.out.println("비교    : " + Arrays.equals(expected4, result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        int[][] dice5 = dice;
        int[] expected5 = result;
        int[] result5 = solution(dice5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + Arrays.toString(expected5));
        System.out.println("결과값  : " + Arrays.toString(result5));
        System.out.println("비교    : " + Arrays.equals(expected5, result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        int[][] dice6 = ---;
        int[] expected6 = ---;
        int[] result6 = solution(dice6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + Arrays.toString(expected6));
        System.out.println("결과값  : " + Arrays.toString(result6));
        System.out.println("비교    : " + Arrays.equals(expected6, result6));
        System.out.println();

        // --- 테스트 케이스 7 ---
        int[][] dice7 = {{1, 2, 3, 4, 5, 6}, {3, 3, 3, 3, 4, 4}, {1, 3, 3, 4, 4, 4}, {1, 1, 4, 4, 5, 5}};
        int[] expected7 = {1, 4};
        int[] result7 = solution(dice7);

        System.out.println("--- Test Case 7 ---");
        System.out.println("기대값  : " + Arrays.toString(expected7));
        System.out.println("결과값  : " + Arrays.toString(result7));
        System.out.println("비교    : " + Arrays.equals(expected7, result7));
        System.out.println();

        // --- 테스트 케이스 8 ---
        int[][] dice8 = {{1, 2, 3, 4, 5, 6}, {2, 2, 4, 4, 6, 6}};
        int[] expected8 = {2};
        int[] result8 = solution(dice8);

        System.out.println("--- Test Case 8 ---");
        System.out.println("기대값  : " + Arrays.toString(expected8));
        System.out.println("결과값  : " + Arrays.toString(result8));
        System.out.println("비교    : " + Arrays.equals(expected8, result8));
        System.out.println();

        // --- 테스트 케이스 9 ---
        int[][] dice9 = {{40, 41, 42, 43, 44, 45}, {43, 43, 42, 42, 41, 41}, {1, 1, 80, 80, 80, 80}, {70, 70, 1, 1, 70, 70}};
        int[] expected9 = {1, 3};
        int[] result9 = solution(dice9);

        System.out.println("--- Test Case 9 ---");
        System.out.println("기대값  : " + Arrays.toString(expected9));
        System.out.println("결과값  : " + Arrays.toString(result9));
        System.out.println("비교    : " + Arrays.equals(expected9, result9));
        System.out.println();

        // --- 테스트 케이스 10 ---
        int[][] dice10 = 주사위;
        int[] expected10 = 구성;
        int[] result10 = solution(dice10);

        System.out.println("--- Test Case 10 ---");
        System.out.println("기대값  : " + Arrays.toString(expected10));
        System.out.println("결과값  : " + Arrays.toString(result10));
        System.out.println("비교    : " + Arrays.equals(expected10, result10));
        System.out.println();

        // --- 테스트 케이스 11 ---
        int[][] dice11 = ---;
        int[] expected11 = ---;
        int[] result11 = solution(dice11);

        System.out.println("--- Test Case 11 ---");
        System.out.println("기대값  : " + Arrays.toString(expected11));
        System.out.println("결과값  : " + Arrays.toString(result11));
        System.out.println("비교    : " + Arrays.equals(expected11, result11));
        System.out.println();

        // --- 테스트 케이스 12 ---
        int[][] dice12 = #1;
        int[] expected12 = {1, 2, 3, 4, 5, 6};
        int[] result12 = solution(dice12);

        System.out.println("--- Test Case 12 ---");
        System.out.println("기대값  : " + Arrays.toString(expected12));
        System.out.println("결과값  : " + Arrays.toString(result12));
        System.out.println("비교    : " + Arrays.equals(expected12, result12));
        System.out.println();

        // --- 테스트 케이스 13 ---
        int[][] dice13 = #2;
        int[] expected13 = {2, 2, 4, 4, 6, 6};
        int[] result13 = solution(dice13);

        System.out.println("--- Test Case 13 ---");
        System.out.println("기대값  : " + Arrays.toString(expected13));
        System.out.println("결과값  : " + Arrays.toString(result13));
        System.out.println("비교    : " + Arrays.equals(expected13, result13));
        System.out.println();

        // --- 테스트 케이스 14 ---
        int[][] dice14 = 주사위;
        int[] expected14 = 구성;
        int[] result14 = solution(dice14);

        System.out.println("--- Test Case 14 ---");
        System.out.println("기대값  : " + Arrays.toString(expected14));
        System.out.println("결과값  : " + Arrays.toString(result14));
        System.out.println("비교    : " + Arrays.equals(expected14, result14));
        System.out.println();

        // --- 테스트 케이스 15 ---
        int[][] dice15 = ---;
        int[] expected15 = ---;
        int[] result15 = solution(dice15);

        System.out.println("--- Test Case 15 ---");
        System.out.println("기대값  : " + Arrays.toString(expected15));
        System.out.println("결과값  : " + Arrays.toString(result15));
        System.out.println("비교    : " + Arrays.equals(expected15, result15));
        System.out.println();

        // --- 테스트 케이스 16 ---
        int[][] dice16 = #1;
        int[] expected16 = {40, 41, 42, 43, 44, 45};
        int[] result16 = solution(dice16);

        System.out.println("--- Test Case 16 ---");
        System.out.println("기대값  : " + Arrays.toString(expected16));
        System.out.println("결과값  : " + Arrays.toString(result16));
        System.out.println("비교    : " + Arrays.equals(expected16, result16));
        System.out.println();

        // --- 테스트 케이스 17 ---
        int[][] dice17 = #2;
        int[] expected17 = {43, 43, 42, 42, 41, 41};
        int[] result17 = solution(dice17);

        System.out.println("--- Test Case 17 ---");
        System.out.println("기대값  : " + Arrays.toString(expected17));
        System.out.println("결과값  : " + Arrays.toString(result17));
        System.out.println("비교    : " + Arrays.equals(expected17, result17));
        System.out.println();

        // --- 테스트 케이스 18 ---
        int[][] dice18 = #3;
        int[] expected18 = {1, 1, 80, 80, 80, 80};
        int[] result18 = solution(dice18);

        System.out.println("--- Test Case 18 ---");
        System.out.println("기대값  : " + Arrays.toString(expected18));
        System.out.println("결과값  : " + Arrays.toString(result18));
        System.out.println("비교    : " + Arrays.equals(expected18, result18));
        System.out.println();

        // --- 테스트 케이스 19 ---
        int[][] dice19 = #4;
        int[] expected19 = {70, 70, 1, 1, 70, 70};
        int[] result19 = solution(dice19);

        System.out.println("--- Test Case 19 ---");
        System.out.println("기대값  : " + Arrays.toString(expected19));
        System.out.println("결과값  : " + Arrays.toString(result19));
        System.out.println("비교    : " + Arrays.equals(expected19, result19));

    }

    public static int[] solution(int[][] dice) {
        int[] answer = {};
        return answer;
    }
}
