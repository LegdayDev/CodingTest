package basic.day04;

/**
 * <h2>문제 : 두 수의 연산값 비교하기</h2>
 * <p>연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.</p>
 * <li>12 ⊕ 3 = 123</li>
 * <li>3 ⊕ 12 = 312</li>
 * <p>양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.</p>
 * 단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.
 */
public class Solution24 {
    public static void main(String[] args) {
        System.out.println(solution(2, 91));
        System.out.println(solution(91, 2));
    }

    private static int solution(int a, int b) {
        return (Integer.parseInt(a + "" + b)) >= (2 * a * b) ? (Integer.parseInt(a + "" + b)) : 2 * a * b;
    }
}
