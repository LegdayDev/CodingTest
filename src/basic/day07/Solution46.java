package basic.day07;

import java.util.ArrayList;
import java.util.List;

/**
 * <h2>문제 : 순서 바꾸기</h2>
 * <p>
 * 정수 리스트 num_list와 정수 n이 주어질 때, num_list를 n 번째 원소 이후의 원소들과 n 번째까지의 원소들로 나눠 n 번째 원소 이후의 원소들을 n 번째까지의 원소들 앞에 붙인 리스트를 return하도록 solution 함수를 완성해주세요.
 * </p>
 */
public class Solution46 {
    public static void main(String[] args) {
        int[] res1 = solution(new int[]{2, 1, 6}, 1);// [1, 6, 2]
        int[] res2 = solution(new int[]{5, 2, 1, 7, 5}, 3);// [7, 5, 5, 2, 1]

        for (int v : res1) {
            System.out.print(v + " ");
        }
        System.out.println();
        for (int v : res2) {
            System.out.print(v + " ");
        }
    }

    private static int[] solution(int[] num_list, int n) {
        List<Integer> intArray = new ArrayList<>();

        for (int i = n; i < num_list.length; i++) {
            intArray.add(num_list[i]);
        }
        for (int i = 0; i < n; i++) {
            intArray.add(num_list[i]);
        }
        return intArray.stream().mapToInt(i -> i).toArray();
    }
}
