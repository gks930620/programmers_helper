public class 단어퍼즐 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] strs1 = {"ba", "na", "n", "a"};
        String t1 = "banana";
        int expected1 = 3;
        int result1 = solution(strs1, t1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] strs2 = {"app", "ap", "p", "l", "e", "ple", "pp"};
        String t2 = "apple";
        int expected2 = 2;
        int result2 = solution(strs2, t2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String[] strs3 = {"ba", "an", "nan", "ban", "n"};
        String t3 = "banana";
        int expected3 = -1;
        int result3 = solution(strs3, t3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));

    }

    public static int solution(String[] strs, String t) {
        int answer = 0;
        return answer;
    }
}
