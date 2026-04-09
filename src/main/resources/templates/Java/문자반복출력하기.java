public class 문자반복출력하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String my_string1 = "hello";
        int n1 = 3;
        String expected1 = "hhheeellllllooo";
        String result1 = solution(my_string1, n1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));

    }

    public static String solution(String my_string, int n) {
        String answer = "";
        return answer;
    }
}
