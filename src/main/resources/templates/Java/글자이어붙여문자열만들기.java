public class 글자이어붙여문자열만들기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String my_string1 = "cvsgiorszzzmrpaqpe";
        int[] index_list1 = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        String expected1 = "programmers";
        String result1 = solution(my_string1, index_list1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String my_string2 = "zpiaz";
        int[] index_list2 = {1, 2, 0, 0, 3};
        String expected2 = "pizza";
        String result2 = solution(my_string2, index_list2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));

    }

    public static String solution(String my_string, int[] index_list) {
        String answer = "";
        return answer;
    }
}
