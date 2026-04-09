import java.util.Arrays;

public class 그림확대 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] picture1 = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
        int k1 = 2;
        String[] expected1 = {"..xxxx......xxxx..", "..xxxx......xxxx..", "xx....xx..xx....xx", "xx....xx..xx....xx", "xx......xx......xx", "xx......xx......xx", "..xx..........xx..", "..xx..........xx..", "....xx......xx....", "....xx......xx....", "......xx..xx......", "......xx..xx......", "........xx........", "........xx........"};
        String[] result1 = solution(picture1, k1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] picture2 = {"x.x", ".x.", "x.x"};
        int k2 = 3;
        String[] expected2 = {"xxx...xxx", "xxx...xxx", "xxx...xxx", "...xxx...", "...xxx...", "...xxx...", "xxx...xxx", "xxx...xxx", "xxx...xxx"};
        String[] result2 = solution(picture2, k2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));

    }

    public static String[] solution(String[] picture, int k) {
        String[] answer = {};
        return answer;
    }
}
