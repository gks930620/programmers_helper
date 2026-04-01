public class 표편집 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 8;
        int k1 = 2;
        String[] cmd1 = {"D 2", "C", "U 3", "C", "D 4", "C", "U 2", "Z", "Z"};
        String expected1 = "OOOOXOOO";
        String result1 = solution(n1, k1, cmd1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 8;
        int k2 = 2;
        String[] cmd2 = {"D 2", "C", "U 3", "C", "D 4", "C", "U 2", "Z", "Z", "U 1", "C"};
        String expected2 = "OOXOXOOO";
        String result2 = solution(n2, k2, cmd2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));

    }

    public static String solution(int n, int k, String[] cmd) {
        String answer = "";
        return answer;
    }
}
