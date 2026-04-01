public class 몸짱트레이너라이언의고민 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 3;
        int m1 = 2;
        int[][] timetable1 = {{1170,1210}, {1200,1260}};
        int expected1 = 4;
        int result1 = solution(n1, m1, timetable1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 2;
        int m2 = 1;
        int[][] timetable2 = {{840,900}};
        int expected2 = 0;
        int result2 = solution(n2, m2, timetable2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int n3 = 2;
        int m3 = 2;
        int[][] timetable3 = {{600,630},{630,700}};
        int expected3 = 2;
        int result3 = solution(n3, m3, timetable3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int n4 = 4;
        int m4 = 5;
        int[][] timetable4 = {{1140,1200},{1150,1200},{1100,1200},{1210,1300},{1220,1280}};
        int expected4 = 4;
        int result4 = solution(n4, m4, timetable4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));

    }

    public static int solution(int n, int m, int[][] timetable) {
        int answer = 0;
        return answer;
    }
}
