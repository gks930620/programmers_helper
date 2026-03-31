

public class 완전범죄{
    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] info1 = {{1, 2}, {2, 3}, {2, 1}};
        int n1 = 4;
        int m1 = 4;
        int expected1 = 2;
        int result1 = solution(info1, n1, m1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값 : " + expected1);
        System.out.println("결과값 : " + result1);
        System.out.println("비교   : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[][] info2 = {{1, 2}, {2, 3}, {2, 1}};
        int n2 = 1;
        int m2 = 7;
        int expected2 = 0;
        int result2 = solution(info2, n2, m2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값 : " + expected2);
        System.out.println("결과값 : " + result2);
        System.out.println("비교   : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[][] info3 = {{3, 3}, {3, 3}};
        int n3 = 7;
        int m3 = 1;
        int expected3 = 6;
        int result3 = solution(info3, n3, m3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값 : " + expected3);
        System.out.println("결과값 : " + result3);
        System.out.println("비교   : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int[][] info4 = {{3, 3}, {3, 3}};
        int n4 = 6;
        int m4 = 1;
        int expected4 = -1;
        int result4 = solution(info4, n4, m4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값 : " + expected4);
        System.out.println("결과값 : " + result4);
        System.out.println("비교   : " + (expected4 == result4));
    }

    public static int solution(int[][] info, int n, int m) {
        int answer = 0;
        return answer;
    }

}