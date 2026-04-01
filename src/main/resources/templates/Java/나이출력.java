public class 나이출력 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int age1 = 40;
        int expected1 = 1983;
        int result1 = solution(age1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int age2 = 23;
        int expected2 = 2000;
        int result2 = solution(age2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int age) {
        int answer = 0;
        return answer;
    }
}
