import java.util.Arrays;

public class 표병합 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] commands1 = UPDATE 1 1 menu;
        String[] expected1 = (1,1)에"menu"입력;
        String[] result1 = solution(commands1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + Arrays.toString(expected1));
        System.out.println("결과값  : " + Arrays.toString(result1));
        System.out.println("비교    : " + Arrays.equals(expected1, result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] commands2 = UPDATE 1 2 category;
        String[] expected2 = (1,2)에"category"입력;
        String[] result2 = solution(commands2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + Arrays.toString(expected2));
        System.out.println("결과값  : " + Arrays.toString(result2));
        System.out.println("비교    : " + Arrays.equals(expected2, result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String[] commands3 = UPDATE 2 1 bibimbap;
        String[] expected3 = (2,1)에"bibimbap"입력;
        String[] result3 = solution(commands3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + Arrays.toString(expected3));
        System.out.println("결과값  : " + Arrays.toString(result3));
        System.out.println("비교    : " + Arrays.equals(expected3, result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        String[] commands4 = UPDATE 2 2 korean;
        String[] expected4 = (2,2)에"korean"입력;
        String[] result4 = solution(commands4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + Arrays.toString(expected4));
        System.out.println("결과값  : " + Arrays.toString(result4));
        System.out.println("비교    : " + Arrays.equals(expected4, result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        String[] commands5 = UPDATE 2 3 rice;
        String[] expected5 = (2,3)에"rice"입력;
        String[] result5 = solution(commands5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + Arrays.toString(expected5));
        System.out.println("결과값  : " + Arrays.toString(result5));
        System.out.println("비교    : " + Arrays.equals(expected5, result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        String[] commands6 = UPDATE 3 1 ramyeon;
        String[] expected6 = (3,1)에"ramyeon"입력;
        String[] result6 = solution(commands6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + Arrays.toString(expected6));
        System.out.println("결과값  : " + Arrays.toString(result6));
        System.out.println("비교    : " + Arrays.equals(expected6, result6));
        System.out.println();

        // --- 테스트 케이스 7 ---
        String[] commands7 = UPDATE 3 2 korean;
        String[] expected7 = (3,2)에"korean"입력;
        String[] result7 = solution(commands7);

        System.out.println("--- Test Case 7 ---");
        System.out.println("기대값  : " + Arrays.toString(expected7));
        System.out.println("결과값  : " + Arrays.toString(result7));
        System.out.println("비교    : " + Arrays.equals(expected7, result7));
        System.out.println();

        // --- 테스트 케이스 8 ---
        String[] commands8 = UPDATE 3 3 noodle;
        String[] expected8 = (3,3)에"noodle"입력;
        String[] result8 = solution(commands8);

        System.out.println("--- Test Case 8 ---");
        System.out.println("기대값  : " + Arrays.toString(expected8));
        System.out.println("결과값  : " + Arrays.toString(result8));
        System.out.println("비교    : " + Arrays.equals(expected8, result8));
        System.out.println();

        // --- 테스트 케이스 9 ---
        String[] commands9 = UPDATE 3 4 instant;
        String[] expected9 = (3,4)에"instant"입력;
        String[] result9 = solution(commands9);

        System.out.println("--- Test Case 9 ---");
        System.out.println("기대값  : " + Arrays.toString(expected9));
        System.out.println("결과값  : " + Arrays.toString(result9));
        System.out.println("비교    : " + Arrays.equals(expected9, result9));
        System.out.println();

        // --- 테스트 케이스 10 ---
        String[] commands10 = UPDATE 4 1 pasta;
        String[] expected10 = (4,1)에"pasta"입력;
        String[] result10 = solution(commands10);

        System.out.println("--- Test Case 10 ---");
        System.out.println("기대값  : " + Arrays.toString(expected10));
        System.out.println("결과값  : " + Arrays.toString(result10));
        System.out.println("비교    : " + Arrays.equals(expected10, result10));
        System.out.println();

        // --- 테스트 케이스 11 ---
        String[] commands11 = UPDATE 4 2 italian;
        String[] expected11 = (4,2)에"italian"입력;
        String[] result11 = solution(commands11);

        System.out.println("--- Test Case 11 ---");
        System.out.println("기대값  : " + Arrays.toString(expected11));
        System.out.println("결과값  : " + Arrays.toString(result11));
        System.out.println("비교    : " + Arrays.equals(expected11, result11));
        System.out.println();

        // --- 테스트 케이스 12 ---
        String[] commands12 = UPDATE 4 3 noodle;
        String[] expected12 = (4,3)에"noodle"입력;
        String[] result12 = solution(commands12);

        System.out.println("--- Test Case 12 ---");
        System.out.println("기대값  : " + Arrays.toString(expected12));
        System.out.println("결과값  : " + Arrays.toString(result12));
        System.out.println("비교    : " + Arrays.equals(expected12, result12));
        System.out.println();

        // --- 테스트 케이스 13 ---
        String[] commands13 = commands;
        String[] expected13 = 효과;
        String[] result13 = solution(commands13);

        System.out.println("--- Test Case 13 ---");
        System.out.println("기대값  : " + Arrays.toString(expected13));
        System.out.println("결과값  : " + Arrays.toString(result13));
        System.out.println("비교    : " + Arrays.equals(expected13, result13));
        System.out.println();

        // --- 테스트 케이스 14 ---
        String[] commands14 = ---;
        String[] expected14 = ---;
        String[] result14 = solution(commands14);

        System.out.println("--- Test Case 14 ---");
        System.out.println("기대값  : " + Arrays.toString(expected14));
        System.out.println("결과값  : " + Arrays.toString(result14));
        System.out.println("비교    : " + Arrays.equals(expected14, result14));
        System.out.println();

        // --- 테스트 케이스 15 ---
        String[] commands15 = MERGE 1 2 1 3;
        String[] expected15 = (1,2)와 (1,3) 병합;
        String[] result15 = solution(commands15);

        System.out.println("--- Test Case 15 ---");
        System.out.println("기대값  : " + Arrays.toString(expected15));
        System.out.println("결과값  : " + Arrays.toString(result15));
        System.out.println("비교    : " + Arrays.equals(expected15, result15));
        System.out.println();

        // --- 테스트 케이스 16 ---
        String[] commands16 = MERGE 1 3 1 4;
        String[] expected16 = (1,3)과 (1,4) 병합;
        String[] result16 = solution(commands16);

        System.out.println("--- Test Case 16 ---");
        System.out.println("기대값  : " + Arrays.toString(expected16));
        System.out.println("결과값  : " + Arrays.toString(result16));
        System.out.println("비교    : " + Arrays.equals(expected16, result16));
        System.out.println();

        // --- 테스트 케이스 17 ---
        String[] commands17 = commands;
        String[] expected17 = 효과;
        String[] result17 = solution(commands17);

        System.out.println("--- Test Case 17 ---");
        System.out.println("기대값  : " + Arrays.toString(expected17));
        System.out.println("결과값  : " + Arrays.toString(result17));
        System.out.println("비교    : " + Arrays.equals(expected17, result17));
        System.out.println();

        // --- 테스트 케이스 18 ---
        String[] commands18 = ---;
        String[] expected18 = ---;
        String[] result18 = solution(commands18);

        System.out.println("--- Test Case 18 ---");
        System.out.println("기대값  : " + Arrays.toString(expected18));
        System.out.println("결과값  : " + Arrays.toString(result18));
        System.out.println("비교    : " + Arrays.equals(expected18, result18));
        System.out.println();

        // --- 테스트 케이스 19 ---
        String[] commands19 = UPDATE korean hansik;
        String[] expected19 = "korean"을"hansik"으로 변경;
        String[] result19 = solution(commands19);

        System.out.println("--- Test Case 19 ---");
        System.out.println("기대값  : " + Arrays.toString(expected19));
        System.out.println("결과값  : " + Arrays.toString(result19));
        System.out.println("비교    : " + Arrays.equals(expected19, result19));
        System.out.println();

        // --- 테스트 케이스 20 ---
        String[] commands20 = UPDATE 1 3 group;
        String[] expected20 = (1,3) 위치의 셀 값을"group"으로 변경;
        String[] result20 = solution(commands20);

        System.out.println("--- Test Case 20 ---");
        System.out.println("기대값  : " + Arrays.toString(expected20));
        System.out.println("결과값  : " + Arrays.toString(result20));
        System.out.println("비교    : " + Arrays.equals(expected20, result20));
        System.out.println();

        // --- 테스트 케이스 21 ---
        String[] commands21 = commands;
        String[] expected21 = 효과;
        String[] result21 = solution(commands21);

        System.out.println("--- Test Case 21 ---");
        System.out.println("기대값  : " + Arrays.toString(expected21));
        System.out.println("결과값  : " + Arrays.toString(result21));
        System.out.println("비교    : " + Arrays.equals(expected21, result21));
        System.out.println();

        // --- 테스트 케이스 22 ---
        String[] commands22 = ---;
        String[] expected22 = ---;
        String[] result22 = solution(commands22);

        System.out.println("--- Test Case 22 ---");
        System.out.println("기대값  : " + Arrays.toString(expected22));
        System.out.println("결과값  : " + Arrays.toString(result22));
        System.out.println("비교    : " + Arrays.equals(expected22, result22));
        System.out.println();

        // --- 테스트 케이스 23 ---
        String[] commands23 = UNMERGE 1 4;
        String[] expected23 = 셀 병합 해제 후 원래 값은 (1,4)가 가짐;
        String[] result23 = solution(commands23);

        System.out.println("--- Test Case 23 ---");
        System.out.println("기대값  : " + Arrays.toString(expected23));
        System.out.println("결과값  : " + Arrays.toString(result23));
        System.out.println("비교    : " + Arrays.equals(expected23, result23));
        System.out.println();

        // --- 테스트 케이스 24 ---
        String[] commands24 = commands;
        String[] expected24 = result;
        String[] result24 = solution(commands24);

        System.out.println("--- Test Case 24 ---");
        System.out.println("기대값  : " + Arrays.toString(expected24));
        System.out.println("결과값  : " + Arrays.toString(result24));
        System.out.println("비교    : " + Arrays.equals(expected24, result24));
        System.out.println();

        // --- 테스트 케이스 25 ---
        String[] commands25 = ---;
        String[] expected25 = ---;
        String[] result25 = solution(commands25);

        System.out.println("--- Test Case 25 ---");
        System.out.println("기대값  : " + Arrays.toString(expected25));
        System.out.println("결과값  : " + Arrays.toString(result25));
        System.out.println("비교    : " + Arrays.equals(expected25, result25));
        System.out.println();

        // --- 테스트 케이스 26 ---
        String[] commands26 = {"UPDATE 1 1 menu", "UPDATE 1 2 category", "UPDATE 2 1 bibimbap", "UPDATE 2 2 korean", "UPDATE 2 3 rice", "UPDATE 3 1 ramyeon", "UPDATE 3 2 korean", "UPDATE 3 3 noodle", "UPDATE 3 4 instant", "UPDATE 4 1 pasta", "UPDATE 4 2 italian", "UPDATE 4 3 noodle", "MERGE 1 2 1 3", "MERGE 1 3 1 4", "UPDATE korean hansik", "UPDATE 1 3 group", "UNMERGE 1 4", "PRINT 1 3", "PRINT 1 4"};
        String[] expected26 = {"EMPTY", "group"};
        String[] result26 = solution(commands26);

        System.out.println("--- Test Case 26 ---");
        System.out.println("기대값  : " + Arrays.toString(expected26));
        System.out.println("결과값  : " + Arrays.toString(result26));
        System.out.println("비교    : " + Arrays.equals(expected26, result26));
        System.out.println();

        // --- 테스트 케이스 27 ---
        String[] commands27 = {"UPDATE 1 1 a", "UPDATE 1 2 b", "UPDATE 2 1 c", "UPDATE 2 2 d", "MERGE 1 1 1 2", "MERGE 2 2 2 1", "MERGE 2 1 1 1", "PRINT 1 1", "UNMERGE 2 2", "PRINT 1 1"};
        String[] expected27 = {"d", "EMPTY"};
        String[] result27 = solution(commands27);

        System.out.println("--- Test Case 27 ---");
        System.out.println("기대값  : " + Arrays.toString(expected27));
        System.out.println("결과값  : " + Arrays.toString(result27));
        System.out.println("비교    : " + Arrays.equals(expected27, result27));

    }

    public static String[] solution(String[] commands) {
        String[] answer = {};
        return answer;
    }
}
