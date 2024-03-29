package basic.day14;

/**
 * <h2>문제 : 등차수열의 특정한 항만 더하기</h2>
 * <p>
 * 두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다. 첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때,
 * <p>이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return 하는 solution 함수를 작성해 주세요.
 * </p>
 */
public class Solution79 {
    public static void main(String[] args) {
        System.out.println(solution(3, 4, new boolean[]{true, false, false, true, true}));
        System.out.println(solution(7,1, new boolean[]{false, false, false, true, false, false, false}));
    }

    private static int solution(int a, int d, boolean[] included) {
        int total = 0;
        int arr[] = new int[included.length];
        arr[0] = a;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + d;
        }
        for (int i = 0; i < included.length; i++) {
            if (included[i]) total+=arr[i];
        }
        return total;
    }
}
