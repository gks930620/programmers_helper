public class 카드뭉치 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] cards11 = {"i", "drink", "water"};
        String[] cards21 = {"want", "to"};
        String[] goal1 = {"i", "want", "to", "drink", "water"};
        String expected1 = "Yes";
        String result1 = solution(cards11, cards21, goal1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] cards12 = {"i", "water", "drink"};
        String[] cards22 = {"want", "to"};
        String[] goal2 = {"i", "want", "to", "drink", "water"};
        String expected2 = "No";
        String result2 = solution(cards12, cards22, goal2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));

    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        return answer;
    }
}
