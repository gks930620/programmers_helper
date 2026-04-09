public class 숫자문자열과영단어 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String s1 = "0";
        int expected1 = zero;
        int result1 = solution(s1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String s2 = "1";
        int expected2 = one;
        int result2 = solution(s2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String s3 = "2";
        int expected3 = two;
        int result3 = solution(s3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        String s4 = "3";
        int expected4 = three;
        int result4 = solution(s4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        String s5 = "4";
        int expected5 = four;
        int result5 = solution(s5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + expected5);
        System.out.println("결과값  : " + result5);
        System.out.println("비교    : " + (expected5 == result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        String s6 = "5";
        int expected6 = five;
        int result6 = solution(s6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + expected6);
        System.out.println("결과값  : " + result6);
        System.out.println("비교    : " + (expected6 == result6));
        System.out.println();

        // --- 테스트 케이스 7 ---
        String s7 = "6";
        int expected7 = six;
        int result7 = solution(s7);

        System.out.println("--- Test Case 7 ---");
        System.out.println("기대값  : " + expected7);
        System.out.println("결과값  : " + result7);
        System.out.println("비교    : " + (expected7 == result7));
        System.out.println();

        // --- 테스트 케이스 8 ---
        String s8 = "7";
        int expected8 = seven;
        int result8 = solution(s8);

        System.out.println("--- Test Case 8 ---");
        System.out.println("기대값  : " + expected8);
        System.out.println("결과값  : " + result8);
        System.out.println("비교    : " + (expected8 == result8));
        System.out.println();

        // --- 테스트 케이스 9 ---
        String s9 = "8";
        int expected9 = eight;
        int result9 = solution(s9);

        System.out.println("--- Test Case 9 ---");
        System.out.println("기대값  : " + expected9);
        System.out.println("결과값  : " + result9);
        System.out.println("비교    : " + (expected9 == result9));
        System.out.println();

        // --- 테스트 케이스 10 ---
        String s10 = "9";
        int expected10 = nine;
        int result10 = solution(s10);

        System.out.println("--- Test Case 10 ---");
        System.out.println("기대값  : " + expected10);
        System.out.println("결과값  : " + result10);
        System.out.println("비교    : " + (expected10 == result10));
        System.out.println();

        // --- 테스트 케이스 11 ---
        String s11 = "s";
        int expected11 = result;
        int result11 = solution(s11);

        System.out.println("--- Test Case 11 ---");
        System.out.println("기대값  : " + expected11);
        System.out.println("결과값  : " + result11);
        System.out.println("비교    : " + (expected11 == result11));
        System.out.println();

        // --- 테스트 케이스 12 ---
        String s12 = "---";
        int expected12 = ---;
        int result12 = solution(s12);

        System.out.println("--- Test Case 12 ---");
        System.out.println("기대값  : " + expected12);
        System.out.println("결과값  : " + result12);
        System.out.println("비교    : " + (expected12 == result12));
        System.out.println();

        // --- 테스트 케이스 13 ---
        String s13 = "one4seveneight";
        int expected13 = 1478;
        int result13 = solution(s13);

        System.out.println("--- Test Case 13 ---");
        System.out.println("기대값  : " + expected13);
        System.out.println("결과값  : " + result13);
        System.out.println("비교    : " + (expected13 == result13));
        System.out.println();

        // --- 테스트 케이스 14 ---
        String s14 = "23four5six7";
        int expected14 = 234567;
        int result14 = solution(s14);

        System.out.println("--- Test Case 14 ---");
        System.out.println("기대값  : " + expected14);
        System.out.println("결과값  : " + result14);
        System.out.println("비교    : " + (expected14 == result14));
        System.out.println();

        // --- 테스트 케이스 15 ---
        String s15 = "2three45sixseven";
        int expected15 = 234567;
        int result15 = solution(s15);

        System.out.println("--- Test Case 15 ---");
        System.out.println("기대값  : " + expected15);
        System.out.println("결과값  : " + result15);
        System.out.println("비교    : " + (expected15 == result15));
        System.out.println();

        // --- 테스트 케이스 16 ---
        String s16 = "123";
        int expected16 = 123;
        int result16 = solution(s16);

        System.out.println("--- Test Case 16 ---");
        System.out.println("기대값  : " + expected16);
        System.out.println("결과값  : " + result16);
        System.out.println("비교    : " + (expected16 == result16));

    }

    public static int solution(String s) {
        int answer = 0;
        return answer;
    }
}
