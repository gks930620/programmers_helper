public class 스티커모으기2 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int sticker1 = [14 6 5 11 3 9 2 10];
        int expected1 = 36;
        int result1 = solution(sticker1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int sticker2 = [1 3 2 5 4];
        int expected2 = 8;
        int result2 = solution(sticker2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int sticker) {
        int answer = 0;
        return answer;
    }
}
