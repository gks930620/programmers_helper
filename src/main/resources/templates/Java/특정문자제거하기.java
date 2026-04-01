public class 특정문자제거하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String my_string1 = "abcdef";
        String letter1 = "f";
        String expected1 = "abcde";
        String result1 = solution(my_string1, letter1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String my_string2 = "BCBdbe";
        String letter2 = "B";
        String expected2 = "Cdbe";
        String result2 = solution(my_string2, letter2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));

    }

    public static String solution(String my_string, String letter) {
        String answer = "";
        return answer;
    }
}
