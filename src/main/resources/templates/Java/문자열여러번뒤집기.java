public class 문자열여러번뒤집기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String my_string1 = "rermgorpsam";
        int[][] queries1 = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        String expected1 = "programmers";
        String result1 = solution(my_string1, queries1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));

    }

    public static String solution(String my_string, int[][] queries) {
        String answer = "";
        return answer;
    }
}
