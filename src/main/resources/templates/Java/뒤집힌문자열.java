public class 뒤집힌문자열 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String my_string1 = "jaron";
        String expected1 = "noraj";
        String result1 = solution(my_string1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String my_string2 = "bread";
        String expected2 = "daerb";
        String result2 = solution(my_string2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));

    }

    public static String solution(String my_string) {
        String answer = "";
        return answer;
    }
}
