public class 홀수vs짝수 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] num_list1 = {4, 2, 6, 1, 7, 6};
        int expected1 = 17;
        int result1 = solution(num_list1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] num_list2 = {-1, 2, 5, 6, 3};
        int expected2 = 8;
        int result2 = solution(num_list2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int[] num_list) {
        int answer = 0;
        return answer;
    }
}
