import java.util.Arrays;

public class 튜브의소개팅 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int m1 = 3;
        int n1 = 3;
        int s1 = 150;
        int[][] time_map1 = {{0, 2, 99}, {100, 100, 4}, {1, 2, 0}};
        int[] expected1 = {4, 103};
        int[] result1 = solution(m1, n1, s1, time_map1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int m2 = 4;
        int n2 = 6;
        int s2 = 25;
        int[][] time_map2 = {{0, 1, 1, -1, 2, 4}, {-1, 7, 2, 1, 5, 7}, {-1, 1, -1, 1, 6, 3}, {-1, 1, -1, -1, 7, 0}};
        int[] expected2 = {8, 15};
        int[] result2 = solution(m2, n2, s2, time_map2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int m3 = 5;
        int n3 = 5;
        int s3 = 12;
        int[][] time_map3 = {{0, 1, 1, 1, 1}, {9, 9, 9, 1, 9}, {1, 1, 1, 1, 9}, {1, 1, 5, 9, 9}, {1, 1, 1, 1, 0}};
        int[] expected3 = {12, 11};
        int[] result3 = solution(m3, n3, s3, time_map3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));

    }

    public static int[] solution(int m, int n, int s, int[][] time_map) {
        int[] answer = new int[2];
        return answer;
    }
}
