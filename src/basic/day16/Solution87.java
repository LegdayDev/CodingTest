package basic.day16;

/**
 * <h2>문제 : 문자열 뒤집기</h2>
 * <p>
 *     문자열 my_string과 정수 s, e가 매개변수로 주어질 때, my_string에서 인덱스 s부터 인덱스 e까지를 뒤집은 문자열을 return 하는 solution 함수를 작성해 주세요.
 * </p>
 */
public class Solution87 {
    public static void main(String[] args) {
        System.out.println(solution("Progra21Sremm3",6,12));
    }

    private static String solution(String my_string, int s, int e) {
        String splitStr = my_string.substring(s, e + 1);
        String reverseStr = "";
        for (int i = splitStr.length()-1; i >=0 ; i--) {
            reverseStr +=splitStr.charAt(i);
        }
        return my_string.replace(splitStr, "/").replace("/",reverseStr);
    }
}
