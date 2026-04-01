public class 옷가게할인받기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int price1 = 150000;
        int expected1 = 142500;
        int result1 = solution(price1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int price2 = 580000;
        int expected2 = 464000;
        int result2 = solution(price2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int price) {
        int answer = 0;
        return answer;
    }
}
