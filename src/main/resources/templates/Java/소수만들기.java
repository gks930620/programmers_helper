public class 소수만들기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] nums1 = {1,2,3,4};
        int expected1 = 1;
        int result1 = solution(nums1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] nums2 = {1,2,7,6,4};
        int expected2 = 4;
        int result2 = solution(nums2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int[] nums) {
        int answer = -1;
        return answer;
    }
}
