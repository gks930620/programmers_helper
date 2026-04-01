public class 문자열뒤집기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String my_string1 = "Progra21Sremm3";
        int s1 = 6;
        int e1 = 12;
        String expected1 = "ProgrammerS123";
        String result1 = solution(my_string1, s1, e1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String my_string2 = "Stanley1yelnatS";
        int s2 = 4;
        int e2 = 10;
        String expected2 = "Stanley1yelnatS";
        String result2 = solution(my_string2, s2, e2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));

    }

    public static String solution(String my_string, int s, int e) {
        String answer = "";
        return answer;
    }
}
