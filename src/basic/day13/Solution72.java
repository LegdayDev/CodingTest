package basic.day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <h2>문제 : 접미사 배열</h2>
 * <p>
 * 어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다. 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
 * 문자열 my_string이 매개변수로 주어질 때, my_string의 모든 접미사를 사전순으로 정렬한 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
 * </p>
 */
public class Solution72 {
    public static void main(String[] args) {
        String[] result = solution("banana");

        for (String s : result) {
            System.out.print(s + ", ");
        }
    }

    private static String[] solution(String my_string) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            String temp = "";
            for (int j = i; j < my_string.length(); j++) {
                temp += my_string.charAt(j);
            }
            list.add(temp);
        }
        Collections.sort(list);

        return list.toArray(new String[list.size()]);
    }
}
