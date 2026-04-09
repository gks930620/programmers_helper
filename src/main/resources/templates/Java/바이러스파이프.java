public class 바이러스파이프 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int n1 = #1;
        int infection1 = 10%;
        int expected1 = 트리가 일렬 모양입니다. 즉 각 배양체에 연결된 파이프는 1개 혹은 2개입니다.;
        int result1 = solution(n1, infection1, edges1, k1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int n2 = #2;
        int infection2 = 20%;
        int expected2 = 파이프의 type은 A 혹은 B만 주어집니다.;
        int result2 = solution(n2, infection2, edges2, k2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int n3 = #3;
        int infection3 = 30%;
        int expected3 = 한 배양체에 연결된 파이프의 type이 모두 다릅니다.;
        int result3 = solution(n3, infection3, edges3, k3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int n4 = #4;
        int infection4 = 40%;
        int expected4 = 추가 제한 사항 없음;
        int result4 = solution(n4, infection4, edges4, k4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));

    }

    public static int solution(int n, int infection, int[][] edges, int k) {
        int answer = 0;
        return answer;
    }
}
