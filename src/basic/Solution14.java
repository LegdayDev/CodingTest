package basic;

/**
 * <h2>문제 : 문자열로 변환</h2>
 * <li>정수 n이 주어질 때, n을 문자열로 변환하여 return하도록 solution 함수를 완성해주세요.</li>
 */
public class Solution14 {
    public static void main(String[] args) {
        System.out.println(solution(123));
        System.out.println(solution(2573));
    }
    private static String solution(int n) {
        return String.valueOf(n);
    }
}
