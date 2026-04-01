public class 최빈값구하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] array1 = {1, 2, 3, 3, 3, 4};
        int expected1 = 3;
        int result1 = solution(array1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] array2 = {1, 1, 2, 2};
        int expected2 = -1;
        int result2 = solution(array2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[] array3 = {1};
        int expected3 = 1;
        int result3 = solution(array3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(int[] array) {
        int answer = 0;
        return answer;
    }
}
