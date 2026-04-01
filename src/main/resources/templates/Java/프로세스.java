public class 프로세스 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] priorities1 = {2, 1, 3, 2};
        int location1 = 2;
        int expected1 = 1;
        int result1 = solution(priorities1, location1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] priorities2 = {1, 1, 9, 1, 1, 1};
        int location2 = 0;
        int expected2 = 5;
        int result2 = solution(priorities2, location2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));

    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;
        return answer;
    }
}
