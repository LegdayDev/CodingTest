package basic;

/**
 * <h2>문제 : 문자열의 앞의 n글자</h2>
 * <li>문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string의 앞의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.</li>
 */
public class Solution09 {
    public static void main(String[] args) {
        System.out.println(solution("ProgrammerS123",11));
    }
    private static String solution(String my_string, int n) {
        return my_string.substring(0, n);
    }
}
