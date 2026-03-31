public class MinMaxString {

    public static void main(String[] args) {
        String a="582";
        String b="734";
        System.out.println("기대값  : 1316" );
        System.out.println("결과값  : " + solution(a,b) );
        System.out.println("비교 : " + "1316".equals(solution(a,b)) );

        String a2="18446744073709551615";
        String b2="287346502836570928366";
        System.out.println("기대값  : 305793246910280479981" );
        System.out.println("결과값  : " + solution(a2,b2) );
        System.out.println("비교 : " + "305793246910280479981".equals(solution(a2,b2)) );

        String a3="0";
        String b3="0";
        System.out.println("기대값  : 0" );
        System.out.println("결과값  : " + solution(a3,b3) );
        System.out.println("비교 : " + "0".equals(solution(a3,b3)) );
    }

    public static String solution(String a, String b) {
        String answer = "";
        return answer;
    }
}

