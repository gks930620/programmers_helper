import java.util.Arrays;

public class 문자열과알파벳과쿼리 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String s1 = "#1";
        String[] query1 = 4%;
        String[] expected1 = s의 길이,query의 길이 ≤ 100;
        String[] result1 = solution(s1, query1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String s2 = "#2";
        String[] query2 = 4%;
        String[] expected2 = s의 길이,query의 길이 ≤ 1,000;
        String[] result2 = solution(s2, query2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String s3 = "#3";
        String[] query3 = 7%;
        String[] expected3 = s의 길이,query의 길이 ≤ 20,000;
        String[] result3 = solution(s3, query3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        String s4 = "#4";
        String[] query4 = 35%;
        String[] expected4 = 4번 쿼리가 주어지지 않음;
        String[] result4 = solution(s4, query4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + Arrays.toString(expected4));
        System.out.println("결과값  : " + Arrays.toString(result4));
        System.out.println("비교    : " + Arrays.equals(expected4, result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        String s5 = "#5";
        String[] query5 = 50%;
        String[] expected5 = 추가 제한 사항 없음;
        String[] result5 = solution(s5, query5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + Arrays.toString(expected5));
        System.out.println("결과값  : " + Arrays.toString(result5));
        System.out.println("비교    : " + Arrays.equals(expected5, result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        String s6 = "s";
        String[] query6 = query;
        String[] expected6 = result;
        String[] result6 = solution(s6, query6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + Arrays.toString(expected6));
        System.out.println("결과값  : " + Arrays.toString(result6));
        System.out.println("비교    : " + Arrays.equals(expected6, result6));
        System.out.println();

        // --- 테스트 케이스 7 ---
        String s7 = "---";
        String[] query7 = ---;
        String[] expected7 = ---;
        String[] result7 = solution(s7, query7);

        System.out.println("--- Test Case 7 ---");
        System.out.println("기대값  : " + Arrays.toString(expected7));
        System.out.println("결과값  : " + Arrays.toString(result7));
        System.out.println("비교    : " + Arrays.equals(expected7, result7));
        System.out.println();

        // --- 테스트 케이스 8 ---
        String s8 = "programmers";
        String[] query8 = {"1 1 5", "2 1 rm", "1 1 5", "5"};
        String[] expected8 = {"YES", "NO", "a 1 e 1 g 1 o 1 p 1 s 1", "m 2 r 3"};
        String[] result8 = solution(s8, query8);

        System.out.println("--- Test Case 8 ---");
        System.out.println("기대값  : " + Arrays.toString(expected8));
        System.out.println("결과값  : " + Arrays.toString(result8));
        System.out.println("비교    : " + Arrays.equals(expected8, result8));
        System.out.println();

        // --- 테스트 케이스 9 ---
        String s9 = "abacadae";
        String[] query9 = {"3 1 4 aa", "1 1 5", "4 1 7", "1 1 5", "5"};
        String[] expected9 = {"NO", "YES", "a 4 b 1 c 1 d 1 e 1"};
        String[] result9 = solution(s9, query9);

        System.out.println("--- Test Case 9 ---");
        System.out.println("기대값  : " + Arrays.toString(expected9));
        System.out.println("결과값  : " + Arrays.toString(result9));
        System.out.println("비교    : " + Arrays.equals(expected9, result9));

    }

    public static String[] solution(String s, String[] query) {
        String[] answer = {};
        return answer;
    }
}
