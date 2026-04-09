import java.util.Arrays;

public class 여행경로 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[][] tickets1 = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
        String[] expected1 = {"ICN", "JFK", "HND", "IAD"};
        String[] result1 = solution(tickets1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[][] tickets2 = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
        String[] expected2 = {"ICN", "ATL", "ICN", "SFO", "ATL", "SFO"};
        String[] result2 = solution(tickets2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static String[] solution(String[][] tickets) {
        String[] answer = {};
        return answer;
    }
}
