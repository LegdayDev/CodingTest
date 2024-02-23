package basic.day04;

/**
 * <h2>문제 : 마지막 두 원소</h2>
 * <p>정수 리스트 num_list가 주어질 때, 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.</p>
 */
public class Solution27 {
    public static void main(String[] args) {
        int[] res1 = solution(new int[]{2, 1, 6});
        for (int value : res1) {
            System.out.print(value+" ");
        }
        System.out.println();
        int[] res2 = solution(new int[]{5, 2, 1, 7, 5});
        for (int value : res2) {
            System.out.print(value+" ");
        }
    }

    private static int[] solution(int[] num_list) {
        int lastSize = num_list.length;
        int[] res = new int[lastSize + 1];

        for (int i = 0; i < lastSize; i++) {
            res[i] = num_list[i];
        }
        res[lastSize] = num_list[lastSize - 1] > num_list[lastSize - 2] ? num_list[lastSize - 1] - num_list[lastSize - 2] : num_list[lastSize - 1] * 2;
        return res;
    }
}
