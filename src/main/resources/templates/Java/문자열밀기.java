public class 문자열밀기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String A1 = "hello";
        String B1 = "ohell";
        int expected1 = 1;
        int result1 = solution(A1, B1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String A2 = "apple";
        String B2 = "elppa";
        int expected2 = -1;
        int result2 = solution(A2, B2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String A3 = "atat";
        String B3 = "tata";
        int expected3 = 1;
        int result3 = solution(A3, B3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        String A4 = "abc";
        String B4 = "abc";
        int expected4 = 0;
        int result4 = solution(A4, B4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));

    }

    public static int solution(String A, String B) {
        int answer = 0;
        return answer;
    }
}
