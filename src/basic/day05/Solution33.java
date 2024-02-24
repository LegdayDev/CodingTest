package basic.day05;

/**
 * <h2>문제 : 접미사인지 확인하기</h2>
 * <p>어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다. 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.</p>
 * <p>문자열 my_string과 is_suffix가 주어질 때, is_suffix가 my_string의 접미사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.</p>
 */
public class Solution33 {
    public static void main(String[] args) {
        System.out.println(solution("banana", "ana"));
        System.out.println(solution("banana", "nan"));
        System.out.println(solution("banana", "wxyz"));
        System.out.println(solution("banana", "abanana"));
    }

    private static int solution(String my_string, String is_suffix) {
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.substring(i, my_string.length()).equals(is_suffix)) return 1;
        }
        return 0;
    }
}
