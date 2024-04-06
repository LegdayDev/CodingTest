package basic.day17;

/**
 * <h2>문제 : 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기</h2>
 * <p>
 * 문자열 myString과 pat가 주어집니다. myString의 부분 문자열중 pat로 끝나는 가장 긴 부분 문자열을 찾아서 return 하는 solution 함수를 완성해 주세요.
 * </p>
 */
public class Solution89 {
    public static void main(String[] args) {
        System.out.println(solution("AbCdEFG", "dE"));
        System.out.println(solution("AAAAaaaa", "a"));
    }

    private static String solution(String myString, String pat) {
        int idx = myString.lastIndexOf(pat);
        return myString.substring(0, idx) + pat;
    }
}
