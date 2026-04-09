public class 부족한금액계산하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int price1 = 3;
        int money1 = 20;
        int count1 = 4;
        long expected1 = 10L;
        long result1 = solution(price1, money1, count1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));

    }

    public static long solution(int price, int money, int count) {
        long answer = -1;
        return answer;
    }
}
