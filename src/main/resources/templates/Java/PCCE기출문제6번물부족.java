public class PCCE기출문제6번물부족 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int storage1 = 5141;
        int usage1 = 500;
        int[] change1 = {10, -10, 10, -10, 10, -10, 10, -10, 10, -10};
        int expected1 = -1;
        int result1 = solution(storage1, usage1, change1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int storage2 = 1000;
        int usage2 = 2000;
        int[] change2 = {-10, 25, -33};
        int expected2 = 1;
        int result2 = solution(storage2, usage2, change2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int storage, int usage, int[] change) {
        int answer = 0;
        return answer;
    }
}
