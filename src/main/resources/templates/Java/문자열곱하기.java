public class 문자열곱하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String my_string1 = "string";
        int k1 = 3;
        String expected1 = "stringstringstring";
        String result1 = solution(my_string1, k1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String my_string2 = "love";
        int k2 = 10;
        String expected2 = "lovelovelovelovelovelovelovelovelovelove";
        String result2 = solution(my_string2, k2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));

    }

    public static String solution(String my_string, int k) {
        String answer = "";
        return answer;
    }
}
