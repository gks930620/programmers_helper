public class 구명보트 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] people1 = {70, 50, 80, 50};
        int limit1 = 100;
        int expected1 = 3;
        int result1 = solution(people1, limit1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] people2 = {70, 80, 50};
        int limit2 = 100;
        int expected2 = 3;
        int result2 = solution(people2, limit2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int[] people, int limit) {
        int answer = 0;
        return answer;
    }
}
