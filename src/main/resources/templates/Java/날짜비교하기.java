public class 날짜비교하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] date11 = {2021, 12, 28};
        int[] date21 = {2021, 12, 29};
        int expected1 = 1;
        int result1 = solution(date11, date21);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] date12 = {1024, 10, 24};
        int[] date22 = {1024, 10, 24};
        int expected2 = 0;
        int result2 = solution(date12, date22);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int[] date1, int[] date2) {
        int answer = 0;
        return answer;
    }
}
