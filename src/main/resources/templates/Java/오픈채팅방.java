import java.util.Arrays;

public class 오픈채팅방 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] record1 = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        String[] expected1 = {"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."};
        String[] result1 = solution(record1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));

    }

    public static String[] solution(String[] record) {
        String[] answer = {};
        return answer;
    }
}
