package basic.day15;

/**
 * <h2>문제 : 글자 지우기</h2>
 * <p>
 * 문자열 my_string과 정수 배열 indices가 주어질 때,
 * my_string에서 indices의 원소에 해당하는 인덱스의 글자를 지우고 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
 * </p>
 */
public class Solution84 {
    public static void main(String[] args) {
        System.out.println(solution("apporoograpemmemprs", new int[]{1, 16, 6, 15, 0, 10, 11, 3}));
    }

    private static String solution(String my_string, int[] indices) {
        char[] charArray = my_string.toCharArray();
        for (int i = 0; i < indices.length; i++) {
            charArray[indices[i]] = 32;
        }
        return String.valueOf(charArray).replace(" ", "");
    }
}
