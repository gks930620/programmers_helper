public class 중앙값구하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] array1 = {1, 2, 7, 10, 11};
        int expected1 = 7;
        int result1 = solution(array1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] array2 = {9, -1, 0};
        int expected2 = 0;
        int result2 = solution(array2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int[] array) {
        int answer = 0;
        return answer;
    }
}
