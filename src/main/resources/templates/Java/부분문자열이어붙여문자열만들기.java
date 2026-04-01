public class 부분문자열이어붙여문자열만들기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] my_strings1 = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts1 = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};
        String expected1 = "programmers";
        String result1 = solution(my_strings1, parts1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));

    }

    public static String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        return answer;
    }
}
