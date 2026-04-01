public class 단체사진찍기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = 2;
        String[] data1 = {"N~F=0", "R~T>2"};
        int expected1 = 3648;
        int result1 = solution(n1, data1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = 2;
        String[] data2 = {"M~C<2", "C~M>1"};
        int expected2 = 0;
        int result2 = solution(n2, data2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int n, String[] data) {
        int answer = 0;
        return answer;
    }
}
