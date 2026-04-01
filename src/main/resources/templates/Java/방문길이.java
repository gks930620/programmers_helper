public class 방문길이 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String dirs1 = "ULURRDLLU";
        int expected1 = 7;
        int result1 = solution(dirs1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String dirs2 = "LULLLLLLU";
        int expected2 = 7;
        int result2 = solution(dirs2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(String dirs) {
        int answer = 0;
        return answer;
    }
}
