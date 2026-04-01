public class 아이템줍기 {

    public static void main(String[] args) {
        // --- 테스트 케이스 1 ---
        int[][] rectangle1 = {{1,1,7,4},{3,2,5,5},{4,3,6,9},{2,6,8,8}};
        int characterX1 = 1;
        int characterY1 = 3;
        int itemX1 = 7;
        int itemY1 = 8;
        int expected1 = 17;
        int result1 = solution(rectangle1, characterX1, characterY1, itemX1, itemY1);

        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : " + expected1);
        System.out.println("결과값  : " + result1);
        System.out.println("비교    : " + (expected1 == result1));
        System.out.println();

        // --- 테스트 케이스 2 ---
        int[][] rectangle2 = {{1,1,8,4},{2,2,4,9},{3,6,9,8},{6,3,7,7}};
        int characterX2 = 9;
        int characterY2 = 7;
        int itemX2 = 6;
        int itemY2 = 1;
        int expected2 = 11;
        int result2 = solution(rectangle2, characterX2, characterY2, itemX2, itemY2);

        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : " + expected2);
        System.out.println("결과값  : " + result2);
        System.out.println("비교    : " + (expected2 == result2));
        System.out.println();

        // --- 테스트 케이스 3 ---
        int[][] rectangle3 = {{1,1,5,7}};
        int characterX3 = 1;
        int characterY3 = 1;
        int itemX3 = 4;
        int itemY3 = 7;
        int expected3 = 9;
        int result3 = solution(rectangle3, characterX3, characterY3, itemX3, itemY3);

        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : " + expected3);
        System.out.println("결과값  : " + result3);
        System.out.println("비교    : " + (expected3 == result3));
        System.out.println();

        // --- 테스트 케이스 4 ---
        int[][] rectangle4 = {{2,1,7,5},{6,4,10,10}};
        int characterX4 = 3;
        int characterY4 = 1;
        int itemX4 = 7;
        int itemY4 = 10;
        int expected4 = 15;
        int result4 = solution(rectangle4, characterX4, characterY4, itemX4, itemY4);

        System.out.println("--- Test Case 4 ---");
        System.out.println("기대값  : " + expected4);
        System.out.println("결과값  : " + result4);
        System.out.println("비교    : " + (expected4 == result4));
        System.out.println();

        // --- 테스트 케이스 5 ---
        int[][] rectangle5 = {{2,2,5,5},{1,3,6,4},{3,1,4,6}};
        int characterX5 = 1;
        int characterY5 = 4;
        int itemX5 = 6;
        int itemY5 = 3;
        int expected5 = 10;
        int result5 = solution(rectangle5, characterX5, characterY5, itemX5, itemY5);

        System.out.println("--- Test Case 5 ---");
        System.out.println("기대값  : " + expected5);
        System.out.println("결과값  : " + result5);
        System.out.println("비교    : " + (expected5 == result5));

    }

    public static int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int answer = 0;
        return answer;
    }
}
