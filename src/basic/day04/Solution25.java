package basic.day04;

/**
 * <h2>문제 : 홀짝에 따라 다른 값 반환하기</h2>
 * <p>양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.</p>
 */
public class Solution25 {
    public static void main(String[] args) {
        System.out.println(solution(7));
        System.out.println(solution(10));
    }

    private static int solution(int n) {
        int res = 0;
        if (n % 2 == 1) {
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 1) res += i;
            }
        } else {
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 0) res += i * i;
            }
        }
        return res;
    }
}
