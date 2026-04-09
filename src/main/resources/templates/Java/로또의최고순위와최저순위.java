import java.util.Arrays;

public class 로또의최고순위와최저순위 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] lottos1 = 1;
        int[] expected1 = 6개 번호가 모두 일치;
        int[] result1 = solution(lottos1, win_nums1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] lottos2 = 2;
        int[] expected2 = 5개 번호가 일치;
        int[] result2 = solution(lottos2, win_nums2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[] lottos3 = 3;
        int[] expected3 = 4개 번호가 일치;
        int[] result3 = solution(lottos3, win_nums3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int[] lottos4 = 4;
        int[] expected4 = 3개 번호가 일치;
        int[] result4 = solution(lottos4, win_nums4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + Arrays.toString(expected4));
        System.out.println("결과값  : " + Arrays.toString(result4));
        System.out.println("비교    : " + Arrays.equals(expected4, result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        int[] lottos5 = 5;
        int[] expected5 = 2개 번호가 일치;
        int[] result5 = solution(lottos5, win_nums5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + Arrays.toString(expected5));
        System.out.println("결과값  : " + Arrays.toString(result5));
        System.out.println("비교    : " + Arrays.equals(expected5, result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        int[] lottos6 = 6(낙첨);
        int[] expected6 = 그 외;
        int[] result6 = solution(lottos6, win_nums6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + Arrays.toString(expected6));
        System.out.println("결과값  : " + Arrays.toString(result6));
        System.out.println("비교    : " + Arrays.equals(expected6, result6));

    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        return answer;
    }
}
