public class 배열비교하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] arr11 = {49, 13};
        int[] arr21 = {70, 11, 2};
        int expected1 = -1;
        int result1 = solution(arr11, arr21);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] arr12 = {100, 17, 84, 1};
        int[] arr22 = {55, 12, 65, 36};
        int expected2 = 1;
        int result2 = solution(arr12, arr22);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[] arr13 = {1, 2, 3, 4, 5};
        int[] arr23 = {3, 3, 3, 3, 3};
        int expected3 = 0;
        int result3 = solution(arr13, arr23);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        return answer;
    }
}
