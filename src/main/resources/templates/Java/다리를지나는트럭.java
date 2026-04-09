public class 다리를지나는트럭 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int bridge_length1 = 0;
        int weight1 = [];
        int[] truck_weights1 = {};
        int expected1 = [7456];
        int result1 = solution(bridge_length1, weight1, truck_weights1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int bridge_length2 = 1~2;
        int weight2 = [];
        int[] truck_weights2 = {7};
        int expected2 = [456];
        int result2 = solution(bridge_length2, weight2, truck_weights2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int bridge_length3 = 3;
        int weight3 = [7];
        int[] truck_weights3 = {4};
        int expected3 = [56];
        int result3 = solution(bridge_length3, weight3, truck_weights3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int bridge_length4 = 4;
        int weight4 = [7];
        int[] truck_weights4 = {4,5};
        int expected4 = [6];
        int result4 = solution(bridge_length4, weight4, truck_weights4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        int bridge_length5 = 5;
        int weight5 = [74];
        int[] truck_weights5 = {5};
        int expected5 = [6];
        int result5 = solution(bridge_length5, weight5, truck_weights5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + expected5);
        System.out.println("결과값  : " + result5);
        System.out.println("비교    : " + (expected5 == result5));
        System.out.println();

        // --- 테스트 케이스 6 ---
        int bridge_length6 = 6~7;
        int weight6 = [745];
        int[] truck_weights6 = {6};
        int expected6 = [];
        int result6 = solution(bridge_length6, weight6, truck_weights6);

        System.out.println("--- Test Case 6 ---");
        System.out.println("기대값  : " + expected6);
        System.out.println("결과값  : " + result6);
        System.out.println("비교    : " + (expected6 == result6));
        System.out.println();

        // --- 테스트 케이스 7 ---
        int bridge_length7 = 8;
        int weight7 = [7456];
        int[] truck_weights7 = {};
        int expected7 = [];
        int result7 = solution(bridge_length7, weight7, truck_weights7);

        System.out.println("--- Test Case 7 ---");
        System.out.println("기대값  : " + expected7);
        System.out.println("결과값  : " + result7);
        System.out.println("비교    : " + (expected7 == result7));
        System.out.println();

        // --- 테스트 케이스 8 ---
        int bridge_length8 = bridge_length;
        int weight8 = weight;
        int[] truck_weights8 = truck_weights;
        int expected8 = return;
        int result8 = solution(bridge_length8, weight8, truck_weights8);

        System.out.println("--- Test Case 8 ---");
        System.out.println("기대값  : " + expected8);
        System.out.println("결과값  : " + result8);
        System.out.println("비교    : " + (expected8 == result8));
        System.out.println();

        // --- 테스트 케이스 9 ---
        int bridge_length9 = ---;
        int weight9 = ---;
        int[] truck_weights9 = ---;
        int expected9 = ---;
        int result9 = solution(bridge_length9, weight9, truck_weights9);

        System.out.println("--- Test Case 9 ---");
        System.out.println("기대값  : " + expected9);
        System.out.println("결과값  : " + result9);
        System.out.println("비교    : " + (expected9 == result9));
        System.out.println();

        // --- 테스트 케이스 10 ---
        int bridge_length10 = 2;
        int weight10 = 10;
        int[] truck_weights10 = {7,4,5,6};
        int expected10 = 8;
        int result10 = solution(bridge_length10, weight10, truck_weights10);

        System.out.println("--- Test Case 10 ---");
        System.out.println("기대값  : " + expected10);
        System.out.println("결과값  : " + result10);
        System.out.println("비교    : " + (expected10 == result10));
        System.out.println();

        // --- 테스트 케이스 11 ---
        int bridge_length11 = 100;
        int weight11 = 100;
        int[] truck_weights11 = {10};
        int expected11 = 101;
        int result11 = solution(bridge_length11, weight11, truck_weights11);

        System.out.println("--- Test Case 11 ---");
        System.out.println("기대값  : " + expected11);
        System.out.println("결과값  : " + result11);
        System.out.println("비교    : " + (expected11 == result11));
        System.out.println();

        // --- 테스트 케이스 12 ---
        int bridge_length12 = 100;
        int weight12 = 100;
        int[] truck_weights12 = {10,10,10,10,10,10,10,10,10,10};
        int expected12 = 110;
        int result12 = solution(bridge_length12, weight12, truck_weights12);

        System.out.println("--- Test Case 12 ---");
        System.out.println("기대값  : " + expected12);
        System.out.println("결과값  : " + result12);
        System.out.println("비교    : " + (expected12 == result12));

    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        return answer;
    }
}
