public class 문자열이몇번등장하는지세기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String myString1 = "banana";
        String pat1 = "ana";
        int expected1 = 2;
        int result1 = solution(myString1, pat1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String myString2 = "aaaa";
        String pat2 = "aa";
        int expected2 = 3;
        int result2 = solution(myString2, pat2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(String myString, String pat) {
        int answer = 0;
        return answer;
    }
}
