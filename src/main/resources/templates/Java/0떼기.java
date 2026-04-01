public class 0떼기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String n_str1 = "0010";
        String expected1 = "10";
        String result1 = solution(n_str1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String n_str2 = "854020";
        String expected2 = "854020";
        String result2 = solution(n_str2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));

    }

    public static String solution(String n_str) {
        String answer = "";
        return answer;
    }
}
