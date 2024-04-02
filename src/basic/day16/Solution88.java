package basic.day16;

/**
 * <h2>문제 : 수열과 구간 쿼리 3</h2>
 * <p>
 * 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [i, j] 꼴입니다.
 * <p>
 * 각 query마다 순서대로 arr[i]의 값과 arr[j]의 값을 서로 바꿉니다.
 * <p>
 * 위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
 * </p>
 */
public class Solution88 {
    public static void main(String[] args) {
        int[] res = solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 3}, {1, 2}, {1, 4}});
        for (int v : res) {
            System.out.print(v+ " ");
        }
    }

    private static int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        return arr;
    }
}
