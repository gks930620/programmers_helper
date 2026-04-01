import java.util.Arrays;

public class 자연수뒤집어배열로만들기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        long n1 = 12345L;
        int[] expected1 = {5,4,3,2,1};
        int[] result1 = solution(n1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));

    }

    public static int[] solution(long n) {
        int[] answer = {};
        return answer;
    }
}
