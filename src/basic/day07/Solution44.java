package basic.day07;

/**
 * <h2>문제 : 카운트 다운</h2>
 * <p>
 * 정수 start_num와 end_num가 주어질 때, start_num에서 end_num까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 * </p>
 */
public class Solution44 {
    public static void main(String[] args) {
        int[] res = solution(10, 3);
        for (int value : res) {
            System.out.print(value + " ");
        }
    }

    private static int[] solution(int start, int end_num) {
        int[] answer = new int[start - end_num + 1];
        for (int i = 0; i < start - end_num + 1; i++) {
            answer[i] = start - i;
        }
        return answer;
    }
}
