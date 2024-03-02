package basic.day08;

import java.util.ArrayList;
import java.util.List;

/**
 * <h2>문제 : n개 간격의 원소들</h2>
 * <p>
 * 정수 리스트 num_list와 정수 n이 주어질 때, num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 저장되어있는 원소들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 * </p>
 */
public class Solution49 {
    public static void main(String[] args) {
        int[] res1 = solution(new int[]{4, 2, 6, 1, 7, 6}, 2);
        int[] res2 = solution(new int[]{4, 2, 6, 1, 7, 6}, 4);

        for (int value : res1) {
            System.out.print(value + " ");
        }
        System.out.println();
        for (int value : res2) {
            System.out.print(value + " ");
        }
    }

    private static int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num_list.length; i += n) {
            list.add(num_list[i]);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
