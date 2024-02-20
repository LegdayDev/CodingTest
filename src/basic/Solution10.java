package basic;

/**
 * <h2>문제 : 길이에 따른 연산</h2>
 * <li>정수가 담긴 리스트 num_list가 주어질 때, 리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을 10 이하이면 모든 원소의 곱을 return하도록 solution 함수를 완성해주세요.</li>
 */
public class Solution10 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1}));
        System.out.println(solution(new int[]{2, 3, 4, 5}));
    }

    private static int solution(int[] num_list) {
        int result;
        if (num_list.length > 10) {
            result = 0;
            for (int value : num_list) {
                result += value;
            }
        } else {
            result = 1;
            for (int value : num_list) {
                result *= value;
            }
        }
        return result;
    }
}
