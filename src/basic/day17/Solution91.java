package basic.day17;

/**
 * <h2>문제 : 1로 만들기</h2>
 * <p>
 * 정수가 있을 때, 짝수라면 반으로 나누고, 홀수라면 1을 뺀 뒤 반으로 나누면, 마지막엔 1이 됩니다.
 * <p>
 * 예를 들어 10이 있다면 다음과 같은 과정으로 1이 됩니다.
 * <ul>
 *     <li>
 *         10 / 2 = 5
 *     </li>
 *     <li>
 *         (5 - 1) / 2 = 2
 *     </li>
 *     <li>
 *         2 / 2 = 1
 *     </li>
 * </ul>
 * <p>
 * 위와 같이 3번의 나누기 연산으로 1이 되었습니다.
 * <p>
 * 정수들이 담긴 리스트 num_list가 주어질 때, num_list의 모든 원소를 1로 만들기 위해서 필요한 나누기 연산의 횟수를 return하도록 solution 함수를 완성해주세요.
 * </p>
 */
public class Solution91 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{12, 4, 15, 1, 14}));
    }

    private static int solution(int[] num_list) {
        int count = 0;

        for (int value : num_list) {
            while (true) {
                if (value == 1) break;
                if (value % 2 == 0) { // 짝수
                    value /= 2;
                    count++;
                } else if (value % 2 == 1) { // 홀수
                    value -= 1;
                    value /= 2;
                    count++;
                }
            }
        }
        return count;
    }
}
