public class 택배배달과수거하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 1개;
        int[] deliveries1 = 0개;
        int[] pickups1 = 3개;
        long expected1 = 2개L;
        long result1 = solution(cap1, n1, deliveries1, pickups1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 0개;
        int[] deliveries2 = 3개;
        int[] pickups2 = 0개;
        long expected2 = 0개L;
        long result2 = solution(cap2, n2, deliveries2, pickups2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = -1;
        return answer;
    }
}
