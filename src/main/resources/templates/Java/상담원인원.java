public class 상담원인원 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int k1 = 1번 참가자;
        int n1 = 10분;
        int[][] reqs1 = 60분;
        int expected1 = 1번 유형;
        int result1 = solution(k1, n1, reqs1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int k2 = 2번 참가자;
        int n2 = 15분;
        int[][] reqs2 = 100분;
        int expected2 = 3번 유형;
        int result2 = solution(k2, n2, reqs2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int k3 = 3번 참가자;
        int n3 = 20분;
        int[][] reqs3 = 30분;
        int expected3 = 1번 유형;
        int result3 = solution(k3, n3, reqs3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int k4 = 4번 참가자;
        int n4 = 30분;
        int[][] reqs4 = 50분;
        int expected4 = 3번 유형;
        int result4 = solution(k4, n4, reqs4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        int k5 = 5번 참가자;
        int n5 = 50분;
        int[][] reqs5 = 40분;
        int expected5 = 1번 유형;
        int result5 = solution(k5, n5, reqs5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + expected5);
        System.out.println("결과값  : " + result5);
        System.out.println("비교    : " + (expected5 == result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        int k6 = 6번 참가자;
        int n6 = 60분;
        int[][] reqs6 = 30분;
        int expected6 = 2번 유형;
        int result6 = solution(k6, n6, reqs6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + expected6);
        System.out.println("결과값  : " + result6);
        System.out.println("비교    : " + (expected6 == result6));
        System.out.println();

        // --- 테스트 케이스 7 ---
        int k7 = 7번 참가자;
        int n7 = 65분;
        int[][] reqs7 = 30분;
        int expected7 = 1번 유형;
        int result7 = solution(k7, n7, reqs7);

        System.out.println("--- Test Case 7 ---");
        System.out.println("기대값  : " + expected7);
        System.out.println("결과값  : " + result7);
        System.out.println("비교    : " + (expected7 == result7));
        System.out.println();

        // --- 테스트 케이스 8 ---
        int k8 = 8번 참가자;
        int n8 = 70분;
        int[][] reqs8 = 100분;
        int expected8 = 2번 유형;
        int result8 = solution(k8, n8, reqs8);

        System.out.println("--- Test Case 8 ---");
        System.out.println("기대값  : " + expected8);
        System.out.println("결과값  : " + result8);
        System.out.println("비교    : " + (expected8 == result8));
        System.out.println();

        // --- 테스트 케이스 9 ---
        int k9 = k;
        int n9 = n;
        int[][] reqs9 = reqs;
        int expected9 = result;
        int result9 = solution(k9, n9, reqs9);

        System.out.println("--- Test Case 9 ---");
        System.out.println("기대값  : " + expected9);
        System.out.println("결과값  : " + result9);
        System.out.println("비교    : " + (expected9 == result9));
        System.out.println();

        // --- 테스트 케이스 10 ---
        int k10 = ---;
        int n10 = ---;
        int[][] reqs10 = ---;
        int expected10 = ---;
        int result10 = solution(k10, n10, reqs10);

        System.out.println("--- Test Case 10 ---");
        System.out.println("기대값  : " + expected10);
        System.out.println("결과값  : " + result10);
        System.out.println("비교    : " + (expected10 == result10));
        System.out.println();

        // --- 테스트 케이스 11 ---
        int k11 = 3;
        int n11 = 5;
        int[][] reqs11 = {{10, 60, 1}, {15, 100, 3}, {20, 30, 1}, {30, 50, 3}, {50, 40, 1}, {60, 30, 2}, {65, 30, 1}, {70, 100, 2}};
        int expected11 = 25;
        int result11 = solution(k11, n11, reqs11);

        System.out.println("--- Test Case 11 ---");
        System.out.println("기대값  : " + expected11);
        System.out.println("결과값  : " + result11);
        System.out.println("비교    : " + (expected11 == result11));
        System.out.println();

        // --- 테스트 케이스 12 ---
        int k12 = 2;
        int n12 = 3;
        int[][] reqs12 = {{5, 55, 2}, {10, 90, 2}, {20, 40, 2}, {50, 45, 2}, {100, 50, 2}};
        int expected12 = 90;
        int result12 = solution(k12, n12, reqs12);

        System.out.println("--- Test Case 12 ---");
        System.out.println("기대값  : " + expected12);
        System.out.println("결과값  : " + result12);
        System.out.println("비교    : " + (expected12 == result12));
        System.out.println();

        // --- 테스트 케이스 13 ---
        int k13 = 참가자 번호;
        int n13 = 시각;
        int[][] reqs13 = 상담 시간;
        int expected13 = 상담 유형;
        int result13 = solution(k13, n13, reqs13);

        System.out.println("--- Test Case 13 ---");
        System.out.println("기대값  : " + expected13);
        System.out.println("결과값  : " + result13);
        System.out.println("비교    : " + (expected13 == result13));
        System.out.println();

        // --- 테스트 케이스 14 ---
        int k14 = ---;
        int n14 = ---;
        int[][] reqs14 = ---;
        int expected14 = ---;
        int result14 = solution(k14, n14, reqs14);

        System.out.println("--- Test Case 14 ---");
        System.out.println("기대값  : " + expected14);
        System.out.println("결과값  : " + result14);
        System.out.println("비교    : " + (expected14 == result14));
        System.out.println();

        // --- 테스트 케이스 15 ---
        int k15 = 1번 참가자;
        int n15 = 5분;
        int[][] reqs15 = 55분;
        int expected15 = 2번 유형;
        int result15 = solution(k15, n15, reqs15);

        System.out.println("--- Test Case 15 ---");
        System.out.println("기대값  : " + expected15);
        System.out.println("결과값  : " + result15);
        System.out.println("비교    : " + (expected15 == result15));
        System.out.println();

        // --- 테스트 케이스 16 ---
        int k16 = 2번 참가자;
        int n16 = 10분;
        int[][] reqs16 = 90분;
        int expected16 = 2번 유형;
        int result16 = solution(k16, n16, reqs16);

        System.out.println("--- Test Case 16 ---");
        System.out.println("기대값  : " + expected16);
        System.out.println("결과값  : " + result16);
        System.out.println("비교    : " + (expected16 == result16));
        System.out.println();

        // --- 테스트 케이스 17 ---
        int k17 = 3번 참가자;
        int n17 = 20분;
        int[][] reqs17 = 40분;
        int expected17 = 2번 유형;
        int result17 = solution(k17, n17, reqs17);

        System.out.println("--- Test Case 17 ---");
        System.out.println("기대값  : " + expected17);
        System.out.println("결과값  : " + result17);
        System.out.println("비교    : " + (expected17 == result17));
        System.out.println();

        // --- 테스트 케이스 18 ---
        int k18 = 4번 참가자;
        int n18 = 50분;
        int[][] reqs18 = 45분;
        int expected18 = 2번 유형;
        int result18 = solution(k18, n18, reqs18);

        System.out.println("--- Test Case 18 ---");
        System.out.println("기대값  : " + expected18);
        System.out.println("결과값  : " + result18);
        System.out.println("비교    : " + (expected18 == result18));
        System.out.println();

        // --- 테스트 케이스 19 ---
        int k19 = 5번 참가자;
        int n19 = 100분;
        int[][] reqs19 = 50분;
        int expected19 = 2번 유형;
        int result19 = solution(k19, n19, reqs19);

        System.out.println("--- Test Case 19 ---");
        System.out.println("기대값  : " + expected19);
        System.out.println("결과값  : " + result19);
        System.out.println("비교    : " + (expected19 == result19));

    }

    public static int solution(int k, int n, int[][] reqs) {
        int answer = 0;
        return answer;
    }
}
