package basic.day11;

/**
 * <h2>문제 : 홀수 vs 짝수</h2>
 * <p>
 * 정수 리스트 num_list가 주어집니다. 가장 첫 번째 원소를 1번 원소라고 할 때,
 * 홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 return 하도록 solution 함수를 완성해주세요. 두 값이 같을 경우 그 값을 return합니다.
 * </p>
 */
public class Solution60 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 2, 6, 1, 7, 6}));
        System.out.println(solution(new int[]{-1, 2, 5, 6, 3}));
    }

    private static int solution(int[] num_list) {
        int oddSum = 0; // 홀수
        int evenSum = 0; // 짝수
        for (int i = 0; i < num_list.length; i++) {
            if(i%2==0) evenSum+=num_list[i];
            else oddSum+=num_list[i];
        }
        return evenSum >= oddSum ? evenSum : oddSum;
    }
}
