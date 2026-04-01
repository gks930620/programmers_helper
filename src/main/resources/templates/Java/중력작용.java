import java.util.Arrays;

public class 중력작용 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] values1 = {1,10,100,1000,10000};
        int[][] edges1 = {{1,2},{1,3},{2,4},{2,5}};
        int[][] queries1 = {{1,-1},{2,-1},{3,-1},{4,-1},{5,-1},{4,1000},{1,-1},{2,-1},{3,-1},{4,-1},{5,-1},{2,1},{1,-1},{2,-1},{3,-1},{4,-1},{5,-1}};
        long[] expected1 = {11111,11010,100,1000,10000,11111,10011,100,10,10000,11111,11010,100,10,10000};
        long[] result1 = solution(values1, edges1, queries1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));

    }

    public static long[] solution(int[] values, int[][] edges, int[][] queries) {
        long[] answer = {};
        return answer;
    }
}
