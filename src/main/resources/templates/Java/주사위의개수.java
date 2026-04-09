public class 주사위의개수 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] box1 = {1, 1, 1};
        int n1 = 1;
        int expected1 = 1;
        int result1 = solution(box1, n1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] box2 = {10, 8, 6};
        int n2 = 3;
        int expected2 = 12;
        int result2 = solution(box2, n2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int[] box, int n) {
        int answer = 0;
        return answer;
    }
}
