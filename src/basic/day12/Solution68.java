package basic.day12;

/**
 * <h2>문제 : 특별한 이차원 배열1</h2>
 * <p>
 * 정수 n이 매개변수로 주어질 때, 다음과 같은 n × n 크기의 이차원 배열 arr를 return 하는 solution 함수를 작성해 주세요.
 * </p>
 */
public class Solution68 {
    public static void main(String[] args) {
        int[][] result1 = solution(3);

        for (int i = 0; i < result1.length; i++) {
            for (int j = 0; j < result1[i].length; j++) {
                System.out.print(result1[i][j]+", ");
            }
            System.out.println();
        }
    }

    private static int[][] solution(int n) {
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) arr[i][j] = 1;
                else arr[i][j] = 0;
            }
        }
        return arr;
    }
}
