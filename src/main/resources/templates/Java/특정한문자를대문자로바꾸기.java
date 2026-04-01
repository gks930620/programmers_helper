public class 특정한문자를대문자로바꾸기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String my_string1 = "programmers";
        String alp1 = "p";
        String expected1 = "Programmers";
        String result1 = solution(my_string1, alp1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String my_string2 = "lowercase";
        String alp2 = "x";
        String expected2 = "lowercase";
        String result2 = solution(my_string2, alp2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));

    }

    public static String solution(String my_string, String alp) {
        String answer = "";
        return answer;
    }
}
