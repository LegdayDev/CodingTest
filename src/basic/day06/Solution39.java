package basic.day06;

import java.util.ArrayList;
import java.util.List;

/**
 * <h2>문제 : 배열의 원소만큼 추가하기</h2>
 * <p>
 *     아무 원소도 들어있지 않은 빈 배열 X가 있습니다. 양의 정수 배열 arr가 매개변수로 주어질 때, arr의 앞에서부터 차례대로 원소를 보면서 원소가 a라면 X의 맨 뒤에 a를 a번 추가하는 일을 반복한 뒤의 배열 X를 return 하는 solution 함수를 작성해 주세요.
 * </p>
 */
public class Solution39 {
    public static void main(String[] args) {
        int[] res1 = solution(new int[]{5, 1, 4});
        int[] res2 = solution(new int[]{6,6});
        int[] res3 = solution(new int[]{1});

        for (int value : res1) {
            System.out.print(value+" ");
        }
        System.out.println();
        for (int value : res2) {
            System.out.print(value+" ");
        }
        System.out.println();
        for (int value : res3) {
            System.out.print(value+" ");
        }
        System.out.println();
    }
    private static int[] solution(int[] arr) {
        List<Integer> integerArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                integerArr.add(arr[i]);
            }
        }
        return integerArr.stream().mapToInt(Integer::intValue).toArray();
    }
}
