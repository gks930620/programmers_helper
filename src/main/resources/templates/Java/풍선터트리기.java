public class 풍선터트리기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] a1 = {9,-1,-5};
        int expected1 = 3;
        int result1 = solution(a1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] a2 = {-16,27,65,-2,58,-92,-71,-68,-61,-33};
        int expected2 = 6;
        int result2 = solution(a2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int[] a) {
        int answer = 0;
        return answer;
    }
}
