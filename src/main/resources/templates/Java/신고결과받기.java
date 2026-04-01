import java.util.Arrays;

public class 신고결과받기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] id_list1 = "muzi";
        String[] report1 = "frodo";
        int[] expected1 = "muzi"가 "frodo"를 신고했습니다.;
        int[] result1 = solution(id_list1, report1, k1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] id_list2 = "apeach";
        String[] report2 = "frodo";
        int[] expected2 = "apeach"가 "frodo"를 신고했습니다.;
        int[] result2 = solution(id_list2, report2, k2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String[] id_list3 = "frodo";
        String[] report3 = "neo";
        int[] expected3 = "frodo"가 "neo"를 신고했습니다.;
        int[] result3 = solution(id_list3, report3, k3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        String[] id_list4 = "muzi";
        String[] report4 = "neo";
        int[] expected4 = "muzi"가 "neo"를 신고했습니다.;
        int[] result4 = solution(id_list4, report4, k4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + Arrays.toString(expected4));
        System.out.println("결과값  : " + Arrays.toString(result4));
        System.out.println("비교    : " + Arrays.equals(expected4, result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        String[] id_list5 = "apeach";
        String[] report5 = "muzi";
        int[] expected5 = "apeach"가 "muzi"를 신고했습니다.;
        int[] result5 = solution(id_list5, report5, k5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + Arrays.toString(expected5));
        System.out.println("결과값  : " + Arrays.toString(result5));
        System.out.println("비교    : " + Arrays.equals(expected5, result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        String[] id_list6 = 유저 ID;
        String[] report6 = 유저가 신고한 ID;
        int[] expected6 = 정지된 ID;
        int[] result6 = solution(id_list6, report6, k6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + Arrays.toString(expected6));
        System.out.println("결과값  : " + Arrays.toString(result6));
        System.out.println("비교    : " + Arrays.equals(expected6, result6));
        System.out.println();

        // --- 테스트 케이스 7 ---
        String[] id_list7 = ---;
        String[] report7 = ---;
        int[] expected7 = ---;
        int[] result7 = solution(id_list7, report7, k7);

        System.out.println("--- Test Case 7 ---");
        System.out.println("기대값  : " + Arrays.toString(expected7));
        System.out.println("결과값  : " + Arrays.toString(result7));
        System.out.println("비교    : " + Arrays.equals(expected7, result7));
        System.out.println();

        // --- 테스트 케이스 8 ---
        String[] id_list8 = "muzi";
        String[] report8 = {"frodo", "neo"};
        int[] expected8 = {"frodo", "neo"};
        int[] result8 = solution(id_list8, report8, k8);

        System.out.println("--- Test Case 8 ---");
        System.out.println("기대값  : " + Arrays.toString(expected8));
        System.out.println("결과값  : " + Arrays.toString(result8));
        System.out.println("비교    : " + Arrays.equals(expected8, result8));
        System.out.println();

        // --- 테스트 케이스 9 ---
        String[] id_list9 = "frodo";
        String[] report9 = {"neo"};
        int[] expected9 = {"neo"};
        int[] result9 = solution(id_list9, report9, k9);

        System.out.println("--- Test Case 9 ---");
        System.out.println("기대값  : " + Arrays.toString(expected9));
        System.out.println("결과값  : " + Arrays.toString(result9));
        System.out.println("비교    : " + Arrays.equals(expected9, result9));
        System.out.println();

        // --- 테스트 케이스 10 ---
        String[] id_list10 = "apeach";
        String[] report10 = {"muzi", "frodo"};
        int[] expected10 = {"frodo"};
        int[] result10 = solution(id_list10, report10, k10);

        System.out.println("--- Test Case 10 ---");
        System.out.println("기대값  : " + Arrays.toString(expected10));
        System.out.println("결과값  : " + Arrays.toString(result10));
        System.out.println("비교    : " + Arrays.equals(expected10, result10));
        System.out.println();

        // --- 테스트 케이스 11 ---
        String[] id_list11 = "neo";
        String[] report11 = 없음;
        int[] expected11 = 없음;
        int[] result11 = solution(id_list11, report11, k11);

        System.out.println("--- Test Case 11 ---");
        System.out.println("기대값  : " + Arrays.toString(expected11));
        System.out.println("결과값  : " + Arrays.toString(result11));
        System.out.println("비교    : " + Arrays.equals(expected11, result11));

    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        return answer;
    }
}
