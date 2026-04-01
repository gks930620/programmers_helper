public class 숫자변환하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int x1 = 10;
        int y1 = 40;
        int n1 = 5;
        int expected1 = 2;
        int result1 = solution(x1, y1, n1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int x2 = 10;
        int y2 = 40;
        int n2 = 30;
        int expected2 = 1;
        int result2 = solution(x2, y2, n2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int x3 = 2;
        int y3 = 5;
        int n3 = 4;
        int expected3 = -1;
        int result3 = solution(x3, y3, n3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(int x, int y, int n) {
        int answer = 0;
        return answer;
    }
}
