public class 전화번호목록 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] phone_book1 = {"119", "97674223", "1195524421"};
        boolean expected1 = false;
        boolean result1 = solution(phone_book1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] phone_book2 = {"123", "456", "789"};
        boolean expected2 = true;
        boolean result2 = solution(phone_book2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String[] phone_book3 = {"12", "123", "1235", "567", "88"};
        boolean expected3 = false;
        boolean result3 = solution(phone_book3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        return answer;
    }
}
