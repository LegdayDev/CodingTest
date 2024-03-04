package basic.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <h2>문제 : x 사이의 개수</h2>
 * <p>
 * 문자열 myString이 주어집니다.
 * myString을 문자 "x"를 기준으로 나눴을 때 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
 * </p>
 */
public class Solution57 {
    public static void main(String[] args) {
        solution("oxooxoxxox");
    }

    private static int[] solution(String myString) {
        List<String> strList = new ArrayList<>();

        String str = "";
        for (int i = 0; i < myString.length(); i++) {
            if (i == myString.length() - 1 && myString.charAt(i) == 'x') {
                strList.add("");
            }
            if (myString.charAt(i) != 'x') {
                str += myString.charAt(i);
            } else {
                strList.add(str);
                str = "";
            }
        }
        int[] res = new int[strList.size()];

        int i = 1;
        for (String s : strList) {
            System.out.println((i++) + "번쨰 >>" + s);
        }
        System.out.println(strList.size());
        return null;
    }
}
