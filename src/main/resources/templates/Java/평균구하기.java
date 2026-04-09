public class 평균구하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] arr1 = {1,2,3,4};
        double expected1 = 2.5;
        double result1 = solution(arr1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] arr2 = {5,5};
        double expected2 = 5;
        double result2 = solution(arr2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static double solution(int[] arr) {
        double answer = 0;
        return answer;
    }
}
