import java.util.Arrays;

public class 호텔방배정 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        long k1 = 1L;
        long[] expected1 = 1;
        long[] result1 = solution(k1, room_number1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        long k2 = 3L;
        long[] expected2 = 3;
        long[] result2 = solution(k2, room_number2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        long k3 = 4L;
        long[] expected3 = 4;
        long[] result3 = solution(k3, room_number3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        long k4 = 1L;
        long[] expected4 = 2;
        long[] result4 = solution(k4, room_number4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + Arrays.toString(expected4));
        System.out.println("결과값  : " + Arrays.toString(result4));
        System.out.println("비교    : " + Arrays.equals(expected4, result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        long k5 = 3L;
        long[] expected5 = 5;
        long[] result5 = solution(k5, room_number5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + Arrays.toString(expected5));
        System.out.println("결과값  : " + Arrays.toString(result5));
        System.out.println("비교    : " + Arrays.equals(expected5, result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        long k6 = 1L;
        long[] expected6 = 6;
        long[] result6 = solution(k6, room_number6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + Arrays.toString(expected6));
        System.out.println("결과값  : " + Arrays.toString(result6));
        System.out.println("비교    : " + Arrays.equals(expected6, result6));

    }

    public static long[] solution(long k, long[] room_number) {
        long[] answer = {};
        return answer;
    }
}
