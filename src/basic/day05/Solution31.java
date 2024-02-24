package basic.day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <h2>문제 : 배열 만들기 1</h2>
 * <p>정수 n과 k가 주어졌을 때, 1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.</p>
 */
public class Solution31 {
    public static void main(String[] args) {
        int[] res1 = solution(10, 3);
        int[] res2 = solution(15, 5);
        for (int value : res1) {
            System.out.print(value + " ");
        }
        System.out.println();
        for (int value : res2) {
            System.out.print(value + " ");
        }
    }

    private static int[] solution(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % k == 0) list.add(i);
        }
        return Arrays.stream(list.toArray(new Integer[list.size()])).mapToInt(Integer::intValue).toArray();
    }
}
