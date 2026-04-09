public class 소수찾기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String numbers1 = "17";
        int expected1 = 3;
        int result1 = solution(numbers1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String numbers2 = "011";
        int expected2 = 2;
        int result2 = solution(numbers2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(String numbers) {
        int answer = 0;
        return answer;
    }
}
