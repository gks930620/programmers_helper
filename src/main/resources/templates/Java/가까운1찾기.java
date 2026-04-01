public class 가까운1찾기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] arr1 = {0, 0, 0, 1};
        int idx1 = 1;
        int expected1 = 3;
        int result1 = solution(arr1, idx1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] arr2 = {1, 0, 0, 1, 0, 0};
        int idx2 = 4;
        int expected2 = -1;
        int result2 = solution(arr2, idx2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[] arr3 = {1, 1, 1, 1, 0};
        int idx3 = 3;
        int expected3 = 3;
        int result3 = solution(arr3, idx3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(int[] arr, int idx) {
        int answer = 0;
        return answer;
    }
}
