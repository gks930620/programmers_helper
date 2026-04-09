public class 외계어사전 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] spell1 = {"p", "o", "s"};
        String[] dic1 = {"sod", "eocd", "qixm", "adio", "soo"};
        int expected1 = 2;
        int result1 = solution(spell1, dic1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] spell2 = {"z", "d", "x"};
        String[] dic2 = {"def", "dww", "dzx", "loveaw"};
        int expected2 = 1;
        int result2 = solution(spell2, dic2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String[] spell3 = {"s", "o", "m", "d"};
        String[] dic3 = {"moos", "dzx", "smm", "sunmmo", "som"};
        int expected3 = 2;
        int result3 = solution(spell3, dic3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(String[] spell, String[] dic) {
        int answer = 0;
        return answer;
    }
}
