package basic.day09;

import java.util.ArrayList;
import java.util.List;

/**
 * <h2>문제 : 공백으로 구분하기2</h2>
 * <p>
 * 단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때, my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
 * </p>
 */
public class Solution51 {
    public static void main(String[] args) {
        String[] res1 = solution(" i    love  you");
        String[] res2 = solution("    programmers  ");

        for (String s : res1) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : res2) {
            System.out.print(s + " ");
        }
    }

    private static String[] solution(String my_string) {
        return my_string.trim().split("\\s+");
    }
}
