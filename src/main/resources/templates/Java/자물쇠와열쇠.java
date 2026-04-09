public class 자물쇠와열쇠 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] key1 = {{0, 0, 0}, {1, 0, 0}, {0, 1, 1}};
        int[][] lock1 = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        boolean expected1 = true;
        boolean result1 = solution(key1, lock1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));

    }

    public static boolean solution(int[][] key, int[][] lock) {
        boolean answer = true;
        return answer;
    }
}
