public class 가위바위보 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String rsp1 = "2";
        String expected1 = "0";
        String result1 = solution(rsp1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String rsp2 = "205";
        String expected2 = "052";
        String result2 = solution(rsp2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));

    }

    public static String solution(String rsp) {
        String answer = "";
        return answer;
    }
}
