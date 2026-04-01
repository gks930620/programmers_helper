public class 푸드파이트대회 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] food1 = {1, 3, 4, 6};
        String expected1 = "1223330333221";
        String result1 = solution(food1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] food2 = {1, 7, 1, 2};
        String expected2 = "111303111";
        String result2 = solution(food2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));

    }

    public static String solution(int[] food) {
        String answer = "";
        return answer;
    }
}
