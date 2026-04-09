public class PCCP기출문제3번아날로그시계 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int h11 = 0;
        int m11 = 5;
        int s11 = 30;
        int h21 = 0;
        int m21 = 7;
        int s21 = 0;
        int expected1 = 2;
        int result1 = solution(h11, m11, s11, h21, m21, s21);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int h12 = 12;
        int m12 = 0;
        int s12 = 0;
        int h22 = 12;
        int m22 = 0;
        int s22 = 30;
        int expected2 = 1;
        int result2 = solution(h12, m12, s12, h22, m22, s22);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int h13 = 0;
        int m13 = 6;
        int s13 = 1;
        int h23 = 0;
        int m23 = 6;
        int s23 = 6;
        int expected3 = 0;
        int result3 = solution(h13, m13, s13, h23, m23, s23);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int h14 = 11;
        int m14 = 59;
        int s14 = 30;
        int h24 = 12;
        int m24 = 0;
        int s24 = 0;
        int expected4 = 1;
        int result4 = solution(h14, m14, s14, h24, m24, s24);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        int h15 = 11;
        int m15 = 58;
        int s15 = 59;
        int h25 = 11;
        int m25 = 59;
        int s25 = 0;
        int expected5 = 1;
        int result5 = solution(h15, m15, s15, h25, m25, s25);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + expected5);
        System.out.println("결과값  : " + result5);
        System.out.println("비교    : " + (expected5 == result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        int h16 = 1;
        int m16 = 5;
        int s16 = 5;
        int h26 = 1;
        int m26 = 5;
        int s26 = 6;
        int expected6 = 2;
        int result6 = solution(h16, m16, s16, h26, m26, s26);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + expected6);
        System.out.println("결과값  : " + result6);
        System.out.println("비교    : " + (expected6 == result6));
        System.out.println();

        // --- 테스트 케이스 7 ---
        int h17 = 0;
        int m17 = 0;
        int s17 = 0;
        int h27 = 23;
        int m27 = 59;
        int s27 = 59;
        int expected7 = 2852;
        int result7 = solution(h17, m17, s17, h27, m27, s27);

        System.out.println("--- Test Case 7 ---");
        System.out.println("기대값  : " + expected7);
        System.out.println("결과값  : " + result7);
        System.out.println("비교    : " + (expected7 == result7));

    }

    public static int solution(int h1, int m1, int s1, int h2, int m2, int s2) {
        int answer = -1;
        return answer;
    }
}
