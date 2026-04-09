import java.util.Arrays;

public class 바탕화면정리 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] wallpaper1 = {".#...", "..#..", "...#."};
        int[] expected1 = {0, 1, 3, 4};
        int[] result1 = solution(wallpaper1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] wallpaper2 = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
        int[] expected2 = {1, 3, 5, 8};
        int[] result2 = solution(wallpaper2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String[] wallpaper3 = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
        int[] expected3 = {0, 0, 7, 9};
        int[] result3 = solution(wallpaper3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        String[] wallpaper4 = {"..", "#."};
        int[] expected4 = {1, 0, 2, 1};
        int[] result4 = solution(wallpaper4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + Arrays.toString(expected4));
        System.out.println("결과값  : " + Arrays.toString(result4));
        System.out.println("비교    : " + Arrays.equals(expected4, result4));

    }

    public static int[] solution(String[] wallpaper) {
        int[] answer = {};
        return answer;
    }
}
