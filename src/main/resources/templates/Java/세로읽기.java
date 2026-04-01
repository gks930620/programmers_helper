public class 세로읽기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String my_string1 = "ihrhbakrfpndopljhygc";
        int m1 = 4;
        int c1 = 2;
        String expected1 = "happy";
        String result1 = solution(my_string1, m1, c1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String my_string2 = "programmers";
        int m2 = 1;
        int c2 = 1;
        String expected2 = "programmers";
        String result2 = solution(my_string2, m2, c2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String my_string3 = "1열";
        int m3 = 2열;
        int c3 = 3열;
        String expected3 = "4열";
        String result3 = solution(my_string3, m3, c3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + expected3.equals(result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        String my_string4 = "---";
        int m4 = ---;
        int c4 = ---;
        String expected4 = "---";
        String result4 = solution(my_string4, m4, c4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + expected4.equals(result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        String my_string5 = "i";
        int m5 = h;
        int c5 = r;
        String expected5 = "h";
        String result5 = solution(my_string5, m5, c5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + expected5);
        System.out.println("결과값  : " + result5);
        System.out.println("비교    : " + expected5.equals(result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        String my_string6 = "b";
        int m6 = a;
        int c6 = k;
        String expected6 = "r";
        String result6 = solution(my_string6, m6, c6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + expected6);
        System.out.println("결과값  : " + result6);
        System.out.println("비교    : " + expected6.equals(result6));
        System.out.println();

        // --- 테스트 케이스 7 ---
        String my_string7 = "f";
        int m7 = p;
        int c7 = n;
        String expected7 = "d";
        String result7 = solution(my_string7, m7, c7);

        System.out.println("--- Test Case 7 ---");
        System.out.println("기대값  : " + expected7);
        System.out.println("결과값  : " + result7);
        System.out.println("비교    : " + expected7.equals(result7));
        System.out.println();

        // --- 테스트 케이스 8 ---
        String my_string8 = "o";
        int m8 = p;
        int c8 = l;
        String expected8 = "j";
        String result8 = solution(my_string8, m8, c8);

        System.out.println("--- Test Case 8 ---");
        System.out.println("기대값  : " + expected8);
        System.out.println("결과값  : " + result8);
        System.out.println("비교    : " + expected8.equals(result8));
        System.out.println();

        // --- 테스트 케이스 9 ---
        String my_string9 = "h";
        int m9 = y;
        int c9 = g;
        String expected9 = "c";
        String result9 = solution(my_string9, m9, c9);

        System.out.println("--- Test Case 9 ---");
        System.out.println("기대값  : " + expected9);
        System.out.println("결과값  : " + result9);
        System.out.println("비교    : " + expected9.equals(result9));

    }

    public static String solution(String my_string, int m, int c) {
        String answer = "";
        return answer;
    }
}
