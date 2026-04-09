public class 폰켓몬 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] nums1 = {3,1,2,3};
        int expected1 = 2;
        int result1 = solution(nums1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] nums2 = {3,3,3,2,2,4};
        int expected2 = 3;
        int result2 = solution(nums2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[] nums3 = {3,3,3,2,2,2};
        int expected3 = 2;
        int result3 = solution(nums3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(int[] nums) {
        int answer = 0;
        return answer;
    }
}
