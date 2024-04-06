package basic.day17;

/**
 * <h2>문제 : 간단한 논리 연산</h2>
 * <p>
 * boolean 변수 x1, x2, x3, x4가 매개변수로 주어질 때, 다음의 식의 true/false를 return 하는 solution 함수를 작성해 주세요.
 * </p>
 * <li>
 * (x1 ∨ x2) ∧ (x3 ∨ x4)
 * </li>
 */
public class Solution92 {
    public static void main(String[] args) {
        System.out.println(solution(true, true, true, true));
        System.out.println(solution(true, false, false, false));
    }

    private static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        // (x1,x2) , (x3,x4)-> OR 연산, 각 연산결과 끼리 AND 연산
        if ((x1 || x2) && (x3 || x4)) return true;
        else return false;
    }
}
