public class 특정문자열로끝나는가장긴부분문자열찾기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String myString1 = "AbCdEFG";
        String pat1 = "dE";
        String expected1 = "AbCdE";
        String result1 = solution(myString1, pat1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String myString2 = "AAAAaaaa";
        String pat2 = "a";
        String expected2 = "AAAAaaaa";
        String result2 = solution(myString2, pat2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));

    }

    public static String solution(String myString, String pat) {
        String answer = "";
        return answer;
    }
}
