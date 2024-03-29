package basic.day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <h2>문제 : 문자열 잘라서 정렬하기</h2>
 * <p>
 * 문자열 myString이 주어집니다. "x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후 사전순으로 정렬한 배열을 return 하는 solution 함수를 완성해 주세요.
 * <p>
 * 단, 빈 문자열은 반환할 배열에 넣지 않습니다.
 * </p>
 */
public class Solution76 {
    public static void main(String[] args) {
        String[] result1 = solution("xaxbxcxdx");
        String[] result2 = solution("dxccxbbbxaaaa");

        for (String s : result1) {
            System.out.print(s + ", ");
        }
        System.out.println();
        for (String s : result2) {
            System.out.print(s + ", ");
        }
    }

    private static String[] solution(String myString) {
        List<String> strList = new ArrayList<>();
        String[] strArr = myString.split("x");

        for (String s : strArr) {
            if (!s.equals("")) strList.add(s); // x부터 시작하면 공백이 들어가므로 공백이 아닌 문자열만 가져온다.
        }
        Collections.sort(strList);

        return strList.toArray(new String[strList.size()]);
    }
}
