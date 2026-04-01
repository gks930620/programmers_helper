import java.util.Arrays;

public class 순위검색 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] info1 = {"java backend junior pizza 150", "python frontend senior chicken 210", "python frontend senior chicken 150", "cpp backend senior pizza 260", "java backend junior chicken 80", "python backend senior chicken 50"};
        String[] query1 = {"java and backend and junior and pizza 100", "python and frontend and senior and chicken 200", "cpp and - and senior and pizza 250", "- and backend and senior and - 150", "- and - and - and chicken 100", "- and - and - and - 150"};
        int[] expected1 = {1,1,1,1,2,4};
        int[] result1 = solution(info1, query1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));

    }

    public static int[] solution(String[] info, String[] query) {
        int[] answer = {};
        return answer;
    }
}
