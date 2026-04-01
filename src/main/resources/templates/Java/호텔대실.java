public class 호텔대실 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[][] book_time1 = {{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}};
        int expected1 = 3;
        int result1 = solution(book_time1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[][] book_time2 = {{"09:10", "10:10"}, {"10:20", "12:20"}};
        int expected2 = 1;
        int result2 = solution(book_time2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String[][] book_time3 = {{"10:20", "12:30"}, {"10:20", "12:30"}, {"10:20", "12:30"}};
        int expected3 = 3;
        int result3 = solution(book_time3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(String[][] book_time) {
        int answer = 0;
        return answer;
    }
}
