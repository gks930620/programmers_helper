import java.util.Arrays;

public class 최고속도 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] city1 = #1;
        int[][] road1 = 15%;
        int[] expected1 = 모든 도로는 x축에 평행합니다. 즉,y1=y2입니다.;
        int[] result1 = solution(city1, road1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[][] city2 = #2;
        int[][] road2 = 30%;
        int[] expected2 = 주어지는 모든 좌표의 절댓값은 40 이하의 정수입니다.;
        int[] result2 = solution(city2, road2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[][] city3 = #3;
        int[][] road3 = 55%;
        int[] expected3 = 추가 제한 사항 없음;
        int[] result3 = solution(city3, road3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int[][] city4 = city;
        int[][] road4 = road;
        int[] expected4 = result;
        int[] result4 = solution(city4, road4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + Arrays.toString(expected4));
        System.out.println("결과값  : " + Arrays.toString(result4));
        System.out.println("비교    : " + Arrays.equals(expected4, result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        int[][] city5 = ---;
        int[][] road5 = ---;
        int[] expected5 = ---;
        int[] result5 = solution(city5, road5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + Arrays.toString(expected5));
        System.out.println("결과값  : " + Arrays.toString(result5));
        System.out.println("비교    : " + Arrays.equals(expected5, result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        int[][] city6 = {{-1, 3}, {7, 3}, {1, -1}, {-2, 6}};
        int[][] road6 = {{-1, 7, 7, 7, 80}, {-3, 3, 9, 3, 45}, {-2, -4, -2, 6, 60}, {1, -4, 1, 8, 50}, {5, 1, 5, 7, 70}};
        int[] expected6 = {70, 50, 0};
        int[] result6 = solution(city6, road6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + Arrays.toString(expected6));
        System.out.println("결과값  : " + Arrays.toString(result6));
        System.out.println("비교    : " + Arrays.equals(expected6, result6));
        System.out.println();

        // --- 테스트 케이스 7 ---
        int[][] city7 = {{3, 5}, {3, 3}, {2, 1}, {9, 1}, {7, -1}};
        int[][] road7 = {{3, -2, 3, 4, 30}, {5, 1, 9, 1, 29}, {3, 4, 3, 8, 99}, {1, 1, 5, 1, 99}, {7, -3, 7, 5, 99}};
        int[] expected7 = {0, 30, 29, 29};
        int[] result7 = solution(city7, road7);

        System.out.println("--- Test Case 7 ---");
        System.out.println("기대값  : " + Arrays.toString(expected7));
        System.out.println("결과값  : " + Arrays.toString(result7));
        System.out.println("비교    : " + Arrays.equals(expected7, result7));

    }

    public static int[] solution(int[][] city, int[][] road) {
        int[] answer = {};
        return answer;
    }
}
