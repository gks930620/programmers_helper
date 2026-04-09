public class 음양더하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] absolutes1 = {4,7,12};
        boolean[] signs1 = {true,false,true};
        int expected1 = 9;
        int result1 = solution(absolutes1, signs1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] absolutes2 = {1,2,3};
        boolean[] signs2 = {false,false,true};
        int expected2 = 0;
        int result2 = solution(absolutes2, signs2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 123456789;
        return answer;
    }
}
