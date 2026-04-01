public class 모스부호1 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String letter1 = ".... . .-.. .-.. ---";
        String expected1 = "hello";
        String result1 = solution(letter1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String letter2 = ".--. -.-- - .... --- -.";
        String expected2 = "python";
        String result2 = solution(letter2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));

    }

    public static String solution(String letter) {
        String answer = "";
        return answer;
    }
}
