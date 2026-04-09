public class 종이자르기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int M1 = 2;
        int N1 = 2;
        int expected1 = 3;
        int result1 = solution(M1, N1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int M2 = 2;
        int N2 = 5;
        int expected2 = 9;
        int result2 = solution(M2, N2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int M3 = 1;
        int N3 = 1;
        int expected3 = 0;
        int result3 = solution(M3, N3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(int M, int N) {
        int answer = 0;
        return answer;
    }
}
