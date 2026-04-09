public class 로그인성공 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] id_pw1 = {"meosseugi", "1234"};
        String[][] db1 = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
        String expected1 = "login";
        String result1 = solution(id_pw1, db1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] id_pw2 = {"programmer01", "15789"};
        String[][] db2 = {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};
        String expected2 = "wrong pw";
        String result2 = solution(id_pw2, db2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String[] id_pw3 = {"rabbit04", "98761"};
        String[][] db3 = {{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}};
        String expected3 = "fail";
        String result3 = solution(id_pw3, db3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + expected3.equals(result3));

    }

    public static String solution(String[] id_pw, String[][] db) {
        String answer = "";
        return answer;
    }
}
