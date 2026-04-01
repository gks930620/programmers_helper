import java.util.Arrays;

public class 배열의원소만큼추가하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] arr1 = {5, 1, 4};
        int[] expected1 = {5, 5, 5, 5, 5, 1, 4, 4, 4, 4};
        int[] result1 = solution(arr1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] arr2 = {6, 6};
        int[] expected2 = {6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6};
        int[] result2 = solution(arr2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[] arr3 = {1};
        int[] expected3 = {1};
        int[] result3 = solution(arr3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int[] arr4 = a;
        int[] expected4 = X;
        int[] result4 = solution(arr4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + Arrays.toString(expected4));
        System.out.println("결과값  : " + Arrays.toString(result4));
        System.out.println("비교    : " + Arrays.equals(expected4, result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        int[] arr5 = ---;
        int[] expected5 = ---;
        int[] result5 = solution(arr5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + Arrays.toString(expected5));
        System.out.println("결과값  : " + Arrays.toString(result5));
        System.out.println("비교    : " + Arrays.equals(expected5, result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        int[] arr6 = ;
        int[] expected6 = {};
        int[] result6 = solution(arr6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + Arrays.toString(expected6));
        System.out.println("결과값  : " + Arrays.toString(result6));
        System.out.println("비교    : " + Arrays.equals(expected6, result6));
        System.out.println();

        // --- 테스트 케이스 7 ---
        int[] arr7 = 5;
        int[] expected7 = {5, 5, 5, 5, 5};
        int[] result7 = solution(arr7);

        System.out.println("--- Test Case 7 ---");
        System.out.println("기대값  : " + Arrays.toString(expected7));
        System.out.println("결과값  : " + Arrays.toString(result7));
        System.out.println("비교    : " + Arrays.equals(expected7, result7));
        System.out.println();

        // --- 테스트 케이스 8 ---
        int[] arr8 = 1;
        int[] expected8 = {5, 5, 5, 5, 5, 1};
        int[] result8 = solution(arr8);

        System.out.println("--- Test Case 8 ---");
        System.out.println("기대값  : " + Arrays.toString(expected8));
        System.out.println("결과값  : " + Arrays.toString(result8));
        System.out.println("비교    : " + Arrays.equals(expected8, result8));
        System.out.println();

        // --- 테스트 케이스 9 ---
        int[] arr9 = 4;
        int[] expected9 = {5, 5, 5, 5, 5, 1, 4, 4, 4, 4};
        int[] result9 = solution(arr9);

        System.out.println("--- Test Case 9 ---");
        System.out.println("기대값  : " + Arrays.toString(expected9));
        System.out.println("결과값  : " + Arrays.toString(result9));
        System.out.println("비교    : " + Arrays.equals(expected9, result9));
        System.out.println();

        // --- 테스트 케이스 10 ---
        int[] arr10 = a;
        int[] expected10 = X;
        int[] result10 = solution(arr10);

        System.out.println("--- Test Case 10 ---");
        System.out.println("기대값  : " + Arrays.toString(expected10));
        System.out.println("결과값  : " + Arrays.toString(result10));
        System.out.println("비교    : " + Arrays.equals(expected10, result10));
        System.out.println();

        // --- 테스트 케이스 11 ---
        int[] arr11 = ---;
        int[] expected11 = ---;
        int[] result11 = solution(arr11);

        System.out.println("--- Test Case 11 ---");
        System.out.println("기대값  : " + Arrays.toString(expected11));
        System.out.println("결과값  : " + Arrays.toString(result11));
        System.out.println("비교    : " + Arrays.equals(expected11, result11));
        System.out.println();

        // --- 테스트 케이스 12 ---
        int[] arr12 = ;
        int[] expected12 = {};
        int[] result12 = solution(arr12);

        System.out.println("--- Test Case 12 ---");
        System.out.println("기대값  : " + Arrays.toString(expected12));
        System.out.println("결과값  : " + Arrays.toString(result12));
        System.out.println("비교    : " + Arrays.equals(expected12, result12));
        System.out.println();

        // --- 테스트 케이스 13 ---
        int[] arr13 = 6;
        int[] expected13 = {6, 6, 6, 6, 6, 6};
        int[] result13 = solution(arr13);

        System.out.println("--- Test Case 13 ---");
        System.out.println("기대값  : " + Arrays.toString(expected13));
        System.out.println("결과값  : " + Arrays.toString(result13));
        System.out.println("비교    : " + Arrays.equals(expected13, result13));
        System.out.println();

        // --- 테스트 케이스 14 ---
        int[] arr14 = 6;
        int[] expected14 = {6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6};
        int[] result14 = solution(arr14);

        System.out.println("--- Test Case 14 ---");
        System.out.println("기대값  : " + Arrays.toString(expected14));
        System.out.println("결과값  : " + Arrays.toString(result14));
        System.out.println("비교    : " + Arrays.equals(expected14, result14));
        System.out.println();

        // --- 테스트 케이스 15 ---
        int[] arr15 = a;
        int[] expected15 = X;
        int[] result15 = solution(arr15);

        System.out.println("--- Test Case 15 ---");
        System.out.println("기대값  : " + Arrays.toString(expected15));
        System.out.println("결과값  : " + Arrays.toString(result15));
        System.out.println("비교    : " + Arrays.equals(expected15, result15));
        System.out.println();

        // --- 테스트 케이스 16 ---
        int[] arr16 = ---;
        int[] expected16 = ---;
        int[] result16 = solution(arr16);

        System.out.println("--- Test Case 16 ---");
        System.out.println("기대값  : " + Arrays.toString(expected16));
        System.out.println("결과값  : " + Arrays.toString(result16));
        System.out.println("비교    : " + Arrays.equals(expected16, result16));
        System.out.println();

        // --- 테스트 케이스 17 ---
        int[] arr17 = ;
        int[] expected17 = {};
        int[] result17 = solution(arr17);

        System.out.println("--- Test Case 17 ---");
        System.out.println("기대값  : " + Arrays.toString(expected17));
        System.out.println("결과값  : " + Arrays.toString(result17));
        System.out.println("비교    : " + Arrays.equals(expected17, result17));
        System.out.println();

        // --- 테스트 케이스 18 ---
        int[] arr18 = 1;
        int[] expected18 = {1};
        int[] result18 = solution(arr18);

        System.out.println("--- Test Case 18 ---");
        System.out.println("기대값  : " + Arrays.toString(expected18));
        System.out.println("결과값  : " + Arrays.toString(result18));
        System.out.println("비교    : " + Arrays.equals(expected18, result18));

    }

    public static int[] solution(int[] arr) {
        int[] answer = {};
        return answer;
    }
}
