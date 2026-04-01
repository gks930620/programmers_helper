public class 숫자게임 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] A1 = {5,1,3,7};
        int[] B1 = {2,2,6,8};
        int expected1 = 3;
        int result1 = solution(A1, B1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] A2 = {2,2,2,2};
        int[] B2 = {1,1,1,1};
        int expected2 = 0;
        int result2 = solution(A2, B2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int[] A, int[] B) {
        int answer = -1;
        return answer;
    }
}
