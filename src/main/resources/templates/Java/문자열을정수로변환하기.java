public class 문자열을정수로변환하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String n_str1 = "10";
        int expected1 = 10;
        int result1 = solution(n_str1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String n_str2 = "8542";
        int expected2 = 8542;
        int result2 = solution(n_str2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(String n_str) {
        int answer = 0;
        return answer;
    }
}
