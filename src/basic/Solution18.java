package basic;

/**
 * <h2>문제 : rny_string</h2>
 * <li>'m'과 "rn"이 모양이 비슷하게 생긴 점을 활용해 문자열에 장난을 하려고 합니다. 문자열 rny_string이 주어질 때, rny_string의 모든 'm'을 "rn"으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.</li>
 */
public class Solution18 {
    public static void main(String[] args) {
        System.out.println(solution("masterpiece"));
        System.out.println(solution("programmers"));
        System.out.println(solution("jerry"));
        System.out.println(solution("burn"));
    }
    private static String solution(String rny_string) {
        return rny_string.replace("m", "rn");
    }
}
