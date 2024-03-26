package basic.day13;

/**
 * <h2>문제 : 간단한 식 계산하기</h2>
 * <p>
 * 문자열 binomial이 매개변수로 주어집니다.
 * binomial은 "a op b" 형태의 이항식이고 a와 b는 음이 아닌 정수, op는 '+', '-', '*' 중 하나입니다.
 * 주어진 식을 계산한 정수를 return 하는 solution 함수를 작성해 주세요.
 * </p>
 */
public class Solution70 {
    public static void main(String[] args) {
        System.out.println(solution("43 + 12"));
        System.out.println(solution("0 - 7777"));
        System.out.println(solution("40000 * 40000"));
    }

    private static int solution(String binomial) {
        int result = 0;
        String[] inputStr = binomial.split(" ");
        int a = Integer.parseInt(inputStr[0]);
        int b = Integer.parseInt(inputStr[2]);

        switch (inputStr[1]) {
            case "+" -> result = a + b;
            case "-" -> result = a - b;
            case "*" -> result = a * b;
            case "/" -> result = a / b;
        }

        return result;
    }
}
