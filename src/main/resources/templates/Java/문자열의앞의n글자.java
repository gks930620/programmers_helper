public class 문자열의앞의n글자 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String my_string1 = "ProgrammerS123";
        int n1 = 11;
        String expected1 = "ProgrammerS";
        String result1 = solution(my_string1, n1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String my_string2 = "He110W0r1d";
        int n2 = 5;
        String expected2 = "He110";
        String result2 = solution(my_string2, n2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));

    }

    public static String solution(String my_string, int n) {
        String answer = "";
        return answer;
    }
}
