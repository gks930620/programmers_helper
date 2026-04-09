public class 점의위치구하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] dot1 = {2, 4};
        int expected1 = 1;
        int result1 = solution(dot1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] dot2 = {-7, 9};
        int expected2 = 2;
        int result2 = solution(dot2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int[] dot) {
        int answer = 0;
        return answer;
    }
}
