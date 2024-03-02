package basic.day09;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <h2>문제 : 배열의 원소 삭제하기</h2>
 * <p>
 * 정수 배열 arr과 delete_list가 있습니다.
 * arr의 원소 중 delete_list의 원소를 모두 삭제하고 남은 원소들은 기존의 arr에 있던 순서를 유지한 배열을 return 하는 solution 함수를 작성해 주세요.
 * </p>
 */
public class Solution53 {
    public static void main(String[] args) {
        int[] res1 = solution(new int[]{293, 1000, 395, 678, 94}, new int[]{94, 777, 104, 1000, 1, 12});
        int[] res2 = solution(new int[]{110, 66, 439, 785, 1}, new int[]{377, 823, 119, 43});

        for (int i : res1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : res2) {
            System.out.print(i + " ");
        }
    }

    private static int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for (int i = 0; i < delete_list.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == delete_list[i]) list.remove(j);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}

