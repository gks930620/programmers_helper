import java.util.Arrays;

public class 메뉴리뉴얼 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] orders1 = 1번 손님;
        String[] expected1 = A, B, C, F, G;
        String[] result1 = solution(orders1, course1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] orders2 = 2번 손님;
        String[] expected2 = A, C;
        String[] result2 = solution(orders2, course2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String[] orders3 = 3번 손님;
        String[] expected3 = C, D, E;
        String[] result3 = solution(orders3, course3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        String[] orders4 = 4번 손님;
        String[] expected4 = A, C, D, E;
        String[] result4 = solution(orders4, course4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + Arrays.toString(expected4));
        System.out.println("결과값  : " + Arrays.toString(result4));
        System.out.println("비교    : " + Arrays.equals(expected4, result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        String[] orders5 = 5번 손님;
        String[] expected5 = B, C, F, G;
        String[] result5 = solution(orders5, course5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + Arrays.toString(expected5));
        System.out.println("결과값  : " + Arrays.toString(result5));
        System.out.println("비교    : " + Arrays.equals(expected5, result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        String[] orders6 = 6번 손님;
        String[] expected6 = A, C, D, E, H;
        String[] result6 = solution(orders6, course6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + Arrays.toString(expected6));
        System.out.println("결과값  : " + Arrays.toString(result6));
        System.out.println("비교    : " + Arrays.equals(expected6, result6));

    }

    public static String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        return answer;
    }
}
