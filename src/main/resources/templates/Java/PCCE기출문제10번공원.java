public class PCCE기출문제10번공원 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] mats1 = {5,3,2};
        String[][] park1 = {{"A", "A", "-1", "B", "B", "B", "B", "-1"}, {"A", "A", "-1", "B", "B", "B", "B", "-1"}, {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"}, {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}, {"D", "D", "-1", "-1", "-1", "-1", "-1", "F"}, {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}};
        int expected1 = 3;
        int result1 = solution(mats1, park1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));

    }

    public static int solution(int[] mats, String[][] park) {
        int answer = 0;
        return answer;
    }
}
