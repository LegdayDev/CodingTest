package basic.day05;

/**
 * <h2>문제 : 원하는 문자열 찾기</h2>
 * <p>알파벳으로 이루어진 문자열 myString과 pat이 주어집니다. myString의 연속된 부분 문자열 중 pat이 존재하면 1을 그렇지 않으면 0을 return 하는 solution 함수를 완성해 주세요.</p>
 * <p>단, 알파벳 대문자와 소문자는 구분하지 않습니다.</p>
 */
public class Solution32 {
    public static void main(String[] args) {
        System.out.println(solution("AbCdEfG","aBc"));
        System.out.println(solution("aaAA","aaaaa"));
    }
    private static int solution(String myString, String pat) {
        if(myString.toLowerCase().contains(pat.toLowerCase())) return 1;
        else return 0;
    }
}
