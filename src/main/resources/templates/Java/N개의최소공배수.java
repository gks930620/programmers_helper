public class N개의최소공배수 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] arr1 = {2,6,8,14};
        int expected1 = 168;
        int result1 = solution(arr1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] arr2 = {1,2,3};
        int expected2 = 6;
        int result2 = solution(arr2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int[] arr) {
        int answer = 0;
        return answer;
    }
}
