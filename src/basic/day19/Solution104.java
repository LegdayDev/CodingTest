package basic.day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <h2>문제 : 배열 만들기4</h2>
 * <p>
 * 정수 배열 arr가 주어집니다. arr를 이용해 새로운 배열 stk를 만드려고 합니다.
 * <p>
 * 변수 i를 만들어 초기값을 0으로 설정한 후 i가 arr의 길이보다 작으면 다음 작업을 반복합니다.
 * </p>
 * <ul>
 *     <li>만약 stk가 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다.</li>
 *     <li>stk에 원소가 있고, stk의 마지막 원소가 arr[i]보다 작으면 arr[i]를 stk의 뒤에 추가하고 i에 1을 더합니다.</li>
 *     <li>stk에 원소가 있는데 stk의 마지막 원소가 arr[i]보다 크거나 같으면 stk의 마지막 원소를 stk에서 제거합니다.</li>
 * </ul>
 * <p>위 작업을 마친 후 만들어진 stk를 return 하는 solution 함수를 완성해 주세요.</p>
 */
public class Solution104 {
    public static void main(String[] args) {
        int[] res = solution(new int[]{1, 4, 2, 5, 3});
        System.out.println(Arrays.toString(res));
    }

    private static int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            if (stk.size() == 0) {
                stk.add(arr[i]);
                i++;
            } else if (stk.get(stk.size()-1) < arr[i]) {
                stk.add(arr[i]);
                i++;
            } else if (stk.get(stk.size()-1) >= arr[i]) {
                stk.remove(stk.get(stk.size() - 1));
            }
        }
        return stk.stream().mapToInt(Integer::valueOf).toArray();
    }
}
