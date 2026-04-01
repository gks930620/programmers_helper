public class 리틀프렌즈사천성 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int m1 = 3;
        int n1 = 3;
        String[] board1 = {"DBA", "C*A", "CDB"};
        String expected1 = "ABCD";
        String result1 = solution(m1, n1, board1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int m2 = 2;
        int n2 = 4;
        String[] board2 = {"NRYN", "ARYA"};
        String expected2 = "RYAN";
        String result2 = solution(m2, n2, board2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int m3 = 4;
        int n3 = 4;
        String[] board3 = {".ZI.", "M.**", "MZU.", ".IU."};
        String expected3 = "MUZI";
        String result3 = solution(m3, n3, board3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + expected3.equals(result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int m4 = 2;
        int n4 = 2;
        String[] board4 = {"AB", "BA"};
        String expected4 = "IMPOSSIBLE";
        String result4 = solution(m4, n4, board4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + expected4.equals(result4));

    }

    public static String solution(int m, int n, String[] board) {
        String answer = "";
        return answer;
    }
}
