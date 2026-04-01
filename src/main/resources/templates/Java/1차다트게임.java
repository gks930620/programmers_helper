public class 1차다트게임 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String dartResult1 = "1S2D*3T";
        int expected1 = 11* 2 + 22* 2 + 33;
        int result1 = solution(dartResult1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String dartResult2 = "1D2S#10S";
        int expected2 = 12+ 21* (-1) + 101;
        int result2 = solution(dartResult2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String dartResult3 = "1D2S0T";
        int expected3 = 12+ 21+ 03;
        int result3 = solution(dartResult3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        String dartResult4 = "1S*2T*3S";
        int expected4 = 11* 2 * 2 + 23* 2 + 31;
        int result4 = solution(dartResult4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        String dartResult5 = "1D#2S*3S";
        int expected5 = 12* (-1) * 2 + 21* 2 + 31;
        int result5 = solution(dartResult5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + expected5);
        System.out.println("결과값  : " + result5);
        System.out.println("비교    : " + (expected5 == result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        String dartResult6 = "1T2D3D#";
        int expected6 = 13+ 22+ 32* (-1);
        int result6 = solution(dartResult6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + expected6);
        System.out.println("결과값  : " + result6);
        System.out.println("비교    : " + (expected6 == result6));
        System.out.println();

        // --- 테스트 케이스 7 ---
        String dartResult7 = "1D2S3T*";
        int expected7 = 12+ 21* 2 + 33* 2;
        int result7 = solution(dartResult7);

        System.out.println("--- Test Case 7 ---");
        System.out.println("기대값  : " + expected7);
        System.out.println("결과값  : " + result7);
        System.out.println("비교    : " + (expected7 == result7));

    }

    public static int solution(String dartResult) {
        int answer = 0;
        return answer;
    }
}
