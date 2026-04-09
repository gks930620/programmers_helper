import java.util.Arrays;

public class PCCE기출문제10번데이터분석 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] data1 = 1;
        String ext1 = "20300104";
        int val_ext1 = 100;
        int[][] expected1 = 80;
        int[][] result1 = solution(data1, ext1, val_ext1, sort_by1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected1));
        System.out.println("결과값  : " + Arrays.deepToString(result1));
        System.out.println("비교    : " + Arrays.deepEquals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[][] data2 = 2;
        String ext2 = "20300804";
        int val_ext2 = 847;
        int[][] expected2 = 37;
        int[][] result2 = solution(data2, ext2, val_ext2, sort_by2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected2));
        System.out.println("결과값  : " + Arrays.deepToString(result2));
        System.out.println("비교    : " + Arrays.deepEquals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[][] data3 = 3;
        String ext3 = "20300401";
        int val_ext3 = 10;
        int[][] expected3 = 8;
        int[][] result3 = solution(data3, ext3, val_ext3, sort_by3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected3));
        System.out.println("결과값  : " + Arrays.deepToString(result3));
        System.out.println("비교    : " + Arrays.deepEquals(expected3, result3));

    }

    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        return answer;
    }
}
