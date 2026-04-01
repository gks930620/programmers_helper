import java.util.Arrays;

public class 1차비밀지도 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = n;
        String[] expected1 = 5;
        String[] result1 = solution(n1, arr11, arr21);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = arr1;
        String[] expected2 = {};
        String[] result2 = solution(n2, arr12, arr22);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int n3 = arr2;
        String[] expected3 = {};
        String[] result3 = solution(n3, arr13, arr23);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int n4 = 출력;
        String[] expected4 = {"#####", "# # #", "### #", "#  ##", "#####"};
        String[] result4 = solution(n4, arr14, arr24);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + Arrays.toString(expected4));
        System.out.println("결과값  : " + Arrays.toString(result4));
        System.out.println("비교    : " + Arrays.equals(expected4, result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        int n5 = 매개변수;
        String[] expected5 = 값;
        String[] result5 = solution(n5, arr15, arr25);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + Arrays.toString(expected5));
        System.out.println("결과값  : " + Arrays.toString(result5));
        System.out.println("비교    : " + Arrays.equals(expected5, result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        int n6 = ---;
        String[] expected6 = ---;
        String[] result6 = solution(n6, arr16, arr26);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + Arrays.toString(expected6));
        System.out.println("결과값  : " + Arrays.toString(result6));
        System.out.println("비교    : " + Arrays.equals(expected6, result6));
        System.out.println();

        // --- 테스트 케이스 7 ---
        int n7 = n;
        String[] expected7 = 6;
        String[] result7 = solution(n7, arr17, arr27);

        System.out.println("--- Test Case 7 ---");
        System.out.println("기대값  : " + Arrays.toString(expected7));
        System.out.println("결과값  : " + Arrays.toString(result7));
        System.out.println("비교    : " + Arrays.equals(expected7, result7));
        System.out.println();

        // --- 테스트 케이스 8 ---
        int n8 = arr1;
        String[] expected8 = {};
        String[] result8 = solution(n8, arr18, arr28);

        System.out.println("--- Test Case 8 ---");
        System.out.println("기대값  : " + Arrays.toString(expected8));
        System.out.println("결과값  : " + Arrays.toString(result8));
        System.out.println("비교    : " + Arrays.equals(expected8, result8));
        System.out.println();

        // --- 테스트 케이스 9 ---
        int n9 = arr2;
        String[] expected9 = {};
        String[] result9 = solution(n9, arr19, arr29);

        System.out.println("--- Test Case 9 ---");
        System.out.println("기대값  : " + Arrays.toString(expected9));
        System.out.println("결과값  : " + Arrays.toString(result9));
        System.out.println("비교    : " + Arrays.equals(expected9, result9));
        System.out.println();

        // --- 테스트 케이스 10 ---
        int n10 = 출력;
        String[] expected10 = {"######", "###  #", "##  ##", " #### ", " #####", "### # "};
        String[] result10 = solution(n10, arr110, arr210);

        System.out.println("--- Test Case 10 ---");
        System.out.println("기대값  : " + Arrays.toString(expected10));
        System.out.println("결과값  : " + Arrays.toString(result10));
        System.out.println("비교    : " + Arrays.equals(expected10, result10));

    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        return answer;
    }
}
