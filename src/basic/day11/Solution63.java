package basic.day11;

/**
 * <h2>문제 : l로 만들기</h2>
 * <p>
 *     알파벳 소문자로 이루어진 문자열 myString이 주어집니다.
 *     알파벳 순서에서 "l"보다 앞서는 모든 문자를 "l"로 바꾼 문자열을 return 하는 solution 함수를 완성해 주세요.
 * </p>
 */
public class Solution63 {
    public static void main(String[] args) {
        System.out.println(solution("abcdevwxyz"));
        System.out.println(solution("jjnnllkkmm"));
    }
    private static String solution(String myString) {
        char[] charArr = myString.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] < 'l') charArr[i] = 'l';
        }
        return String.valueOf(charArr);
    }
}
