package basic.day16;

import java.util.ArrayList;
import java.util.List;

/**
 * <h2>문제 : 빈 배열에 추가, 삭제하기</h2>
 * <p>
 * 아무 원소도 들어있지 않은 빈 배열 X가 있습니다.
 * <p>
 * 길이가 같은 정수 배열 arr과 boolean 배열 flag가 매개변수로 주어질 때,
 * <p>
 * flag를 차례대로 순회하며 flag[i]가 true라면 X의 뒤에 arr[i]를 arr[i] × 2 번 추가하고,
 * <p>
 * flag[i]가 false라면 X에서 마지막 arr[i]개의 원소를 제거한 뒤 X를 return 하는 solution 함수를 작성해 주세요.
 * </p>
 */
public class Solution86 {
    public static void main(String[] args) {
        int[] res = solution(new int[]{3, 2, 4, 1, 3}, new boolean[]{true, false, true, false, false});
        for (int v : res) {
            System.out.print(v + " ");
        }
    }

    private static int[] solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int lastIdx = list.size() - 1;
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    list.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    list.remove(lastIdx);
                    lastIdx -= 1;
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
