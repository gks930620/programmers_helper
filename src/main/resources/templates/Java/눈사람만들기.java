public class 눈사람만들기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        String[] grid1 = 1;
        long expected1 = 1L;
        long result1 = solution(grid1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        String[] grid2 = 2;
        long expected2 = 1L;
        long result2 = solution(grid2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        String[] grid3 = 2;
        long expected3 = 2L;
        long result3 = solution(grid3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        String[] grid4 = 3;
        long expected4 = 1L;
        long result4 = solution(grid4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        String[] grid5 = 3;
        long expected5 = 2L;
        long result5 = solution(grid5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + expected5);
        System.out.println("결과값  : " + result5);
        System.out.println("비교    : " + (expected5 == result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        String[] grid6 = 3;
        long expected6 = 3L;
        long result6 = solution(grid6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + expected6);
        System.out.println("결과값  : " + result6);
        System.out.println("비교    : " + (expected6 == result6));
        System.out.println();

        // --- 테스트 케이스 7 ---
        String[] grid7 = 4;
        long expected7 = 1L;
        long result7 = solution(grid7);

        System.out.println("--- Test Case 7 ---");
        System.out.println("기대값  : " + expected7);
        System.out.println("결과값  : " + result7);
        System.out.println("비교    : " + (expected7 == result7));
        System.out.println();

        // --- 테스트 케이스 8 ---
        String[] grid8 = 4;
        long expected8 = 2L;
        long result8 = solution(grid8);

        System.out.println("--- Test Case 8 ---");
        System.out.println("기대값  : " + expected8);
        System.out.println("결과값  : " + result8);
        System.out.println("비교    : " + (expected8 == result8));
        System.out.println();

        // --- 테스트 케이스 9 ---
        String[] grid9 = 4;
        long expected9 = 3L;
        long result9 = solution(grid9);

        System.out.println("--- Test Case 9 ---");
        System.out.println("기대값  : " + expected9);
        System.out.println("결과값  : " + result9);
        System.out.println("비교    : " + (expected9 == result9));
        System.out.println();

        // --- 테스트 케이스 10 ---
        String[] grid10 = 5;
        long expected10 = 1L;
        long result10 = solution(grid10);

        System.out.println("--- Test Case 10 ---");
        System.out.println("기대값  : " + expected10);
        System.out.println("결과값  : " + result10);
        System.out.println("비교    : " + (expected10 == result10));
        System.out.println();

        // --- 테스트 케이스 11 ---
        String[] grid11 = 5;
        long expected11 = 2L;
        long result11 = solution(grid11);

        System.out.println("--- Test Case 11 ---");
        System.out.println("기대값  : " + expected11);
        System.out.println("결과값  : " + result11);
        System.out.println("비교    : " + (expected11 == result11));
        System.out.println();

        // --- 테스트 케이스 12 ---
        String[] grid12 = 6;
        long expected12 = 1L;
        long result12 = solution(grid12);

        System.out.println("--- Test Case 12 ---");
        System.out.println("기대값  : " + expected12);
        System.out.println("결과값  : " + result12);
        System.out.println("비교    : " + (expected12 == result12));
        System.out.println();

        // --- 테스트 케이스 13 ---
        String[] grid13 = grid;
        long expected13 = resultL;
        long result13 = solution(grid13);

        System.out.println("--- Test Case 13 ---");
        System.out.println("기대값  : " + expected13);
        System.out.println("결과값  : " + result13);
        System.out.println("비교    : " + (expected13 == result13));
        System.out.println();

        // --- 테스트 케이스 14 ---
        String[] grid14 = ---;
        long expected14 = ---L;
        long result14 = solution(grid14);

        System.out.println("--- Test Case 14 ---");
        System.out.println("기대값  : " + expected14);
        System.out.println("결과값  : " + result14);
        System.out.println("비교    : " + (expected14 == result14));
        System.out.println();

        // --- 테스트 케이스 15 ---
        String[] grid15 = {"#.##.", "#o###", ".o.#.", "#..#."};
        long expected15 = 12L;
        long result15 = solution(grid15);

        System.out.println("--- Test Case 15 ---");
        System.out.println("기대값  : " + expected15);
        System.out.println("결과값  : " + result15);
        System.out.println("비교    : " + (expected15 == result15));
        System.out.println();

        // --- 테스트 케이스 16 ---
        String[] grid16 = {"##..", "##..", "##.#", ".oo#", "####"};
        long expected16 = 15L;
        long result16 = solution(grid16);

        System.out.println("--- Test Case 16 ---");
        System.out.println("기대값  : " + expected16);
        System.out.println("결과값  : " + result16);
        System.out.println("비교    : " + (expected16 == result16));
        System.out.println();

        // --- 테스트 케이스 17 ---
        String[] grid17 = {"###########", "...o.....o.", "###########"};
        long expected17 = 20L;
        long result17 = solution(grid17);

        System.out.println("--- Test Case 17 ---");
        System.out.println("기대값  : " + expected17);
        System.out.println("결과값  : " + result17);
        System.out.println("비교    : " + (expected17 == result17));
        System.out.println();

        // --- 테스트 케이스 18 ---
        String[] grid18 = {"###########", "......o..o.", "###########"};
        long expected18 = 25L;
        long result18 = solution(grid18);

        System.out.println("--- Test Case 18 ---");
        System.out.println("기대값  : " + expected18);
        System.out.println("결과값  : " + result18);
        System.out.println("비교    : " + (expected18 == result18));
        System.out.println();

        // --- 테스트 케이스 19 ---
        String[] grid19 = 몸통 크기;
        long expected19 = 머리 크기L;
        long result19 = solution(grid19);

        System.out.println("--- Test Case 19 ---");
        System.out.println("기대값  : " + expected19);
        System.out.println("결과값  : " + result19);
        System.out.println("비교    : " + (expected19 == result19));
        System.out.println();

        // --- 테스트 케이스 20 ---
        String[] grid20 = ---;
        long expected20 = ---L;
        long result20 = solution(grid20);

        System.out.println("--- Test Case 20 ---");
        System.out.println("기대값  : " + expected20);
        System.out.println("결과값  : " + result20);
        System.out.println("비교    : " + (expected20 == result20));
        System.out.println();

        // --- 테스트 케이스 21 ---
        String[] grid21 = 1;
        long expected21 = 1L;
        long result21 = solution(grid21);

        System.out.println("--- Test Case 21 ---");
        System.out.println("기대값  : " + expected21);
        System.out.println("결과값  : " + result21);
        System.out.println("비교    : " + (expected21 == result21));
        System.out.println();

        // --- 테스트 케이스 22 ---
        String[] grid22 = 2;
        long expected22 = 1L;
        long result22 = solution(grid22);

        System.out.println("--- Test Case 22 ---");
        System.out.println("기대값  : " + expected22);
        System.out.println("결과값  : " + result22);
        System.out.println("비교    : " + (expected22 == result22));
        System.out.println();

        // --- 테스트 케이스 23 ---
        String[] grid23 = 2;
        long expected23 = 2L;
        long result23 = solution(grid23);

        System.out.println("--- Test Case 23 ---");
        System.out.println("기대값  : " + expected23);
        System.out.println("결과값  : " + result23);
        System.out.println("비교    : " + (expected23 == result23));
        System.out.println();

        // --- 테스트 케이스 24 ---
        String[] grid24 = 3;
        long expected24 = 1L;
        long result24 = solution(grid24);

        System.out.println("--- Test Case 24 ---");
        System.out.println("기대값  : " + expected24);
        System.out.println("결과값  : " + result24);
        System.out.println("비교    : " + (expected24 == result24));
        System.out.println();

        // --- 테스트 케이스 25 ---
        String[] grid25 = 3;
        long expected25 = 2L;
        long result25 = solution(grid25);

        System.out.println("--- Test Case 25 ---");
        System.out.println("기대값  : " + expected25);
        System.out.println("결과값  : " + result25);
        System.out.println("비교    : " + (expected25 == result25));
        System.out.println();

        // --- 테스트 케이스 26 ---
        String[] grid26 = 4;
        long expected26 = 1L;
        long result26 = solution(grid26);

        System.out.println("--- Test Case 26 ---");
        System.out.println("기대값  : " + expected26);
        System.out.println("결과값  : " + result26);
        System.out.println("비교    : " + (expected26 == result26));
        System.out.println();

        // --- 테스트 케이스 27 ---
        String[] grid27 = 4;
        long expected27 = 2L;
        long result27 = solution(grid27);

        System.out.println("--- Test Case 27 ---");
        System.out.println("기대값  : " + expected27);
        System.out.println("결과값  : " + result27);
        System.out.println("비교    : " + (expected27 == result27));
        System.out.println();

        // --- 테스트 케이스 28 ---
        String[] grid28 = 4;
        long expected28 = 3L;
        long result28 = solution(grid28);

        System.out.println("--- Test Case 28 ---");
        System.out.println("기대값  : " + expected28);
        System.out.println("결과값  : " + result28);
        System.out.println("비교    : " + (expected28 == result28));
        System.out.println();

        // --- 테스트 케이스 29 ---
        String[] grid29 = 4;
        long expected29 = 4L;
        long result29 = solution(grid29);

        System.out.println("--- Test Case 29 ---");
        System.out.println("기대값  : " + expected29);
        System.out.println("결과값  : " + result29);
        System.out.println("비교    : " + (expected29 == result29));
        System.out.println();

        // --- 테스트 케이스 30 ---
        String[] grid30 = 5;
        long expected30 = 1L;
        long result30 = solution(grid30);

        System.out.println("--- Test Case 30 ---");
        System.out.println("기대값  : " + expected30);
        System.out.println("결과값  : " + result30);
        System.out.println("비교    : " + (expected30 == result30));
        System.out.println();

        // --- 테스트 케이스 31 ---
        String[] grid31 = 5;
        long expected31 = 2L;
        long result31 = solution(grid31);

        System.out.println("--- Test Case 31 ---");
        System.out.println("기대값  : " + expected31);
        System.out.println("결과값  : " + result31);
        System.out.println("비교    : " + (expected31 == result31));
        System.out.println();

        // --- 테스트 케이스 32 ---
        String[] grid32 = 5;
        long expected32 = 3L;
        long result32 = solution(grid32);

        System.out.println("--- Test Case 32 ---");
        System.out.println("기대값  : " + expected32);
        System.out.println("결과값  : " + result32);
        System.out.println("비교    : " + (expected32 == result32));
        System.out.println();

        // --- 테스트 케이스 33 ---
        String[] grid33 = 6;
        long expected33 = 1L;
        long result33 = solution(grid33);

        System.out.println("--- Test Case 33 ---");
        System.out.println("기대값  : " + expected33);
        System.out.println("결과값  : " + result33);
        System.out.println("비교    : " + (expected33 == result33));
        System.out.println();

        // --- 테스트 케이스 34 ---
        String[] grid34 = 6;
        long expected34 = 2L;
        long result34 = solution(grid34);

        System.out.println("--- Test Case 34 ---");
        System.out.println("기대값  : " + expected34);
        System.out.println("결과값  : " + result34);
        System.out.println("비교    : " + (expected34 == result34));
        System.out.println();

        // --- 테스트 케이스 35 ---
        String[] grid35 = 7;
        long expected35 = 1L;
        long result35 = solution(grid35);

        System.out.println("--- Test Case 35 ---");
        System.out.println("기대값  : " + expected35);
        System.out.println("결과값  : " + result35);
        System.out.println("비교    : " + (expected35 == result35));

    }

    public static long solution(String[] grid) {
        long answer = 0;
        return answer;
    }
}
