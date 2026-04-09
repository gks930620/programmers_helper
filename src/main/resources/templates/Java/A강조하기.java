public class A강조하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String myString1 = "abstract algebra";
        String expected1 = "AbstrAct AlgebrA";
        String result1 = solution(myString1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String myString2 = "PrOgRaMmErS";
        String expected2 = "progrAmmers";
        String result2 = solution(myString2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));

    }

    public static String solution(String myString) {
        String answer = "";
        return answer;
    }
}
