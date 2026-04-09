public class 최댓값과최솟값 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String s1 = "1 2 3 4";
        String expected1 = "1 4";
        String result1 = solution(s1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String s2 = "-1 -2 -3 -4";
        String expected2 = "-4 -1";
        String result2 = solution(s2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String s3 = "-1 -1";
        String expected3 = "-1 -1";
        String result3 = solution(s3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + expected3.equals(result3));

    }

    public static String solution(String s) {
        String answer = "";
        return answer;
    }
}
