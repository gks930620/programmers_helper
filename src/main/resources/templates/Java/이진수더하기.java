public class 이진수더하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String bin11 = "10";
        String bin21 = "11";
        String expected1 = "101";
        String result1 = solution(bin11, bin21);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String bin12 = "1001";
        String bin22 = "1111";
        String expected2 = "11000";
        String result2 = solution(bin12, bin22);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));

    }

    public static String solution(String bin1, String bin2) {
        String answer = "";
        return answer;
    }
}
