public class 조이스틱 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String name1 = "JEROEN";
        int expected1 = 56;
        int result1 = solution(name1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String name2 = "JAN";
        int expected2 = 23;
        int result2 = solution(name2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(String name) {
        int answer = 0;
        return answer;
    }
}
