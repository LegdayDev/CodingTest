package basic.day16;

import java.util.ArrayList;
import java.util.List;

/**
 * <h2>문제 : 배열 만들기 5</h2>
 * <p>
 * 문자열 배열 intStrs와 정수 k, s, l가 주어집니다. intStrs의 원소는 숫자로 이루어져 있습니다.
 * <p>
 * 배열 intStrs의 각 원소마다 s번 인덱스에서 시작하는 길이 l짜리 부분 문자열을 잘라내 정수로 변환합니다.
 * <p>
 * 이때 변환한 정수값이 k보다 큰 값들을 담은 배열을 return 하는 solution 함수를 완성해 주세요.
 * </p>
 */
public class Solution85 {
    public static void main(String[] args) {
        int[] res = solution(new String[]{"0123456789", "9876543210", "9999999999999"}, 50000, 5, 5);
        for (int v : res) {
            System.out.print(v+ " ");
        }
    }

    private static int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for (String str : intStrs) {
            String sliceStr = "";
            for (int i = s; i < (s+l); i++) {
                sliceStr += str.charAt(i);
            }
            int value = Integer.parseInt(sliceStr);
            if(value >k) list.add(value);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
