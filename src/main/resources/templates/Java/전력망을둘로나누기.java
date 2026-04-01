public class 전력망을둘로나누기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 9;
        int[][] wires1 = {{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};
        int expected1 = 3;
        int result1 = solution(n1, wires1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 4;
        int[][] wires2 = {{1,2},{2,3},{3,4}};
        int expected2 = 0;
        int result2 = solution(n2, wires2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int n3 = 7;
        int[][] wires3 = {{1,2},{2,7},{3,7},{3,4},{4,5},{6,7}};
        int expected3 = 1;
        int result3 = solution(n3, wires3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(int n, int[][] wires) {
        int answer = -1;
        return answer;
    }
}
