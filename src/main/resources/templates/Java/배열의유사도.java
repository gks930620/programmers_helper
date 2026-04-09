public class 배열의유사도 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] s11 = {"a", "b", "c"};
        String[] s21 = {"com", "b", "d", "p", "c"};
        int expected1 = 2;
        int result1 = solution(s11, s21);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] s12 = {"n", "omg"};
        String[] s22 = {"m", "dot"};
        int expected2 = 0;
        int result2 = solution(s12, s22);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(String[] s1, String[] s2) {
        int answer = 0;
        return answer;
    }
}
