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
        int[] res1 = solution("oxooxoxxox");
        int[] res2 = solution("xabcxdefxghi");

        for (int i : res1) {
            System.out.print(i + ",");
        }
        System.out.println();
        for (int i : res2) {
            System.out.print(i + ",");
        }
    }

    private static int[] solution(String myString) {
        String[] splitStr = myString.split("x", -1);

        int[] res = new int[splitStr.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = splitStr[i].length();
        }
        return res;
    }
}
