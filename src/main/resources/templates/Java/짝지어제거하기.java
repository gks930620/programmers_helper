public class 짝지어제거하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String s1 = "baabaa";
        int expected1 = 1;
        int result1 = solution(s1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String s2 = "cdcd";
        int expected2 = 0;
        int result2 = solution(s2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(String s) {
        int answer = -1;
        return answer;
    }
}
