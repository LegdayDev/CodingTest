package basic;

/**
 * <h2>문제 : 정수 찾기</h2>
 * <li>정수 리스트 num_list와 찾으려는 정수 n이 주어질 때, num_list안에 n이 있으면 1을 없으면 0을 return하도록 solution 함수를 완성해주세요.</li>
 */
public class Solution13 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}, 3));
        System.out.println(solution(new int[]{15, 98, 23, 2, 15}, 20));
    }

    private static int solution(int[] num_list, int n) {
        for (int value : num_list) {
            if (value == n) return 1;
        }
        return 0;
    }
}
