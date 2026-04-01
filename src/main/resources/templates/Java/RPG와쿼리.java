import java.util.Arrays;

public class RPG와쿼리 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 5;
        int z1 = 5;
        int[][] roads1 = {{1,2,3},{0,3,2}};
        long[] queries1 = {0,1,2,3,4,5,6};
        long[] expected1 = {0,-1,1,2,3,1,4};
        long[] result1 = solution(n1, z1, roads1, queries1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));

    }

    public static long[] solution(int n, int z, int[][] roads, long[] queries) {
        long[] answer = {};
        return answer;
    }
}
