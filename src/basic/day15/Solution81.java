package basic.day15;

/**
 * <h2>문제 : 이차원 배열 대각선 순회하기</h2>
 * <p>
 * 2차원 정수 배열 board와 정수 k가 주어집니다.
 * <p>
 * i + j <= k를 만족하는 모든 (i, j)에 대한 board[i][j]의 합을 return 하는 solution 함수를 완성해 주세요.
 * </p>
 */
public class Solution81 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{0, 1, 2}, {1, 2, 3}, {2, 3, 4}, {3, 4, 5}}, 2));
    }

    private static int solution(int[][] board, int k) {
        int total = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if ((i + j) <= k) {
                    total += board[i][j];
                }
            }
        }
        return total;
    }
}
