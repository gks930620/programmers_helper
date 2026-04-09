public class 성격유형검사하기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] survey1 = 1번 지표;
        String expected1 = "라이언형(R), 튜브형(T)";
        String result1 = solution(survey1, choices1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + expected1.equals(result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] survey2 = 2번 지표;
        String expected2 = "콘형(C), 프로도형(F)";
        String result2 = solution(survey2, choices2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + expected2.equals(result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String[] survey3 = 3번 지표;
        String expected3 = "제이지형(J), 무지형(M)";
        String result3 = solution(survey3, choices3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + expected3.equals(result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        String[] survey4 = 4번 지표;
        String expected4 = "어피치형(A), 네오형(N)";
        String result4 = solution(survey4, choices4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + expected4.equals(result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        String[] survey5 = 선택지;
        String expected5 = "성격 유형 점수";
        String result5 = solution(survey5, choices5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + expected5);
        System.out.println("결과값  : " + result5);
        System.out.println("비교    : " + expected5.equals(result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        String[] survey6 = ---;
        String expected6 = "---";
        String result6 = solution(survey6, choices6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + expected6);
        System.out.println("결과값  : " + result6);
        System.out.println("비교    : " + expected6.equals(result6));
        System.out.println();

        // --- 테스트 케이스 7 ---
        String[] survey7 = 매우 비동의;
        String expected7 = "네오형 3점";
        String result7 = solution(survey7, choices7);

        System.out.println("--- Test Case 7 ---");
        System.out.println("기대값  : " + expected7);
        System.out.println("결과값  : " + result7);
        System.out.println("비교    : " + expected7.equals(result7));
        System.out.println();

        // --- 테스트 케이스 8 ---
        String[] survey8 = 비동의;
        String expected8 = "네오형 2점";
        String result8 = solution(survey8, choices8);

        System.out.println("--- Test Case 8 ---");
        System.out.println("기대값  : " + expected8);
        System.out.println("결과값  : " + result8);
        System.out.println("비교    : " + expected8.equals(result8));
        System.out.println();

        // --- 테스트 케이스 9 ---
        String[] survey9 = 약간 비동의;
        String expected9 = "네오형 1점";
        String result9 = solution(survey9, choices9);

        System.out.println("--- Test Case 9 ---");
        System.out.println("기대값  : " + expected9);
        System.out.println("결과값  : " + result9);
        System.out.println("비교    : " + expected9.equals(result9));
        System.out.println();

        // --- 테스트 케이스 10 ---
        String[] survey10 = 모르겠음;
        String expected10 = "어떤 성격 유형도 점수를 얻지 않습니다";
        String result10 = solution(survey10, choices10);

        System.out.println("--- Test Case 10 ---");
        System.out.println("기대값  : " + expected10);
        System.out.println("결과값  : " + result10);
        System.out.println("비교    : " + expected10.equals(result10));
        System.out.println();

        // --- 테스트 케이스 11 ---
        String[] survey11 = 약간 동의;
        String expected11 = "어피치형 1점";
        String result11 = solution(survey11, choices11);

        System.out.println("--- Test Case 11 ---");
        System.out.println("기대값  : " + expected11);
        System.out.println("결과값  : " + result11);
        System.out.println("비교    : " + expected11.equals(result11));
        System.out.println();

        // --- 테스트 케이스 12 ---
        String[] survey12 = 동의;
        String expected12 = "어피치형 2점";
        String result12 = solution(survey12, choices12);

        System.out.println("--- Test Case 12 ---");
        System.out.println("기대값  : " + expected12);
        System.out.println("결과값  : " + result12);
        System.out.println("비교    : " + expected12.equals(result12));
        System.out.println();

        // --- 테스트 케이스 13 ---
        String[] survey13 = 매우 동의;
        String expected13 = "어피치형 3점";
        String result13 = solution(survey13, choices13);

        System.out.println("--- Test Case 13 ---");
        System.out.println("기대값  : " + expected13);
        System.out.println("결과값  : " + result13);
        System.out.println("비교    : " + expected13.equals(result13));
        System.out.println();

        // --- 테스트 케이스 14 ---
        String[] survey14 = choices;
        String expected14 = "뜻";
        String result14 = solution(survey14, choices14);

        System.out.println("--- Test Case 14 ---");
        System.out.println("기대값  : " + expected14);
        System.out.println("결과값  : " + result14);
        System.out.println("비교    : " + expected14.equals(result14));
        System.out.println();

        // --- 테스트 케이스 15 ---
        String[] survey15 = ---;
        String expected15 = "---";
        String result15 = solution(survey15, choices15);

        System.out.println("--- Test Case 15 ---");
        System.out.println("기대값  : " + expected15);
        System.out.println("결과값  : " + result15);
        System.out.println("비교    : " + expected15.equals(result15));
        System.out.println();

        // --- 테스트 케이스 16 ---
        String[] survey16 = 1;
        String expected16 = "매우 비동의";
        String result16 = solution(survey16, choices16);

        System.out.println("--- Test Case 16 ---");
        System.out.println("기대값  : " + expected16);
        System.out.println("결과값  : " + result16);
        System.out.println("비교    : " + expected16.equals(result16));
        System.out.println();

        // --- 테스트 케이스 17 ---
        String[] survey17 = 2;
        String expected17 = "비동의";
        String result17 = solution(survey17, choices17);

        System.out.println("--- Test Case 17 ---");
        System.out.println("기대값  : " + expected17);
        System.out.println("결과값  : " + result17);
        System.out.println("비교    : " + expected17.equals(result17));
        System.out.println();

        // --- 테스트 케이스 18 ---
        String[] survey18 = 3;
        String expected18 = "약간 비동의";
        String result18 = solution(survey18, choices18);

        System.out.println("--- Test Case 18 ---");
        System.out.println("기대값  : " + expected18);
        System.out.println("결과값  : " + result18);
        System.out.println("비교    : " + expected18.equals(result18));
        System.out.println();

        // --- 테스트 케이스 19 ---
        String[] survey19 = 4;
        String expected19 = "모르겠음";
        String result19 = solution(survey19, choices19);

        System.out.println("--- Test Case 19 ---");
        System.out.println("기대값  : " + expected19);
        System.out.println("결과값  : " + result19);
        System.out.println("비교    : " + expected19.equals(result19));
        System.out.println();

        // --- 테스트 케이스 20 ---
        String[] survey20 = 5;
        String expected20 = "약간 동의";
        String result20 = solution(survey20, choices20);

        System.out.println("--- Test Case 20 ---");
        System.out.println("기대값  : " + expected20);
        System.out.println("결과값  : " + result20);
        System.out.println("비교    : " + expected20.equals(result20));
        System.out.println();

        // --- 테스트 케이스 21 ---
        String[] survey21 = 6;
        String expected21 = "동의";
        String result21 = solution(survey21, choices21);

        System.out.println("--- Test Case 21 ---");
        System.out.println("기대값  : " + expected21);
        System.out.println("결과값  : " + result21);
        System.out.println("비교    : " + expected21.equals(result21));
        System.out.println();

        // --- 테스트 케이스 22 ---
        String[] survey22 = 7;
        String expected22 = "매우 동의";
        String result22 = solution(survey22, choices22);

        System.out.println("--- Test Case 22 ---");
        System.out.println("기대값  : " + expected22);
        System.out.println("결과값  : " + result22);
        System.out.println("비교    : " + expected22.equals(result22));
        System.out.println();

        // --- 테스트 케이스 23 ---
        String[] survey23 = 선택지;
        String expected23 = "성격 유형 점수";
        String result23 = solution(survey23, choices23);

        System.out.println("--- Test Case 23 ---");
        System.out.println("기대값  : " + expected23);
        System.out.println("결과값  : " + result23);
        System.out.println("비교    : " + expected23.equals(result23));
        System.out.println();

        // --- 테스트 케이스 24 ---
        String[] survey24 = ---;
        String expected24 = "---";
        String result24 = solution(survey24, choices24);

        System.out.println("--- Test Case 24 ---");
        System.out.println("기대값  : " + expected24);
        System.out.println("결과값  : " + result24);
        System.out.println("비교    : " + expected24.equals(result24));
        System.out.println();

        // --- 테스트 케이스 25 ---
        String[] survey25 = 매우 비동의;
        String expected25 = "어피치형 3점";
        String result25 = solution(survey25, choices25);

        System.out.println("--- Test Case 25 ---");
        System.out.println("기대값  : " + expected25);
        System.out.println("결과값  : " + result25);
        System.out.println("비교    : " + expected25.equals(result25));
        System.out.println();

        // --- 테스트 케이스 26 ---
        String[] survey26 = 비동의;
        String expected26 = "어피치형 2점";
        String result26 = solution(survey26, choices26);

        System.out.println("--- Test Case 26 ---");
        System.out.println("기대값  : " + expected26);
        System.out.println("결과값  : " + result26);
        System.out.println("비교    : " + expected26.equals(result26));
        System.out.println();

        // --- 테스트 케이스 27 ---
        String[] survey27 = 약간 비동의;
        String expected27 = "어피치형 1점";
        String result27 = solution(survey27, choices27);

        System.out.println("--- Test Case 27 ---");
        System.out.println("기대값  : " + expected27);
        System.out.println("결과값  : " + result27);
        System.out.println("비교    : " + expected27.equals(result27));
        System.out.println();

        // --- 테스트 케이스 28 ---
        String[] survey28 = 모르겠음;
        String expected28 = "어떤 성격 유형도 점수를 얻지 않습니다";
        String result28 = solution(survey28, choices28);

        System.out.println("--- Test Case 28 ---");
        System.out.println("기대값  : " + expected28);
        System.out.println("결과값  : " + result28);
        System.out.println("비교    : " + expected28.equals(result28));
        System.out.println();

        // --- 테스트 케이스 29 ---
        String[] survey29 = 약간 동의;
        String expected29 = "네오형 1점";
        String result29 = solution(survey29, choices29);

        System.out.println("--- Test Case 29 ---");
        System.out.println("기대값  : " + expected29);
        System.out.println("결과값  : " + result29);
        System.out.println("비교    : " + expected29.equals(result29));
        System.out.println();

        // --- 테스트 케이스 30 ---
        String[] survey30 = 동의;
        String expected30 = "네오형 2점";
        String result30 = solution(survey30, choices30);

        System.out.println("--- Test Case 30 ---");
        System.out.println("기대값  : " + expected30);
        System.out.println("결과값  : " + result30);
        System.out.println("비교    : " + expected30.equals(result30));
        System.out.println();

        // --- 테스트 케이스 31 ---
        String[] survey31 = 매우 동의;
        String expected31 = "네오형 3점";
        String result31 = solution(survey31, choices31);

        System.out.println("--- Test Case 31 ---");
        System.out.println("기대값  : " + expected31);
        System.out.println("결과값  : " + result31);
        System.out.println("비교    : " + expected31.equals(result31));
        System.out.println();

        // --- 테스트 케이스 32 ---
        String[] survey32 = 선택지;
        String expected32 = "성격 유형 점수";
        String result32 = solution(survey32, choices32);

        System.out.println("--- Test Case 32 ---");
        System.out.println("기대값  : " + expected32);
        System.out.println("결과값  : " + result32);
        System.out.println("비교    : " + expected32.equals(result32));
        System.out.println();

        // --- 테스트 케이스 33 ---
        String[] survey33 = ---;
        String expected33 = "---";
        String result33 = solution(survey33, choices33);

        System.out.println("--- Test Case 33 ---");
        System.out.println("기대값  : " + expected33);
        System.out.println("결과값  : " + result33);
        System.out.println("비교    : " + expected33.equals(result33));
        System.out.println();

        // --- 테스트 케이스 34 ---
        String[] survey34 = 매우 비동의;
        String expected34 = "콘형 3점";
        String result34 = solution(survey34, choices34);

        System.out.println("--- Test Case 34 ---");
        System.out.println("기대값  : " + expected34);
        System.out.println("결과값  : " + result34);
        System.out.println("비교    : " + expected34.equals(result34));
        System.out.println();

        // --- 테스트 케이스 35 ---
        String[] survey35 = 비동의;
        String expected35 = "콘형 2점";
        String result35 = solution(survey35, choices35);

        System.out.println("--- Test Case 35 ---");
        System.out.println("기대값  : " + expected35);
        System.out.println("결과값  : " + result35);
        System.out.println("비교    : " + expected35.equals(result35));
        System.out.println();

        // --- 테스트 케이스 36 ---
        String[] survey36 = 약간 비동의;
        String expected36 = "콘형 1점";
        String result36 = solution(survey36, choices36);

        System.out.println("--- Test Case 36 ---");
        System.out.println("기대값  : " + expected36);
        System.out.println("결과값  : " + result36);
        System.out.println("비교    : " + expected36.equals(result36));
        System.out.println();

        // --- 테스트 케이스 37 ---
        String[] survey37 = 모르겠음;
        String expected37 = "어떤 성격 유형도 점수를 얻지 않습니다";
        String result37 = solution(survey37, choices37);

        System.out.println("--- Test Case 37 ---");
        System.out.println("기대값  : " + expected37);
        System.out.println("결과값  : " + result37);
        System.out.println("비교    : " + expected37.equals(result37));
        System.out.println();

        // --- 테스트 케이스 38 ---
        String[] survey38 = 약간 동의;
        String expected38 = "프로도형 1점";
        String result38 = solution(survey38, choices38);

        System.out.println("--- Test Case 38 ---");
        System.out.println("기대값  : " + expected38);
        System.out.println("결과값  : " + result38);
        System.out.println("비교    : " + expected38.equals(result38));
        System.out.println();

        // --- 테스트 케이스 39 ---
        String[] survey39 = 동의;
        String expected39 = "프로도형 2점";
        String result39 = solution(survey39, choices39);

        System.out.println("--- Test Case 39 ---");
        System.out.println("기대값  : " + expected39);
        System.out.println("결과값  : " + result39);
        System.out.println("비교    : " + expected39.equals(result39));
        System.out.println();

        // --- 테스트 케이스 40 ---
        String[] survey40 = 매우 동의;
        String expected40 = "프로도형 3점";
        String result40 = solution(survey40, choices40);

        System.out.println("--- Test Case 40 ---");
        System.out.println("기대값  : " + expected40);
        System.out.println("결과값  : " + result40);
        System.out.println("비교    : " + expected40.equals(result40));
        System.out.println();

        // --- 테스트 케이스 41 ---
        String[] survey41 = 선택지;
        String expected41 = "성격 유형 점수";
        String result41 = solution(survey41, choices41);

        System.out.println("--- Test Case 41 ---");
        System.out.println("기대값  : " + expected41);
        System.out.println("결과값  : " + result41);
        System.out.println("비교    : " + expected41.equals(result41));
        System.out.println();

        // --- 테스트 케이스 42 ---
        String[] survey42 = ---;
        String expected42 = "---";
        String result42 = solution(survey42, choices42);

        System.out.println("--- Test Case 42 ---");
        System.out.println("기대값  : " + expected42);
        System.out.println("결과값  : " + result42);
        System.out.println("비교    : " + expected42.equals(result42));
        System.out.println();

        // --- 테스트 케이스 43 ---
        String[] survey43 = 매우 비동의;
        String expected43 = "무지형 3점";
        String result43 = solution(survey43, choices43);

        System.out.println("--- Test Case 43 ---");
        System.out.println("기대값  : " + expected43);
        System.out.println("결과값  : " + result43);
        System.out.println("비교    : " + expected43.equals(result43));
        System.out.println();

        // --- 테스트 케이스 44 ---
        String[] survey44 = 비동의;
        String expected44 = "무지형 2점";
        String result44 = solution(survey44, choices44);

        System.out.println("--- Test Case 44 ---");
        System.out.println("기대값  : " + expected44);
        System.out.println("결과값  : " + result44);
        System.out.println("비교    : " + expected44.equals(result44));
        System.out.println();

        // --- 테스트 케이스 45 ---
        String[] survey45 = 약간 비동의;
        String expected45 = "무지형 1점";
        String result45 = solution(survey45, choices45);

        System.out.println("--- Test Case 45 ---");
        System.out.println("기대값  : " + expected45);
        System.out.println("결과값  : " + result45);
        System.out.println("비교    : " + expected45.equals(result45));
        System.out.println();

        // --- 테스트 케이스 46 ---
        String[] survey46 = 모르겠음;
        String expected46 = "어떤 성격 유형도 점수를 얻지 않습니다";
        String result46 = solution(survey46, choices46);

        System.out.println("--- Test Case 46 ---");
        System.out.println("기대값  : " + expected46);
        System.out.println("결과값  : " + result46);
        System.out.println("비교    : " + expected46.equals(result46));
        System.out.println();

        // --- 테스트 케이스 47 ---
        String[] survey47 = 약간 동의;
        String expected47 = "제이지형 1점";
        String result47 = solution(survey47, choices47);

        System.out.println("--- Test Case 47 ---");
        System.out.println("기대값  : " + expected47);
        System.out.println("결과값  : " + result47);
        System.out.println("비교    : " + expected47.equals(result47));
        System.out.println();

        // --- 테스트 케이스 48 ---
        String[] survey48 = 동의;
        String expected48 = "제이지형 2점";
        String result48 = solution(survey48, choices48);

        System.out.println("--- Test Case 48 ---");
        System.out.println("기대값  : " + expected48);
        System.out.println("결과값  : " + result48);
        System.out.println("비교    : " + expected48.equals(result48));
        System.out.println();

        // --- 테스트 케이스 49 ---
        String[] survey49 = 매우 동의;
        String expected49 = "제이지형 3점";
        String result49 = solution(survey49, choices49);

        System.out.println("--- Test Case 49 ---");
        System.out.println("기대값  : " + expected49);
        System.out.println("결과값  : " + result49);
        System.out.println("비교    : " + expected49.equals(result49));
        System.out.println();

        // --- 테스트 케이스 50 ---
        String[] survey50 = 선택지;
        String expected50 = "성격 유형 점수";
        String result50 = solution(survey50, choices50);

        System.out.println("--- Test Case 50 ---");
        System.out.println("기대값  : " + expected50);
        System.out.println("결과값  : " + result50);
        System.out.println("비교    : " + expected50.equals(result50));
        System.out.println();

        // --- 테스트 케이스 51 ---
        String[] survey51 = ---;
        String expected51 = "---";
        String result51 = solution(survey51, choices51);

        System.out.println("--- Test Case 51 ---");
        System.out.println("기대값  : " + expected51);
        System.out.println("결과값  : " + result51);
        System.out.println("비교    : " + expected51.equals(result51));
        System.out.println();

        // --- 테스트 케이스 52 ---
        String[] survey52 = 매우 비동의;
        String expected52 = "라이언형 3점";
        String result52 = solution(survey52, choices52);

        System.out.println("--- Test Case 52 ---");
        System.out.println("기대값  : " + expected52);
        System.out.println("결과값  : " + result52);
        System.out.println("비교    : " + expected52.equals(result52));
        System.out.println();

        // --- 테스트 케이스 53 ---
        String[] survey53 = 비동의;
        String expected53 = "라이언형 2점";
        String result53 = solution(survey53, choices53);

        System.out.println("--- Test Case 53 ---");
        System.out.println("기대값  : " + expected53);
        System.out.println("결과값  : " + result53);
        System.out.println("비교    : " + expected53.equals(result53));
        System.out.println();

        // --- 테스트 케이스 54 ---
        String[] survey54 = 약간 비동의;
        String expected54 = "라이언형 1점";
        String result54 = solution(survey54, choices54);

        System.out.println("--- Test Case 54 ---");
        System.out.println("기대값  : " + expected54);
        System.out.println("결과값  : " + result54);
        System.out.println("비교    : " + expected54.equals(result54));
        System.out.println();

        // --- 테스트 케이스 55 ---
        String[] survey55 = 모르겠음;
        String expected55 = "어떤 성격 유형도 점수를 얻지 않습니다";
        String result55 = solution(survey55, choices55);

        System.out.println("--- Test Case 55 ---");
        System.out.println("기대값  : " + expected55);
        System.out.println("결과값  : " + result55);
        System.out.println("비교    : " + expected55.equals(result55));
        System.out.println();

        // --- 테스트 케이스 56 ---
        String[] survey56 = 약간 동의;
        String expected56 = "튜브형 1점";
        String result56 = solution(survey56, choices56);

        System.out.println("--- Test Case 56 ---");
        System.out.println("기대값  : " + expected56);
        System.out.println("결과값  : " + result56);
        System.out.println("비교    : " + expected56.equals(result56));
        System.out.println();

        // --- 테스트 케이스 57 ---
        String[] survey57 = 동의;
        String expected57 = "튜브형 2점";
        String result57 = solution(survey57, choices57);

        System.out.println("--- Test Case 57 ---");
        System.out.println("기대값  : " + expected57);
        System.out.println("결과값  : " + result57);
        System.out.println("비교    : " + expected57.equals(result57));
        System.out.println();

        // --- 테스트 케이스 58 ---
        String[] survey58 = 매우 동의;
        String expected58 = "튜브형 3점";
        String result58 = solution(survey58, choices58);

        System.out.println("--- Test Case 58 ---");
        System.out.println("기대값  : " + expected58);
        System.out.println("결과값  : " + result58);
        System.out.println("비교    : " + expected58.equals(result58));
        System.out.println();

        // --- 테스트 케이스 59 ---
        String[] survey59 = 선택지;
        String expected59 = "성격 유형 점수";
        String result59 = solution(survey59, choices59);

        System.out.println("--- Test Case 59 ---");
        System.out.println("기대값  : " + expected59);
        System.out.println("결과값  : " + result59);
        System.out.println("비교    : " + expected59.equals(result59));
        System.out.println();

        // --- 테스트 케이스 60 ---
        String[] survey60 = ---;
        String expected60 = "---";
        String result60 = solution(survey60, choices60);

        System.out.println("--- Test Case 60 ---");
        System.out.println("기대값  : " + expected60);
        System.out.println("결과값  : " + result60);
        System.out.println("비교    : " + expected60.equals(result60));
        System.out.println();

        // --- 테스트 케이스 61 ---
        String[] survey61 = 매우 비동의;
        String expected61 = "네오형 3점";
        String result61 = solution(survey61, choices61);

        System.out.println("--- Test Case 61 ---");
        System.out.println("기대값  : " + expected61);
        System.out.println("결과값  : " + result61);
        System.out.println("비교    : " + expected61.equals(result61));
        System.out.println();

        // --- 테스트 케이스 62 ---
        String[] survey62 = 비동의;
        String expected62 = "네오형 2점";
        String result62 = solution(survey62, choices62);

        System.out.println("--- Test Case 62 ---");
        System.out.println("기대값  : " + expected62);
        System.out.println("결과값  : " + result62);
        System.out.println("비교    : " + expected62.equals(result62));
        System.out.println();

        // --- 테스트 케이스 63 ---
        String[] survey63 = 약간 비동의;
        String expected63 = "네오형 1점";
        String result63 = solution(survey63, choices63);

        System.out.println("--- Test Case 63 ---");
        System.out.println("기대값  : " + expected63);
        System.out.println("결과값  : " + result63);
        System.out.println("비교    : " + expected63.equals(result63));
        System.out.println();

        // --- 테스트 케이스 64 ---
        String[] survey64 = 모르겠음;
        String expected64 = "어떤 성격 유형도 점수를 얻지 않습니다";
        String result64 = solution(survey64, choices64);

        System.out.println("--- Test Case 64 ---");
        System.out.println("기대값  : " + expected64);
        System.out.println("결과값  : " + result64);
        System.out.println("비교    : " + expected64.equals(result64));
        System.out.println();

        // --- 테스트 케이스 65 ---
        String[] survey65 = 약간 동의;
        String expected65 = "어피치형 1점";
        String result65 = solution(survey65, choices65);

        System.out.println("--- Test Case 65 ---");
        System.out.println("기대값  : " + expected65);
        System.out.println("결과값  : " + result65);
        System.out.println("비교    : " + expected65.equals(result65));
        System.out.println();

        // --- 테스트 케이스 66 ---
        String[] survey66 = 동의;
        String expected66 = "어피치형 2점";
        String result66 = solution(survey66, choices66);

        System.out.println("--- Test Case 66 ---");
        System.out.println("기대값  : " + expected66);
        System.out.println("결과값  : " + result66);
        System.out.println("비교    : " + expected66.equals(result66));
        System.out.println();

        // --- 테스트 케이스 67 ---
        String[] survey67 = 매우 동의;
        String expected67 = "어피치형 3점";
        String result67 = solution(survey67, choices67);

        System.out.println("--- Test Case 67 ---");
        System.out.println("기대값  : " + expected67);
        System.out.println("결과값  : " + result67);
        System.out.println("비교    : " + expected67.equals(result67));

    }

    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        return answer;
    }
}
