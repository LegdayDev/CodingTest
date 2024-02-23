package basic.day03;

/**
 * <h2>문제 : 문자열 곱하기</h2>
 * <p>문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.</p>
 */
public class Solution20 {
    public static void main(String[] args) {
        System.out.println(solution("string",3));
        System.out.println(solution("love",10));
    }
    private static String solution(String my_string, int k) {
        return my_string.repeat(k);
    }
}
