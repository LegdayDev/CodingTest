package basic.day17;

/**
 * <h2>문제 : 문자열이 몇 번 등장하는지 세기</h2>
 * <p>
 * 문자열 myString과 pat이 주어집니다. myString에서 pat이 등장하는 횟수를 return 하는 solution 함수를 완성해 주세요.
 * </p>
 */
public class Solution90 {
    public static void main(String[] args) {
        System.out.println(solution("banana", "ana"));
        System.out.println(solution("aaaa", "aa"));
    }

    private static int solution(String myString, String pat) {
        int count = 0;
        for (int i = 0; i < myString.length() - pat.length() + 1; i++) {
            if (myString.substring(i, i + pat.length()).contains(pat))
                count++;
        }
        return count;
    }
}
