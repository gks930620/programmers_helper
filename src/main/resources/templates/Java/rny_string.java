public class rny_string {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String rny_string1 = "masterpiece";
        String expected1 = "rnasterpiece";
        String result1 = solution(rny_string1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String rny_string2 = "programmers";
        String expected2 = "prograrnrners";
        String result2 = solution(rny_string2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String rny_string3 = "jerry";
        String expected3 = "jerry";
        String result3 = solution(rny_string3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + expected3.equals(result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        String rny_string4 = "burn";
        String expected4 = "burn";
        String result4 = solution(rny_string4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + expected4.equals(result4));

    }

    public static String solution(String rny_string) {
        String answer = "";
        return answer;
    }
}
