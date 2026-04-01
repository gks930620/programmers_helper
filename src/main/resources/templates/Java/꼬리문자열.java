public class 꼬리문자열 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] str_list1 = {"abc", "def", "ghi"};
        String ex1 = "ef";
        String expected1 = "abcghi";
        String result1 = solution(str_list1, ex1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] str_list2 = {"abc", "bbc", "cbc"};
        String ex2 = "c";
        String expected2 = "";
        String result2 = solution(str_list2, ex2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));

    }

    public static String solution(String[] str_list, String ex) {
        String answer = "";
        return answer;
    }
}
