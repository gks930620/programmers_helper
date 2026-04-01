import java.util.Arrays;

public class 스마트한프로도 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = n;
        int[][] expected1 = 5;
        int[][] result1 = solution(n1, m1, a1, b1, k1, m11, m21, e11, e21);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected1));
        System.out.println("결과값  : " + Arrays.deepToString(result1));
        System.out.println("비교    : " + Arrays.deepEquals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = m;
        int[][] expected2 = 6;
        int[][] result2 = solution(n2, m2, a2, b2, k2, m12, m22, e12, e22);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected2));
        System.out.println("결과값  : " + Arrays.deepToString(result2));
        System.out.println("비교    : " + Arrays.deepEquals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int n3 = a;
        int[][] expected3 = {1, 1, 2, 2, 3, 4};
        int[][] result3 = solution(n3, m3, a3, b3, k3, m13, m23, e13, e23);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected3));
        System.out.println("결과값  : " + Arrays.deepToString(result3));
        System.out.println("비교    : " + Arrays.deepEquals(expected3, result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int n4 = b;
        int[][] expected4 = {2, 3, 3, 4, 5, 5};
        int[][] result4 = solution(n4, m4, a4, b4, k4, m14, m24, e14, e24);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected4));
        System.out.println("결과값  : " + Arrays.deepToString(result4));
        System.out.println("비교    : " + Arrays.deepEquals(expected4, result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        int n5 = k;
        int[][] expected5 = 2;
        int[][] result5 = solution(n5, m5, a5, b5, k5, m15, m25, e15, e25);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected5));
        System.out.println("결과값  : " + Arrays.deepToString(result5));
        System.out.println("비교    : " + Arrays.deepEquals(expected5, result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        int n6 = m1;
        int[][] expected6 = 2;
        int[][] result6 = solution(n6, m6, a6, b6, k6, m16, m26, e16, e26);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected6));
        System.out.println("결과값  : " + Arrays.deepToString(result6));
        System.out.println("비교    : " + Arrays.deepEquals(expected6, result6));
        System.out.println();

        // --- 테스트 케이스 7 ---
        int n7 = m2;
        int[][] expected7 = 2;
        int[][] result7 = solution(n7, m7, a7, b7, k7, m17, m27, e17, e27);

        System.out.println("--- Test Case 7 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected7));
        System.out.println("결과값  : " + Arrays.deepToString(result7));
        System.out.println("비교    : " + Arrays.deepEquals(expected7, result7));
        System.out.println();

        // --- 테스트 케이스 8 ---
        int n8 = e1;
        int[][] expected8 = {3, 6};
        int[][] result8 = solution(n8, m8, a8, b8, k8, m18, m28, e18, e28);

        System.out.println("--- Test Case 8 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected8));
        System.out.println("결과값  : " + Arrays.deepToString(result8));
        System.out.println("비교    : " + Arrays.deepEquals(expected8, result8));
        System.out.println();

        // --- 테스트 케이스 9 ---
        int n9 = e2;
        int[][] expected9 = {2, 4};
        int[][] result9 = solution(n9, m9, a9, b9, k9, m19, m29, e19, e29);

        System.out.println("--- Test Case 9 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected9));
        System.out.println("결과값  : " + Arrays.deepToString(result9));
        System.out.println("비교    : " + Arrays.deepEquals(expected9, result9));
        System.out.println();

        // --- 테스트 케이스 10 ---
        int n10 = answer;
        int[][] expected10 = {{0, 3}, {1, 2}, {0, 6}, {1, 4}};
        int[][] result10 = solution(n10, m10, a10, b10, k10, m110, m210, e110, e210);

        System.out.println("--- Test Case 10 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected10));
        System.out.println("결과값  : " + Arrays.deepToString(result10));
        System.out.println("비교    : " + Arrays.deepEquals(expected10, result10));

    }

    public static int[][] solution(int n, int m, int[] a, int[] b, int k, int m1, int m2, int[] e1, int[] e2) {
        int[][] answer = {};
        return answer;
    }
}
