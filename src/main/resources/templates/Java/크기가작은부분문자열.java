public class 크기가작은부분문자열 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String t1 = "3141592";
        String p1 = "271";
        int expected1 = 2;
        int result1 = solution(t1, p1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String t2 = "500220839878";
        String p2 = "7";
        int expected2 = 8;
        int result2 = solution(t2, p2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String t3 = "10203";
        String p3 = "15";
        int expected3 = 3;
        int result3 = solution(t3, p3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(String t, String p) {
        int answer = 0;
        return answer;
    }
}
