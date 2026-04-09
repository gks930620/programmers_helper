public class 머쓱이보다키큰사람 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] array1 = {149, 180, 192, 170};
        int height1 = 167;
        int expected1 = 3;
        int result1 = solution(array1, height1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] array2 = {180, 120, 140};
        int height2 = 190;
        int expected2 = 0;
        int result2 = solution(array2, height2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int[] array, int height) {
        int answer = 0;
        return answer;
    }
}
