package basic.day03;

/**
 * <h2>문제 : 뒤에서 5등까지</h2>
 * <p>정수로 이루어진 리스트 num_list가 주어집니다. num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.</p>
 */
public class Solution21 {
    public static void main(String[] args) {
        int[] res = solution(new int[]{12, 4, 15, 46, 38, 1, 14});

        for (int value : res) {
            System.out.print(value + " ");
        }
    }

    private static int[] solution(int[] num_list) {
        for (int i = 0; i < num_list.length; i++) {
            for (int j = i; j < num_list.length; j++) {
                if (num_list[i] > num_list[j]) {
                    int temp = num_list[i];
                    num_list[i]=num_list[j];
                    num_list[j]=temp;
                }
            }
        }
        int[] res = new int[5];
        System.arraycopy(num_list,0,res,0,5);
        return res;
    }
}
