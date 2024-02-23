package basic.day01;

/**
 * <h2>문제 : flag에 따라 다른 값 반환하기</h2>
 * <li>두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때, flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.</li>
 */
public class Solution06 {
    public static void main(String[] args) {
        System.out.println(solution(2,4,true));
    }

    public static int solution(int a, int b, boolean flag) {
        if(flag) return a+b;
        else return a-b;
    }
}
