public class 등차수열의특정한항만더하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int a1 = 3;
        int d1 = 4;
        boolean[] included1 = {true, false, false, true, true};
        int expected1 = 37;
        int result1 = solution(a1, d1, included1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int a2 = 7;
        int d2 = 1;
        boolean[] included2 = {false, false, false, true, false, false, false};
        int expected2 = 10;
        int result2 = solution(a2, d2, included2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;
        return answer;
    }
}
