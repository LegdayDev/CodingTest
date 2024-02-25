package basic.day06;

import java.util.Arrays;

/**
 * <h2>문제 : 뒤에서 5등 위로</h2>
 * <p>
 *     정수로 이루어진 리스트 num_list가 주어집니다. num_list에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 * </p>
 */
public class Solution42 {
    public static void main(String[] args) {
        int[] res = solution(new int[]{12, 4, 15, 46, 38, 1, 14, 56, 32, 10}); // 출력값: 15, 32, 38, 46, 56
        for (int value : res) {
            System.out.print(value + " ");
        }

    }
    private static int[] solution(int[] num_list) {
        int[] array = Arrays.stream(num_list).sorted().toArray();
        int[] resArray = new int[array.length-5];
        for (int i = 0; i < resArray.length; i++) {
            resArray[i] = array[i+5];
        }
        return resArray;
    }
}
