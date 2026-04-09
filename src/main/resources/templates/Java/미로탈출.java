public class 미로탈출 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 3;
        int start1 = 1;
        int end1 = 3;
        int[][] roads1 = {{1, 2, 2}, {3, 2, 3}};
        int[] traps1 = {2};
        int expected1 = 5;
        int result1 = solution(n1, start1, end1, roads1, traps1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 4;
        int start2 = 1;
        int end2 = 4;
        int[][] roads2 = {{1, 2, 1}, {3, 2, 1}, {2, 4, 1}};
        int[] traps2 = {2, 3};
        int expected2 = 4;
        int result2 = solution(n2, start2, end2, roads2, traps2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int n, int start, int end, int[][] roads, int[] traps) {
        int answer = 0;
        return answer;
    }
}
