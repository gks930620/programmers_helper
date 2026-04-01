public class 각도기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int angle1 = 70;
        int expected1 = 1;
        int result1 = solution(angle1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int angle2 = 91;
        int expected2 = 3;
        int result2 = solution(angle2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int angle3 = 180;
        int expected3 = 4;
        int result3 = solution(angle3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(int angle) {
        int answer = 0;
        return answer;
    }
}
