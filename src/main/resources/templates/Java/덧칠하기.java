public class 덧칠하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 8;
        int m1 = 4;
        int[] section1 = {2, 3, 6};
        int expected1 = 2;
        int result1 = solution(n1, m1, section1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 5;
        int m2 = 4;
        int[] section2 = {1, 3};
        int expected2 = 1;
        int result2 = solution(n2, m2, section2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int n3 = 4;
        int m3 = 1;
        int[] section3 = {1, 2, 3, 4};
        int expected3 = 4;
        int result3 = solution(n3, m3, section3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(int n, int m, int[] section) {
        int answer = 0;
        return answer;
    }
}
