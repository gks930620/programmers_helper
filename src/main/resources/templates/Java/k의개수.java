public class k의개수 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int i1 = 1;
        int j1 = 13;
        int k1 = 1;
        int expected1 = 6;
        int result1 = solution(i1, j1, k1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int i2 = 10;
        int j2 = 50;
        int k2 = 5;
        int expected2 = 5;
        int result2 = solution(i2, j2, k2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int i3 = 3;
        int j3 = 10;
        int k3 = 2;
        int expected3 = 0;
        int result3 = solution(i3, j3, k3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(int i, int j, int k) {
        int answer = 0;
        return answer;
    }
}
