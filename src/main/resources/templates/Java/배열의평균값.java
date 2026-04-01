public class 배열의평균값 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double expected1 = 5.5;
        double result1 = solution(numbers1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] numbers2 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        double expected2 = 94.0;
        double result2 = solution(numbers2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static double solution(int[] numbers) {
        double answer = 0;
        return answer;
    }
}
