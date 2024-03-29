package basic.day14;

/**
 * <h2>문제 : 세로 읽기</h2>
 * <p>
 * 문자열 my_string과 두 정수 m, c가 주어집니다.
 * my_string을 한 줄에 m 글자씩 가로로 적었을 때 왼쪽부터 세로로 c번째 열에 적힌 글자들을 문자열로 return 하는 solution 함수를 작성해 주세요.
 * </p>
 */
public class Solution78 {
    public static void main(String[] args) {
        System.out.println(solution("ihrhbakrfpndopljhygc", 4, 2));
        System.out.println(solution("programmers", 1, 1));
    }

    private static String solution(String my_string, int m, int c) {
        String result = "";

        for (int i = 0; i < my_string.length(); i += m) {
            result += (String.valueOf(my_string.charAt(i + (c - 1))));
        }
        return result;
    }
}
