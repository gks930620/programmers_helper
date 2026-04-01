public class 핸드폰번호가리기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String phone_number1 = "01033334444";
        String expected1 = "*******4444";
        String result1 = solution(phone_number1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String phone_number2 = "027778888";
        String expected2 = "*****8888";
        String result2 = solution(phone_number2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));

    }

    public static String solution(String phone_number) {
        String answer = "";
        return answer;
    }
}
