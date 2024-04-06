package basic.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <h2>문제 : 세 개의 구분자</h2>
 * <p>
 * 임의의 문자열이 주어졌을 때 문자 "a", "b", "c"를 구분자로 사용해 문자열을 나누고자 합니다.
 * <p>
 * 예를 들어 주어진 문자열이 "baconlettucetomato"라면 나눠진 문자열 목록은 ["onlettu", "etom", "to"] 가 됩니다.
 * <p>
 * 문자열 myStr이 주어졌을 때 위 예시와 같이 "a", "b", "c"를 사용해 나눠진 문자열을 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
 * <p>
 * 단, 두 구분자 사이에 다른 문자가 없을 경우에는 아무것도 저장하지 않으며, return할 배열이 빈 배열이라면 ["EMPTY"]를 return 합니다.
 * </p>
 */
public class Solution94 {
    public static void main(String[] args) {
        String[] res1 = solution("baconlettucetomato");
        String[] res2 = solution("abcd");
        String[] res3 = solution("cabab");
        System.out.println(Arrays.toString(res1));
        System.out.println(Arrays.toString(res2));
        System.out.println(Arrays.toString(res3));
    }

    private static String[] solution(String myStr) {
        String test = myStr.replace("a", " ").replace("b", " ").replace("c", " ");
        String[] testArr = test.split(" ");

        List<String> list = new ArrayList<>();
        for (int i = 0; i < testArr.length; i++) {
            if (!testArr[i].isEmpty()) {
                list.add(testArr[i]);
            }
        }
        if (list.size() == 0) {
            list.add("EMPTY");
        }

        return list.toArray(new String[list.size()]);
    }
}
