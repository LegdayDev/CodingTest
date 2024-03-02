package basic.day08;

import java.util.ArrayList;
import java.util.List;

/**
 * <h2>문제 : 할 일 목록</h2>
 * <p>
 * 오늘 해야 할 일이 담긴 문자열 배열 todo_list와 각각의 일을 지금 마쳤는지를 나타내는 boolean 배열 finished가 매개변수로 주어질 때, todo_list에서 아직 마치지 못한 일들을 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
 * </p>
 */
public class Solution50 {
    public static void main(String[] args) {
        String[] res = solution(new String[]{"problemsolving", "practiceguitar", "swim", "studygraph"}, new boolean[]{true, false, true, false});
        for (String str : res) {
            System.out.print(str+" ");
        }
    }

    private static String[] solution(String[] todo_list, boolean[] finished) {
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) strList.add(todo_list[i]);
        }
        return strList.toArray(new String[strList.size()]);
    }
}
