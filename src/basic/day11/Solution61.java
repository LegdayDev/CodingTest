package basic.day11;

/**
 * <h2>문제 : 0 떼기</h2>
 * <p>
 * 정수로 이루어진 문자열 n_str이 주어질 때, n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return하도록 solution 함수를 완성해주세요.
 * </p>
 */
public class Solution61 {
    public static void main(String[] args) {
        System.out.println(solution("0010"));
        System.out.println(solution("854020"));
    }

    private static String solution(String n_str) {
        String result = "";
        boolean check = true;
        for (int i = 0; i < n_str.length(); i++) {
            if (i != 0 && n_str.charAt(0) != '0') {
                result = n_str;
                break;
            } else {
                if (n_str.charAt(i) == '0' && check) {
                    result += "";
                } else {
                    result += n_str.charAt(i);
                    check = false;
                }
            }
        }
        return result;
        /**
         * return ""+Integer.parseInt(n_str)
         * parseInt() 를 하면 앞에 0은 없어지고 숫자로 되고 문자열과 + 연산이 되므로 전체가 문자열로 반환
         */
    }
}


