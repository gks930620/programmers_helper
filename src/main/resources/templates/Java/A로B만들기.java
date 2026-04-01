public class A로B만들기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String before1 = "olleh";
        String after1 = "hello";
        int expected1 = 1;
        int result1 = solution(before1, after1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String before2 = "allpe";
        String after2 = "apple";
        int expected2 = 0;
        int result2 = solution(before2, after2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(String before, String after) {
        int answer = 0;
        return answer;
    }
}
