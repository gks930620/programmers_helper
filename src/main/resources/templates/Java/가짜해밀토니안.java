public class 가짜해밀토니안 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] t1 = {{5,1},{2,5},{3,5},{3,6},{2,4},{4,0}};
        int expected1 = 7;
        int result1 = solution(t1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[][] t2 = {{2,5},{2,0},{3,2},{4,2},{2,1}};
        int expected2 = 4;
        int result2 = solution(t2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int[][] t) {
        int answer = 0;
        return answer;
    }
}
