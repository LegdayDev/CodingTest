package basic.day14;


/**
 * <h2>문제 : 주사위 게임2</h2>
 * <p>
 * 1부터 6까지 숫자가 적힌 주사위가 세 개 있습니다. 세 주사위를 굴렸을 때 나온 숫자를 각각 a, b, c라고 했을 때 얻는 점수는 다음과 같습니다.
 *
 * <li>세 숫자가 모두 다르다면 a + b + c 점을 얻습니다.</li>
 * <li>세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면 (a + b + c) × (a2 + b2 + c2 )점을 얻습니다.</li>
 * <li>세 숫자가 모두 같다면 (a + b + c) × (a2 + b2 + c2 ) × (a3 + b3 + c3 )점을 얻습니다.</li>
 *
 * <p>세 정수 a, b, c가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
 * </p>
 */
public class Solution75 {
    public static void main(String[] args) {
        System.out.println(solution(2, 6, 1));
        System.out.println(solution(5, 3, 3));
        System.out.println(solution(4, 4, 4));
    }

    private static int solution(int a, int b, int c) {
        if (a == b && b == c) {
            return (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        } else if ((a == b && b != c) || (b == c && a != b) || (a == c && a != b))
            return (a + b + c) * (a * a + b * b + c * c);
        else return a + b + c;
    }
}
