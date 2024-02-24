package basic.day05;

/**
 * <h2>문제 : 원소들의 곱과 합</h2>
 * <p>정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.</p>
 */
public class Solution29 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 4, 5, 2, 1}));
        System.out.println(solution(new int[]{5, 7, 8, 3}));
    }

    private static int solution(int[] num_list) {
        int valueOfPlus = 0;
        int valueOfMul = 1;

        for (int value : num_list) {
            valueOfPlus += value;
            valueOfMul *= value;
        }
        if (valueOfPlus * valueOfPlus > valueOfMul) return 1;
        else return 0;
    }
}
