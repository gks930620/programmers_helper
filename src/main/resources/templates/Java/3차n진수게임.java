public class 3차n진수게임 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 2;
        int t1 = 4;
        int m1 = 2;
        int p1 = 1;
        String expected1 = "0111";
        String result1 = solution(n1, t1, m1, p1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 16;
        int t2 = 16;
        int m2 = 2;
        int p2 = 1;
        String expected2 = "02468ACE11111111";
        String result2 = solution(n2, t2, m2, p2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int n3 = 16;
        int t3 = 16;
        int m3 = 2;
        int p3 = 2;
        String expected3 = "13579BDF01234567";
        String result3 = solution(n3, t3, m3, p3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + expected3.equals(result3));

    }

    public static String solution(int n, int t, int m, int p) {
        String answer = "";
        return answer;
    }
}
