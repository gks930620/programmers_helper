public class 단속카메라 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] routes1 = {{-20,-15}, {-14,-5}, {-18,-13}, {-5,-3}};
        int expected1 = 2;
        int result1 = solution(routes1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));

    }

    public static int solution(int[][] routes) {
        int answer = 0;
        return answer;
    }
}
