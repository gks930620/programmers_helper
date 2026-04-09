public class 접두사인지확인하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String my_string1 = "banana";
        String is_prefix1 = "ban";
        int expected1 = 1;
        int result1 = solution(my_string1, is_prefix1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String my_string2 = "banana";
        String is_prefix2 = "nan";
        int expected2 = 0;
        int result2 = solution(my_string2, is_prefix2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String my_string3 = "banana";
        String is_prefix3 = "abcd";
        int expected3 = 0;
        int result3 = solution(my_string3, is_prefix3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        String my_string4 = "banana";
        String is_prefix4 = "bananan";
        int expected4 = 0;
        int result4 = solution(my_string4, is_prefix4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));

    }

    public static int solution(String my_string, String is_prefix) {
        int answer = 0;
        return answer;
    }
}
