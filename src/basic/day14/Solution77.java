package basic.day14;

/**
 * <h2>문제 : 9로 나눈 나머지</h2>
 * <p>
 * 음이 아닌 정수를 9로 나눈 나머지는 그 정수의 각 자리 숫자의 합을 9로 나눈 나머지와 같은 것이 알려져 있습니다.
 * <p>이 사실을 이용하여 음이 아닌 정수가 문자열 number로 주어질 때, 이 정수를 9로 나눈 나머지를 return 하는 solution 함수를 작성해주세요.
 * </p>
 */
public class Solution77 {
    public static void main(String[] args) {
        System.out.println(solution("123"));
        System.out.println(solution("78720646226947352489"));
    }

    private static int solution(String number) {
        int total = 0;
        for (int i = 0; i < number.length(); i++) {
            total += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        return total%9;
    }
}
