import java.util.Arrays;

public class 다단계칫솔판매 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] enroll1 = young;
        String[] referral1 = 12;
        int[] expected1 = 1,200 원;
        int[] result1 = solution(enroll1, referral1, seller1, amount1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] enroll2 = john;
        String[] referral2 = 4;
        int[] expected2 = 400 원;
        int[] result2 = solution(enroll2, referral2, seller2, amount2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String[] enroll3 = tod;
        String[] referral3 = 2;
        int[] expected3 = 200 원;
        int[] result3 = solution(enroll3, referral3, seller3, amount3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        String[] enroll4 = emily;
        String[] referral4 = 5;
        int[] expected4 = 500 원;
        int[] result4 = solution(enroll4, referral4, seller4, amount4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + Arrays.toString(expected4));
        System.out.println("결과값  : " + Arrays.toString(result4));
        System.out.println("비교    : " + Arrays.equals(expected4, result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        String[] enroll5 = mary;
        String[] referral5 = 10;
        int[] expected5 = 1,000 원;
        int[] result5 = solution(enroll5, referral5, seller5, amount5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + Arrays.toString(expected5));
        System.out.println("결과값  : " + Arrays.toString(result5));
        System.out.println("비교    : " + Arrays.equals(expected5, result5));

    }

    public static int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = {};
        return answer;
    }
}
