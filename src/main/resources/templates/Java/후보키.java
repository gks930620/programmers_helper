public class 후보키 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[][] relation1 = {{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}};
        int expected1 = 2;
        int result1 = solution(relation1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));

    }

    public static int solution(String[][] relation) {
        int answer = 0;
        return answer;
    }
}
