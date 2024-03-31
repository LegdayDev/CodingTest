package basic.day15;

/**
 * <h2>문제 : 문자열 섞기</h2>
 * <p>
 * 길이가 같은 두 문자열 str1과 str2가 주어집니다.
 * <p>
 * 두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.
 * </p>
 */
public class Solution80 {
    public static void main(String[] args) {
        System.out.println(solution("aaaaa", "bbbbb"));
    }

    private static String solution(String str1, String str2) {
        String result = "";
        for (int i = 0; i < str1.length(); i++) {
            result += (str1.charAt(i)) + (str2.charAt(i)+"");
        }
        return result;
    }
}
