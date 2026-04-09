import java.util.Arrays;

public class 이모티콘할인행사 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] users1 = 1;
        int[] emoticons1 = 40;
        int[] expected1 = 10,000;
        int[] result1 = solution(users1, emoticons1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[][] users2 = 2;
        int[] emoticons2 = 25;
        int[] expected2 = 10,000;
        int[] result2 = solution(users2, emoticons2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[][] users3 = users;
        int[] emoticons3 = emoticons;
        int[] expected3 = result;
        int[] result3 = solution(users3, emoticons3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int[][] users4 = ---;
        int[] emoticons4 = ---;
        int[] expected4 = ---;
        int[] result4 = solution(users4, emoticons4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + Arrays.toString(expected4));
        System.out.println("결과값  : " + Arrays.toString(result4));
        System.out.println("비교    : " + Arrays.equals(expected4, result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        int[][] users5 = {{40, 10000}, {25, 10000}};
        int[] emoticons5 = {7000, 9000};
        int[] expected5 = {1, 5400};
        int[] result5 = solution(users5, emoticons5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + Arrays.toString(expected5));
        System.out.println("결과값  : " + Arrays.toString(result5));
        System.out.println("비교    : " + Arrays.equals(expected5, result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        int[][] users6 = {{40, 2900}, {23, 10000}, {11, 5200}, {5, 5900}, {40, 3100}, {27, 9200}, {32, 6900}};
        int[] emoticons6 = {1300, 1500, 1600, 4900};
        int[] expected6 = {4, 13860};
        int[] result6 = solution(users6, emoticons6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + Arrays.toString(expected6));
        System.out.println("결과값  : " + Arrays.toString(result6));
        System.out.println("비교    : " + Arrays.equals(expected6, result6));

    }

    public static int[] solution(int[][] users, int[] emoticons) {
        int[] answer = {};
        return answer;
    }
}
