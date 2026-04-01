import java.util.Arrays;

public class 기둥과보설치 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 5;
        int[][] build_frame1 = {{1,0,0,1},{1,1,1,1},{2,1,0,1},{2,2,1,1},{5,0,0,1},{5,1,0,1},{4,2,1,1},{3,2,1,1}};
        int[][] expected1 = {{1,0,0},{1,1,1},{2,1,0},{2,2,1},{3,2,1},{4,2,1},{5,0,0},{5,1,0}};
        int[][] result1 = solution(n1, build_frame1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected1));
        System.out.println("결과값  : " + Arrays.deepToString(result1));
        System.out.println("비교    : " + Arrays.deepEquals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 5;
        int[][] build_frame2 = {{0,0,0,1},{2,0,0,1},{4,0,0,1},{0,1,1,1},{1,1,1,1},{2,1,1,1},{3,1,1,1},{2,0,0,0},{1,1,1,0},{2,2,0,1}};
        int[][] expected2 = {{0,0,0},{0,1,1},{1,1,1},{2,1,1},{3,1,1},{4,0,0}};
        int[][] result2 = solution(n2, build_frame2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected2));
        System.out.println("결과값  : " + Arrays.deepToString(result2));
        System.out.println("비교    : " + Arrays.deepEquals(expected2, result2));

    }

    public static int[][] solution(int n, int[][] build_frame) {
        int[][] answer = {};
        return answer;
    }
}
