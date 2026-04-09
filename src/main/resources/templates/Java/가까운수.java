public class 가까운수 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] array1 = {3, 10, 28};
        int n1 = 20;
        int expected1 = 28;
        int result1 = solution(array1, n1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] array2 = {10, 11, 12};
        int n2 = 13;
        int expected2 = 12;
        int result2 = solution(array2, n2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int[] array, int n) {
        int answer = 0;
        return answer;
    }
}
