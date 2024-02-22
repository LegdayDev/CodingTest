package basic;

/**
 * <h2>문제 : n 번째 원소까지</h2>
 * <li>정수 리스트 num_list와 정수 n이 주어질 때, num_list의 첫 번째 원소부터 n 번째 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.</li>
 */
public class Solution17 {
    public static void main(String[] args) {
        int[] res1 = solution(new int[]{2, 1, 6}, 1);
        int[] res2 = solution(new int[]{5, 2, 1, 7, 5}, 3);

        for (int value : res1) {
            System.out.print(value + " ");
        }
        System.out.println();
        for (int value : res2) {
            System.out.print(value + " ");
        }
    }

    private static int[] solution(int[] num_list, int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = num_list[i];
        }
        return res;
    }
}
