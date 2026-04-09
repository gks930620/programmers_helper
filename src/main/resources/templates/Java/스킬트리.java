public class 스킬트리 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String skill1 = "CBD";
        String[] skill_trees1 = {"BACDE", "CBADF", "AECB", "BDA"};
        int expected1 = 2;
        int result1 = solution(skill1, skill_trees1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));

    }

    public static int solution(String skill, String[] skill_trees) {
        int answer = -1;
        return answer;
    }
}
