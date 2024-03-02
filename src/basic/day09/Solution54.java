package basic.day09;

/**
 * <h2>문제 : 문자열 정수의 합</h2>
 * <p>
 * 한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.
 * </p>
 */
public class Solution54 {
    public static void main(String[] args) {
        System.out.println(solution("123456789"));
        System.out.println(solution("1000000"));
    }

    private static int solution(String num_str) {
        int total = 0;
        for (int i = 0; i < num_str.length(); i++) {
            total += Integer.parseInt(String.valueOf(num_str.charAt(i)));
        }

        return total;
        /**
         * <h3>베스트 풀이</h3>
         * return num_str.chars().map(c->c-48).sum();
         */
    }
}
