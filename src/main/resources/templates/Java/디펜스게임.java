public class 디펜스게임 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 7;
        int k1 = 3;
        int[] enemy1 = {4, 2, 4, 5, 3, 3, 1};
        int expected1 = 5;
        int result1 = solution(n1, k1, enemy1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 2;
        int k2 = 4;
        int[] enemy2 = {3, 3, 3, 3};
        int expected2 = 4;
        int result2 = solution(n2, k2, enemy2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int n, int k, int[] enemy) {
        int answer = 0;
        return answer;
    }
}
