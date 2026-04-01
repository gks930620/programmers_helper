public class 큰수만들기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String number1 = "1924";
        int k1 = 2;
        String expected1 = "94";
        String result1 = solution(number1, k1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String number2 = "1231234";
        int k2 = 3;
        String expected2 = "3234";
        String result2 = solution(number2, k2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String number3 = "4177252841";
        int k3 = 4;
        String expected3 = "775841";
        String result3 = solution(number3, k3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + expected3.equals(result3));

    }

    public static String solution(String number, int k) {
        String answer = "";
        return answer;
    }
}
