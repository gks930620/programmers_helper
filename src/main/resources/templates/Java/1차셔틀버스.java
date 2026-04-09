public class 1차셔틀버스 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 1;
        int t1 = 1;
        int m1 = 5;
        String[] timetable1 = {"08:00", "08:01", "08:02", "08:03"};
        String expected1 = "09:00";
        String result1 = solution(n1, t1, m1, timetable1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 2;
        int t2 = 10;
        int m2 = 2;
        String[] timetable2 = {"09:10", "09:09", "08:00"};
        String expected2 = "09:09";
        String result2 = solution(n2, t2, m2, timetable2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int n3 = 2;
        int t3 = 1;
        int m3 = 2;
        String[] timetable3 = {"09:00", "09:00", "09:00", "09:00"};
        String expected3 = "08:59";
        String result3 = solution(n3, t3, m3, timetable3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + expected3.equals(result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int n4 = 1;
        int t4 = 1;
        int m4 = 5;
        String[] timetable4 = {"00:01", "00:01", "00:01", "00:01", "00:01"};
        String expected4 = "00:00";
        String result4 = solution(n4, t4, m4, timetable4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + expected4.equals(result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        int n5 = 1;
        int t5 = 1;
        int m5 = 1;
        String[] timetable5 = {"23:59"};
        String expected5 = "09:00";
        String result5 = solution(n5, t5, m5, timetable5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + expected5);
        System.out.println("결과값  : " + result5);
        System.out.println("비교    : " + expected5.equals(result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        int n6 = 10;
        int t6 = 60;
        int m6 = 45;
        String[] timetable6 = {"23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59"};
        String expected6 = "18:00";
        String result6 = solution(n6, t6, m6, timetable6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + expected6);
        System.out.println("결과값  : " + result6);
        System.out.println("비교    : " + expected6.equals(result6));

    }

    public static String solution(int n, int t, int m, String[] timetable) {
        String answer = "";
        return answer;
    }
}
