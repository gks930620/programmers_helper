public class 브라이언의고민 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String sentence1 = "HaEaLaLaObWORLDb";
        String expected1 = "HELLO WORLD";
        String result1 = solution(sentence1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String sentence2 = "SpIpGpOpNpGJqOqA";
        String expected2 = "SIGONG JOA";
        String result2 = solution(sentence2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String sentence3 = "AxAxAxAoBoBoB";
        String expected3 = "invalid";
        String result3 = solution(sentence3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + expected3.equals(result3));

    }

    public static String solution(String sentence) {
        String answer = "";
        return answer;
    }
}
