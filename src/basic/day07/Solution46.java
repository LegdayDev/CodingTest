package basic.day07;

/**
 * <h2>문제 : 순서 바꾸기</h2>
 * <p>
 * 정수 리스트 num_list와 정수 n이 주어질 때, num_list를 n 번째 원소 이후의 원소들과 n 번째까지의 원소들로 나눠 n 번째 원소 이후의 원소들을 n 번째까지의 원소들 앞에 붙인 리스트를 return하도록 solution 함수를 완성해주세요.
 * </p>
 */
public class Solution46 {
    public static void main(String[] args) {

    }

    private static int[] solution(int[] num_list, int n) {
        int[] leftArr = new int[n];
        int[] rightArr = new int[num_list.length - n];
        int[] res = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            if(i<=n-1) leftArr[i] = num_list[i];
            else if(i>=n-1) rightArr[i] = num_list[i];
        }

        for (int i = 0; i < num_list.length; i++) {
            res[i] = rightArr[i];
        }
        return null;
    }
}
