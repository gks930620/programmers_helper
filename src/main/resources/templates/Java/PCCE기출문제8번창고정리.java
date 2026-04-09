public class PCCE기출문제8번창고정리 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] storage1 = {"pencil", "pencil", "pencil", "book"};
        int[] num1 = {2, 4, 3, 1};
        String expected1 = "pencil";
        String result1 = solution(storage1, num1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] storage2 = {"doll", "doll", "doll", "doll"};
        int[] num2 = {1, 1, 1, 1};
        String expected2 = "doll";
        String result2 = solution(storage2, num2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String[] storage3 = {"apple", "steel", "leaf", "apple", "leaf"};
        int[] num3 = {5, 3, 5, 3, 7};
        String expected3 = "leaf";
        String result3 = solution(storage3, num3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + expected3.equals(result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        String[] storage4 = {"mirror", "net", "mirror", "net", "bottle"};
        int[] num4 = {4, 1, 4, 1, 5};
        String expected4 = "mirror";
        String result4 = solution(storage4, num4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + expected4.equals(result4));

    }

    public static String solution(String[] storage, int[] num) {
        String answer = "";
        return answer;
    }
}
