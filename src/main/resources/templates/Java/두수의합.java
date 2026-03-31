
public class 두수의합{

    public static void main(String[] args) {
        String a="582";
        String b="734";
        String result=solution(a,b);
        System.out.println("--- Test Case 1 ---");
        System.out.println("기대값  : 1316" );
        System.out.println("결과값  : " + result);
        System.out.println("비교 : " + "1316".equals(result ) );

        String a2="18446744073709551615";
        String b2="287346502836570928366";
        String result2=solution(a2,b2);
        System.out.println("--- Test Case 2 ---");
        System.out.println("기대값  : 305793246910280479981" );
        System.out.println("결과값  : " +result2 );
        System.out.println("비교 : " + "305793246910280479981".equals( result2  ) );
        System.out.println("-------------------------------------------");

        String a3="0";
        String b3="0";
        String result3=solution(a3,b3);
        System.out.println("--- Test Case 3 ---");
        System.out.println("기대값  : 0" );
        System.out.println("결과값  : " + result3);
        System.out.println("비교 : " + "0".equals(result3 ) );

    }

    public static String solution(String a, String b) {
        String answer = "";
        return answer;
    }
}

