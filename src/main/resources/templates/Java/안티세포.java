import java.util.Arrays;

public class 안티세포 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] a1 = 0;
        int[] s1 = (1)(1)(1)(1);
        int[] expected1 = 초기 상태입니다.;
        int[] result1 = solution(a1, s1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] a2 = 1;
        int[] s2 = (1)(1)(1)(1);
        int[] expected2 = i=0일 때는Y가 존재하지 않으므로i를 1 증가시켰습니다.;
        int[] result2 = solution(a2, s2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[] a3 = 1;
        int[] s3 = (1,1)(1)(1);
        int[] expected3 = b[1]을 포함하는 안티 세포(X)와 그 왼쪽의 안티 세포(Y)를 합쳤습니다. 따라서c에i=1이 추가됩니다.;
        int[] result3 = solution(a3, s3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int[] a4 = 2;
        int[] s4 = (1,1)(1)(1);
        int[] expected4 = b[1]을 포함하는 안티 세포(X) 왼쪽의 안티 세포Y가 존재하지 않으므로i를 1 증가시켰습니다.;
        int[] result4 = solution(a4, s4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + Arrays.toString(expected4));
        System.out.println("결과값  : " + Arrays.toString(result4));
        System.out.println("비교    : " + Arrays.equals(expected4, result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        int[] a5 = 3;
        int[] s5 = (1,1)(1)(1);
        int[] expected5 = X의 모든 수의 합은 1이고,Y의 모든 수의 합은 2이므로, 둘은 합칠 수 없습니다. 따라서i을 1 증가시켰습니다.;
        int[] result5 = solution(a5, s5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + Arrays.toString(expected5));
        System.out.println("결과값  : " + Arrays.toString(result5));
        System.out.println("비교    : " + Arrays.equals(expected5, result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        int[] a6 = 3;
        int[] s6 = (1,1)(1,1);
        int[] expected6 = b[3]을 포함하는 안티 세포(X)와 그 왼쪽의 안티 세포(Y)를 합쳤습니다. 따라서c에i=3이 추가됩니다.;
        int[] result6 = solution(a6, s6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + Arrays.toString(expected6));
        System.out.println("결과값  : " + Arrays.toString(result6));
        System.out.println("비교    : " + Arrays.equals(expected6, result6));
        System.out.println();

        // --- 테스트 케이스 7 ---
        int[] a7 = 4;
        int[] s7 = (1,1)(1,1);
        int[] expected7 = b[3]을 포함하는 안티 세포(X)와 그 왼쪽의 안티 세포(Y)를 합칠 수 있었지만 그러지 않았습니다. 따라서i를 1 증가시켰습니다.;
        int[] result7 = solution(a7, s7);

        System.out.println("--- Test Case 7 ---");
        System.out.println("기대값  : " + Arrays.toString(expected7));
        System.out.println("결과값  : " + Arrays.toString(result7));
        System.out.println("비교    : " + Arrays.equals(expected7, result7));

    }

    public static int[] solution(int[] a, int[] s) {
        int[] answer = {};
        return answer;
    }
}
