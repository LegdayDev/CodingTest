package basic.day01;

/**
 * <h2>문제 : 대문자로 바꾸기</h2>
 * <li>알파벳으로 이루어진 문자열 myString이 주어집니다. 모든 알파벳을 대문자로 변환하여 return 하는 solution 함수를 완성해 주세요.</li>
 */
public class Solution08 {
    public static void main(String[] args) {
        System.out.println(solution("myString"));
    }
    private static String solution(String myString) {
        return myString.toUpperCase();
    }
}
