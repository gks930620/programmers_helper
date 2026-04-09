public class 글자지우기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String my_string1 = "apporoograpemmemprs";
        int[] indices1 = {1, 16, 6, 15, 0, 10, 11, 3};
        String expected1 = "programmers";
        String result1 = solution(my_string1, indices1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));

    }

    public static String solution(String my_string, int[] indices) {
        String answer = "";
        return answer;
    }
}
