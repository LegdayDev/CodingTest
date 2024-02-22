package basic;

/**
 * <h2>문제 : 카운트 업</h2>
 * <li>정수 start_num와 end_num가 주어질 때, start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.</li>
 */
public class Solution16 {
    public static void main(String[] args) {
        int[] solution = solution(3, 10);
        for (int value : solution) {
            System.out.print(value);
        }
    }

    private static int[] solution(int start_num, int end_num) {
        int[] res = new int[end_num - start_num + 1];
        for(int i=0;i<res.length;i++){
            res[i] = start_num++;
        }
        return res;
    }
}
