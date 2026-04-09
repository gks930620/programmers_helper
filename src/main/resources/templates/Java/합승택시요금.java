public class 합승택시요금 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 6;
        int s1 = 4;
        int a1 = 6;
        int b1 = 2;
        int[][] fares1 = {{4, 1, 10}, {3, 5, 24}, {5, 6, 2}, {3, 1, 41}, {5, 1, 24}, {4, 6, 50}, {2, 4, 66}, {2, 3, 22}, {1, 6, 25}};
        int expected1 = 82;
        int result1 = solution(n1, s1, a1, b1, fares1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 7;
        int s2 = 3;
        int a2 = 4;
        int b2 = 1;
        int[][] fares2 = {{5, 7, 9}, {4, 6, 4}, {3, 6, 1}, {3, 2, 3}, {2, 1, 6}};
        int expected2 = 14;
        int result2 = solution(n2, s2, a2, b2, fares2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int n3 = 6;
        int s3 = 4;
        int a3 = 5;
        int b3 = 6;
        int[][] fares3 = {{2,6,6}, {6,3,7}, {4,6,7}, {6,5,11}, {2,5,12}, {5,3,20}, {2,4,8}, {4,3,9}};
        int expected3 = 18;
        int result3 = solution(n3, s3, a3, b3, fares3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(int n, int s, int a, int b, int[][] fares) {
        int answer = 0;
        return answer;
    }
}
