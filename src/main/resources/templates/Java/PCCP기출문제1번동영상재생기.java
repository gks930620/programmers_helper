public class PCCP기출문제1번동영상재생기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String video_len1 = "34:33";
        String pos1 = "13:00";
        String op_start1 = "00:55";
        String op_end1 = "02:55";
        String[] commands1 = {"next", "prev"};
        String expected1 = "13:00";
        String result1 = solution(video_len1, pos1, op_start1, op_end1, commands1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String video_len2 = "10:55";
        String pos2 = "00:05";
        String op_start2 = "00:15";
        String op_end2 = "06:55";
        String[] commands2 = {"prev", "next", "next"};
        String expected2 = "06:55";
        String result2 = solution(video_len2, pos2, op_start2, op_end2, commands2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String video_len3 = "07:22";
        String pos3 = "04:05";
        String op_start3 = "00:15";
        String op_end3 = "04:07";
        String[] commands3 = {"next"};
        String expected3 = "04:17";
        String result3 = solution(video_len3, pos3, op_start3, op_end3, commands3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + expected3.equals(result3));

    }

    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        return answer;
    }
}
