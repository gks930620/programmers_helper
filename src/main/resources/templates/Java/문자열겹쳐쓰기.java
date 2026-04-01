public class 문자열겹쳐쓰기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String my_string1 = "He11oWor1d";
        String overwrite_string1 = "lloWorl";
        int s1 = 2;
        String expected1 = "HelloWorld";
        String result1 = solution(my_string1, overwrite_string1, s1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String my_string2 = "Program29b8UYP";
        String overwrite_string2 = "merS123";
        int s2 = 7;
        String expected2 = "ProgrammerS123";
        String result2 = solution(my_string2, overwrite_string2, s2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));

    }

    public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        return answer;
    }
}
