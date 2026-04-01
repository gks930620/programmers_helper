public class 영어가싫어요 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String numbers1 = "onetwothreefourfivesixseveneightnine";
        long expected1 = 123456789L;
        long result1 = solution(numbers1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String numbers2 = "onefourzerosixseven";
        long expected2 = 14067L;
        long result2 = solution(numbers2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static long solution(String numbers) {
        long answer = 0;
        return answer;
    }
}
