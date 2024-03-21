package basic.day11;

import java.util.ArrayList;
import java.util.List;

/**
 * <h2>문제 : ad 제거하기</h2>
 * <p>
 * 문자열 배열 strArr가 주어집니다.
 * 배열 내의 문자열 중 "ad"라는 부분 문자열을 포함하고 있는 모든 문자열을 제거하고
 * 남은 문자열을 순서를 유지하여 배열로 return 하는 solution 함수를 완성해 주세요.
 * </p>
 */
public class Solution62 {
    public static void main(String[] args) {
        String[] result1 = solution(new String[]{"and", "notad", "abcd"});
        String[] result2 = solution(new String[]{"there", "are", "no", "a", "ds"});

        for (String s : result1) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : result2) {
            System.out.print(s + " ");
        }
    }

    private static String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].contains("ad")) {
                list.add(strArr[i]);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}
