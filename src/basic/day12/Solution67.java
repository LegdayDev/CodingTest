package basic.day12;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * <h2>문제 : 문자 리스트를 문자열로 변환하기</h2>
 * <p>
 * 문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
 * </p>
 */
public class Solution67 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"a", "b", "c"}));
    }

    private static String solution(String[] arr) {
        String result = "";
        for (String s : arr) {
            result += s;
        }
        return result;
    }
}
