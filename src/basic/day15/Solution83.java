package basic.day15;

/**
 * <h2>문제 : 수열과 구간 쿼리 1</h2>
 * <p>
 * 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e] 꼴입니다.
 * <p>
 * 각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 arr[i]에 1을 더합니다.
 * <p>
 * 위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
 * </p>
 */
public class Solution83 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 1}, {1, 2}, {2, 3}});
        for (int v : result) {
            System.out.print(v+" ");
        }
    }

    private static int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                arr[j] += 1;
            }
        }
        return arr;
    }
}
