public class 기지국설치 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 11;
        int[] stations1 = {4, 11};
        int w1 = 1;
        int expected1 = 3;
        int result1 = solution(n1, stations1, w1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 16;
        int[] stations2 = {9};
        int w2 = 2;
        int expected2 = 3;
        int result2 = solution(n2, stations2, w2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int n, int[] stations, int w) {
        int answer = 0;
        return answer;
    }
}
