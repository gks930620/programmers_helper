public class 외계행성의나이 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int age1 = 23;
        String expected1 = "cd";
        String result1 = solution(age1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int age2 = 51;
        String expected2 = "fb";
        String result2 = solution(age2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int age3 = 100;
        String expected3 = "baa";
        String result3 = solution(age3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + expected3.equals(result3));

    }

    public static String solution(int age) {
        String answer = "";
        return answer;
    }
}
