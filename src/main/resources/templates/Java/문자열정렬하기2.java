public class 문자열정렬하기2 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String my_string1 = "Bcad";
        String expected1 = "abcd";
        String result1 = solution(my_string1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String my_string2 = "heLLo";
        String expected2 = "ehllo";
        String result2 = solution(my_string2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String my_string3 = "Python";
        String expected3 = "hnopty";
        String result3 = solution(my_string3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + expected3.equals(result3));

    }

    public static String solution(String my_string) {
        String answer = "";
        return answer;
    }
}
