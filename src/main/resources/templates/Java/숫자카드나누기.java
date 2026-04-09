public class 숫자카드나누기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] arrayA1 = {10, 17};
        int[] arrayB1 = {5, 20};
        int expected1 = 0;
        int result1 = solution(arrayA1, arrayB1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] arrayA2 = {10, 20};
        int[] arrayB2 = {5, 17};
        int expected2 = 10;
        int result2 = solution(arrayA2, arrayB2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[] arrayA3 = {14, 35, 119};
        int[] arrayB3 = {18, 30, 102};
        int expected3 = 7;
        int result3 = solution(arrayA3, arrayB3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        return answer;
    }
}
