public class 인덱스바꾸기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String my_string1 = "hello";
        int num11 = 1;
        int num21 = 2;
        String expected1 = "hlelo";
        String result1 = solution(my_string1, num11, num21);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String my_string2 = "I love you";
        int num12 = 3;
        int num22 = 6;
        String expected2 = "I l veoyou";
        String result2 = solution(my_string2, num12, num22);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));

    }

    public static String solution(String my_string, int num1, int num2) {
        String answer = "";
        return answer;
    }
}
