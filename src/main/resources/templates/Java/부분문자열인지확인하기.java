public class 부분문자열인지확인하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String my_string1 = "banana";
        String target1 = "ana";
        int expected1 = 1;
        int result1 = solution(my_string1, target1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String my_string2 = "banana";
        String target2 = "wxyz";
        int expected2 = 0;
        int result2 = solution(my_string2, target2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(String my_string, String target) {
        int answer = 0;
        return answer;
    }
}
