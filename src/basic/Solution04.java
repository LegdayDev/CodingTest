package basic;

/**
 * <h2>문제 : n 번째 원소부터</h2>
 * <li>정수 리스트 num_list와 정수 n이 주어질 때, n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.</li>
 */
public class Solution04 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{1, 2, 4, 5}, 2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+", ");
        }
    }
    private static int[] solution(int[] num_list, int n) {
        int[] result = new int[num_list.length - (n - 1)];
        System.arraycopy(num_list, n - 1, result, 0, (num_list.length - (n - 1)));
        return result;
    }
}
