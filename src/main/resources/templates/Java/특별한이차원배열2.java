public class 특별한이차원배열2 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] arr1 = {{5, 192, 33}, {192, 72, 95}, {33, 95, 999}};
        int expected1 = 1;
        int result1 = solution(arr1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[][] arr2 = {{19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723}, {587, 754, 723, 81}};
        int expected2 = 0;
        int result2 = solution(arr2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int[][] arr) {
        int answer = 0;
        return answer;
    }
}
