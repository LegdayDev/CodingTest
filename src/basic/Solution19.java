package basic;

/**
 * <h2>문제 : 수 조작하기 1</h2>
 * <p>정수 n과 문자열 control이 주어집니다. control은 "w", "a", "s", "d"의 4개의 문자로 이루어져 있으며, control의 앞에서부터 순서대로 문자에 따라 n의 값을 바꿉니다.</p>
 * <ul>
 * <li>"w" : n이 1 커집니다.</li>
 * <li>"s" : n이 1 작아집니다.</li>
 * <li>"d" : n이 10 커집니다.</li>
 * <li>"a" : n이 10 작아집니다.</li>
 * </ul>
 * <p>위 규칙에 따라 n을 바꿨을 때 가장 마지막에 나오는 n의 값을 return 하는 solution 함수를 완성해 주세요.</p>
 */
public class Solution19 {
    public static void main(String[] args) {
        System.out.println(solution(0, "wsdawsdassw"));
    }

    private static int solution(int n, String control) {
        for (int i = 0; i < control.length(); i++) {
            if (control.charAt(i) == 'w') n++;
            else if (control.charAt(i) == 's') n--;
            else if (control.charAt(i) == 'd') n += 10;
            else if (control.charAt(i) == 'a') n -= 10;
        }

        /**
         * 다른 사람 풀이 : String.toCharArray() 각 문자를 배열로 바꾼다.
         for(char ch : control.toCharArray()) {
         switch(ch) {
         case 'w': answer += 1; break;
         case 's': answer -= 1; break;
         case 'd': answer += 10; break;
         case 'a': answer -= 10; break;
         default:break;
         }
         }
         */
        return n;
    }
}
