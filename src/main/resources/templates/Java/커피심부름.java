public class 커피심부름 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] order1 = "iceamericano", "americanoice";
        int expected1 = 차가운 아메리카노;
        int result1 = solution(order1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] order2 = "hotamericano", "americanohot";
        int expected2 = 따뜻한 아메리카노;
        int result2 = solution(order2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String[] order3 = "icecafelatte", "cafelatteice";
        int expected3 = 차가운 카페 라테;
        int result3 = solution(order3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        String[] order4 = "hotcafelatte", "cafelattehot";
        int expected4 = 따뜻한 카페 라테;
        int result4 = solution(order4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        String[] order5 = "americano";
        int expected5 = 아메리카노;
        int result5 = solution(order5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + expected5);
        System.out.println("결과값  : " + result5);
        System.out.println("비교    : " + (expected5 == result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        String[] order6 = "cafelatte";
        int expected6 = 카페 라테;
        int result6 = solution(order6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + expected6);
        System.out.println("결과값  : " + result6);
        System.out.println("비교    : " + (expected6 == result6));
        System.out.println();

        // --- 테스트 케이스 7 ---
        String[] order7 = "anything";
        int expected7 = 아무거나;
        int result7 = solution(order7);

        System.out.println("--- Test Case 7 ---");
        System.out.println("기대값  : " + expected7);
        System.out.println("결과값  : " + result7);
        System.out.println("비교    : " + (expected7 == result7));
        System.out.println();

        // --- 테스트 케이스 8 ---
        String[] order8 = order;
        int expected8 = result;
        int result8 = solution(order8);

        System.out.println("--- Test Case 8 ---");
        System.out.println("기대값  : " + expected8);
        System.out.println("결과값  : " + result8);
        System.out.println("비교    : " + (expected8 == result8));
        System.out.println();

        // --- 테스트 케이스 9 ---
        String[] order9 = ---;
        int expected9 = ---;
        int result9 = solution(order9);

        System.out.println("--- Test Case 9 ---");
        System.out.println("기대값  : " + expected9);
        System.out.println("결과값  : " + result9);
        System.out.println("비교    : " + (expected9 == result9));
        System.out.println();

        // --- 테스트 케이스 10 ---
        String[] order10 = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
        int expected10 = 19000;
        int result10 = solution(order10);

        System.out.println("--- Test Case 10 ---");
        System.out.println("기대값  : " + expected10);
        System.out.println("결과값  : " + result10);
        System.out.println("비교    : " + (expected10 == result10));
        System.out.println();

        // --- 테스트 케이스 11 ---
        String[] order11 = {"americanoice", "americano", "iceamericano"};
        int expected11 = 13500;
        int result11 = solution(order11);

        System.out.println("--- Test Case 11 ---");
        System.out.println("기대값  : " + expected11);
        System.out.println("결과값  : " + result11);
        System.out.println("비교    : " + (expected11 == result11));

    }

    public static int solution(String[] order) {
        int answer = 0;
        return answer;
    }
}
