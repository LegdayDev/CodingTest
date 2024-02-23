package basic.day01;

/**
 * <h2>문제 : 공배수</h2>
 * <li>정수 number와 n, m이 주어집니다. number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.</li>
 */
public class Solution05 {
    public static void main(String[] args) {
        System.out.println(solution(10,2,5));
    }
    private static int solution(int number, int n, int m) {
        if (number % n == 0 && number % m == 0) return 1;
        else return 0;
    }
}
