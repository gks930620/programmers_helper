public class 광고삽입 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String play_time1 = "02:03:55";
        String adv_time1 = "00:14:15";
        String[] logs1 = {"01:20:15-01:45:14", "00:40:31-01:00:00", "00:25:50-00:48:29", "01:30:59-01:53:29", "01:37:44-02:02:30"};
        String expected1 = "01:30:59";
        String result1 = solution(play_time1, adv_time1, logs1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String play_time2 = "99:59:59";
        String adv_time2 = "25:00:00";
        String[] logs2 = {"69:59:59-89:59:59", "01:00:00-21:00:00", "79:59:59-99:59:59", "11:00:00-31:00:00"};
        String expected2 = "01:00:00";
        String result2 = solution(play_time2, adv_time2, logs2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String play_time3 = "50:00:00";
        String adv_time3 = "50:00:00";
        String[] logs3 = {"15:36:51-38:21:49", "10:14:18-15:36:51", "38:21:49-42:51:45"};
        String expected3 = "00:00:00";
        String result3 = solution(play_time3, adv_time3, logs3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + expected3.equals(result3));

    }

    public static String solution(String play_time, String adv_time, String[] logs) {
        String answer = "";
        return answer;
    }
}
