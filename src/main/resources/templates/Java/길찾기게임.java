import java.util.Arrays;

public class 길찾기게임 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] nodeinfo1 = {{5,3},{11,5},{13,3},{3,5},{6,1},{1,3},{8,6},{7,2},{2,2}};
        int[][] expected1 = {{7,4,6,9,1,8,5,2,3},{9,6,5,8,1,4,3,2,7}};
        int[][] result1 = solution(nodeinfo1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.deepToString(expected1));
        System.out.println("결과값  : " + Arrays.deepToString(result1));
        System.out.println("비교    : " + Arrays.deepEquals(expected1, result1));

    }

    public static int[][] solution(int[][] nodeinfo) {
        int[][] answer = {};
        return answer;
    }
}
