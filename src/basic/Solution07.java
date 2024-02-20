package basic;

/**
 * <H2>문제 : 정수 부분</H2>
 * <li>실수 flo가 매개 변수로 주어질 때, flo의 정수 부분을 return하도록 solution 함수를 완성해주세요.</li>
 */
public class Solution07 {
    public static void main(String[] args) {
        System.out.println(solution(2.1532));
    }
    private static int solution(double flo) {
        return (int)flo;
    }
}
