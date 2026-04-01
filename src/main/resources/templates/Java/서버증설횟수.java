public class 서버증설횟수 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[] players1 = 0 ~ 1;
        int m1 = 0;
        int k1 = 0;
        int expected1 = 0;
        int result1 = solution(players1, m1, k1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[] players2 = 1 ~ 2;
        int m2 = 2;
        int k2 = 0;
        int expected2 = 0;
        int result2 = solution(players2, m2, k2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[] players3 = 2 ~ 3;
        int m3 = 3;
        int k3 = 1;
        int expected3 = 1;
        int result3 = solution(players3, m3, k3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int[] players4 = 3 ~ 4;
        int m4 = 3;
        int k4 = 1;
        int expected4 = 0;
        int result4 = solution(players4, m4, k4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        int[] players5 = 4 ~ 5;
        int m5 = 1;
        int k5 = 1;
        int expected5 = 0;
        int result5 = solution(players5, m5, k5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + expected5);
        System.out.println("결과값  : " + result5);
        System.out.println("비교    : " + (expected5 == result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        int[] players6 = 5 ~ 6;
        int m6 = 2;
        int k6 = 1;
        int expected6 = 0;
        int result6 = solution(players6, m6, k6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + expected6);
        System.out.println("결과값  : " + result6);
        System.out.println("비교    : " + (expected6 == result6));
        System.out.println();

        // --- 테스트 케이스 7 ---
        int[] players7 = 6 ~ 7;
        int m7 = 0;
        int k7 = 1;
        int expected7 = 0;
        int result7 = solution(players7, m7, k7);

        System.out.println("--- Test Case 7 ---");
        System.out.println("기대값  : " + expected7);
        System.out.println("결과값  : " + result7);
        System.out.println("비교    : " + (expected7 == result7));
        System.out.println();

        // --- 테스트 케이스 8 ---
        int[] players8 = 7 ~ 8;
        int m8 = 0;
        int k8 = 0;
        int expected8 = 0;
        int result8 = solution(players8, m8, k8);

        System.out.println("--- Test Case 8 ---");
        System.out.println("기대값  : " + expected8);
        System.out.println("결과값  : " + result8);
        System.out.println("비교    : " + (expected8 == result8));
        System.out.println();

        // --- 테스트 케이스 9 ---
        int[] players9 = 8 ~ 9;
        int m9 = 0;
        int k9 = 0;
        int expected9 = 0;
        int result9 = solution(players9, m9, k9);

        System.out.println("--- Test Case 9 ---");
        System.out.println("기대값  : " + expected9);
        System.out.println("결과값  : " + result9);
        System.out.println("비교    : " + (expected9 == result9));
        System.out.println();

        // --- 테스트 케이스 10 ---
        int[] players10 = 9 ~ 10;
        int m10 = 0;
        int k10 = 0;
        int expected10 = 0;
        int result10 = solution(players10, m10, k10);

        System.out.println("--- Test Case 10 ---");
        System.out.println("기대값  : " + expected10);
        System.out.println("결과값  : " + result10);
        System.out.println("비교    : " + (expected10 == result10));
        System.out.println();

        // --- 테스트 케이스 11 ---
        int[] players11 = 10 ~ 11;
        int m11 = 4;
        int k11 = 1;
        int expected11 = 1;
        int result11 = solution(players11, m11, k11);

        System.out.println("--- Test Case 11 ---");
        System.out.println("기대값  : " + expected11);
        System.out.println("결과값  : " + result11);
        System.out.println("비교    : " + (expected11 == result11));
        System.out.println();

        // --- 테스트 케이스 12 ---
        int[] players12 = 11 ~ 12;
        int m12 = 2;
        int k12 = 1;
        int expected12 = 0;
        int result12 = solution(players12, m12, k12);

        System.out.println("--- Test Case 12 ---");
        System.out.println("기대값  : " + expected12);
        System.out.println("결과값  : " + result12);
        System.out.println("비교    : " + (expected12 == result12));
        System.out.println();

        // --- 테스트 케이스 13 ---
        int[] players13 = 12 ~ 13;
        int m13 = 0;
        int k13 = 1;
        int expected13 = 0;
        int result13 = solution(players13, m13, k13);

        System.out.println("--- Test Case 13 ---");
        System.out.println("기대값  : " + expected13);
        System.out.println("결과값  : " + result13);
        System.out.println("비교    : " + (expected13 == result13));
        System.out.println();

        // --- 테스트 케이스 14 ---
        int[] players14 = 13 ~ 14;
        int m14 = 6;
        int k14 = 2;
        int expected14 = 1;
        int result14 = solution(players14, m14, k14);

        System.out.println("--- Test Case 14 ---");
        System.out.println("기대값  : " + expected14);
        System.out.println("결과값  : " + result14);
        System.out.println("비교    : " + (expected14 == result14));
        System.out.println();

        // --- 테스트 케이스 15 ---
        int[] players15 = 14 ~ 15;
        int m15 = 0;
        int k15 = 2;
        int expected15 = 0;
        int result15 = solution(players15, m15, k15);

        System.out.println("--- Test Case 15 ---");
        System.out.println("기대값  : " + expected15);
        System.out.println("결과값  : " + result15);
        System.out.println("비교    : " + (expected15 == result15));
        System.out.println();

        // --- 테스트 케이스 16 ---
        int[] players16 = 15 ~ 16;
        int m16 = 4;
        int k16 = 1;
        int expected16 = 0;
        int result16 = solution(players16, m16, k16);

        System.out.println("--- Test Case 16 ---");
        System.out.println("기대값  : " + expected16);
        System.out.println("결과값  : " + result16);
        System.out.println("비교    : " + (expected16 == result16));
        System.out.println();

        // --- 테스트 케이스 17 ---
        int[] players17 = 16 ~ 17;
        int m17 = 2;
        int k17 = 1;
        int expected17 = 0;
        int result17 = solution(players17, m17, k17);

        System.out.println("--- Test Case 17 ---");
        System.out.println("기대값  : " + expected17);
        System.out.println("결과값  : " + result17);
        System.out.println("비교    : " + (expected17 == result17));
        System.out.println();

        // --- 테스트 케이스 18 ---
        int[] players18 = 17 ~ 18;
        int m18 = 13;
        int k18 = 4;
        int expected18 = 3;
        int result18 = solution(players18, m18, k18);

        System.out.println("--- Test Case 18 ---");
        System.out.println("기대값  : " + expected18);
        System.out.println("결과값  : " + result18);
        System.out.println("비교    : " + (expected18 == result18));
        System.out.println();

        // --- 테스트 케이스 19 ---
        int[] players19 = 18 ~ 19;
        int m19 = 3;
        int k19 = 3;
        int expected19 = 0;
        int result19 = solution(players19, m19, k19);

        System.out.println("--- Test Case 19 ---");
        System.out.println("기대값  : " + expected19);
        System.out.println("결과값  : " + result19);
        System.out.println("비교    : " + (expected19 == result19));
        System.out.println();

        // --- 테스트 케이스 20 ---
        int[] players20 = 19 ~ 20;
        int m20 = 5;
        int k20 = 3;
        int expected20 = 0;
        int result20 = solution(players20, m20, k20);

        System.out.println("--- Test Case 20 ---");
        System.out.println("기대값  : " + expected20);
        System.out.println("결과값  : " + result20);
        System.out.println("비교    : " + (expected20 == result20));
        System.out.println();

        // --- 테스트 케이스 21 ---
        int[] players21 = 20 ~ 21;
        int m21 = 10;
        int k21 = 3;
        int expected21 = 0;
        int result21 = solution(players21, m21, k21);

        System.out.println("--- Test Case 21 ---");
        System.out.println("기대값  : " + expected21);
        System.out.println("결과값  : " + result21);
        System.out.println("비교    : " + (expected21 == result21));
        System.out.println();

        // --- 테스트 케이스 22 ---
        int[] players22 = 21 ~ 22;
        int m22 = 0;
        int k22 = 3;
        int expected22 = 0;
        int result22 = solution(players22, m22, k22);

        System.out.println("--- Test Case 22 ---");
        System.out.println("기대값  : " + expected22);
        System.out.println("결과값  : " + result22);
        System.out.println("비교    : " + (expected22 == result22));
        System.out.println();

        // --- 테스트 케이스 23 ---
        int[] players23 = 22 ~ 23;
        int m23 = 1;
        int k23 = 0;
        int expected23 = 0;
        int result23 = solution(players23, m23, k23);

        System.out.println("--- Test Case 23 ---");
        System.out.println("기대값  : " + expected23);
        System.out.println("결과값  : " + result23);
        System.out.println("비교    : " + (expected23 == result23));
        System.out.println();

        // --- 테스트 케이스 24 ---
        int[] players24 = 23 ~ 24;
        int m24 = 5;
        int k24 = 1;
        int expected24 = 1;
        int result24 = solution(players24, m24, k24);

        System.out.println("--- Test Case 24 ---");
        System.out.println("기대값  : " + expected24);
        System.out.println("결과값  : " + result24);
        System.out.println("비교    : " + (expected24 == result24));
        System.out.println();

        // --- 테스트 케이스 25 ---
        int[] players25 = players;
        int m25 = m;
        int k25 = k;
        int expected25 = result;
        int result25 = solution(players25, m25, k25);

        System.out.println("--- Test Case 25 ---");
        System.out.println("기대값  : " + expected25);
        System.out.println("결과값  : " + result25);
        System.out.println("비교    : " + (expected25 == result25));
        System.out.println();

        // --- 테스트 케이스 26 ---
        int[] players26 = ---;
        int m26 = ---;
        int k26 = ---;
        int expected26 = ---;
        int result26 = solution(players26, m26, k26);

        System.out.println("--- Test Case 26 ---");
        System.out.println("기대값  : " + expected26);
        System.out.println("결과값  : " + result26);
        System.out.println("비교    : " + (expected26 == result26));
        System.out.println();

        // --- 테스트 케이스 27 ---
        int[] players27 = {0, 2, 3, 3, 1, 2, 0, 0, 0, 0, 4, 2, 0, 6, 0, 4, 2, 13, 3, 5, 10, 0, 1, 5};
        int m27 = 3;
        int k27 = 5;
        int expected27 = 7;
        int result27 = solution(players27, m27, k27);

        System.out.println("--- Test Case 27 ---");
        System.out.println("기대값  : " + expected27);
        System.out.println("결과값  : " + result27);
        System.out.println("비교    : " + (expected27 == result27));
        System.out.println();

        // --- 테스트 케이스 28 ---
        int[] players28 = {0, 0, 0, 10, 0, 12, 0, 15, 0, 1, 0, 1, 0, 0, 0, 5, 0, 0, 11, 0, 8, 0, 0, 0};
        int m28 = 5;
        int k28 = 1;
        int expected28 = 11;
        int result28 = solution(players28, m28, k28);

        System.out.println("--- Test Case 28 ---");
        System.out.println("기대값  : " + expected28);
        System.out.println("결과값  : " + result28);
        System.out.println("비교    : " + (expected28 == result28));
        System.out.println();

        // --- 테스트 케이스 29 ---
        int[] players29 = {0, 0, 0, 0, 0, 2, 0, 0, 0, 1, 0, 5, 0, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1};
        int m29 = 1;
        int k29 = 1;
        int expected29 = 12;
        int result29 = solution(players29, m29, k29);

        System.out.println("--- Test Case 29 ---");
        System.out.println("기대값  : " + expected29);
        System.out.println("결과값  : " + result29);
        System.out.println("비교    : " + (expected29 == result29));

    }

    public static int solution(int[] players, int m, int k) {
        int answer = 0;
        return answer;
    }
}
