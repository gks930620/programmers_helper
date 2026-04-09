public class 택배상자 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] order1 = {4, 3, 1, 2, 5};
        int expected1 = 2;
        int result1 = solution(order1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] order2 = {5, 4, 3, 2, 1};
        int expected2 = 5;
        int result2 = solution(order2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int[] order) {
        int answer = 0;
        return answer;
    }
}
