package basic.day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <h2>문제 : 2의 영역</h2>
 * <p>
 * 정수 배열 arr가 주어집니다. 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 return 하는 solution 함수를 완성해 주세요.
 * <p>
 * 단, arr에 2가 없는 경우 [-1]을 return 합니다.
 * </p>
 */
public class Solution96 {
    public static void main(String[] args) {
        solution(new int[]{1, 2, 1, 4, 5, 2, 9});
        solution(new int[]{1, 2, 1});
        solution(new int[]{1, 1});
        solution(new int[]{1, 2, 1, 2, 1, 10, 2, 1});
    }

    private static int[] solution(int[] arr) {
        List<Integer> checkList = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) checkList.add(i);
        }
        if(checkList.size()==0) return new int[]{-1};

        Collections.reverse(checkList);
        int max = checkList.get(0);
        int min = checkList.get(0);
        for (int i = 0; i < checkList.size(); i++) {
            max = Math.max(max, checkList.get(i));
            min = Math.min(min, checkList.get(i));
        }
        for (int i = min; i <= max; i++) {
            resultList.add(arr[i]);
        }
        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
}
