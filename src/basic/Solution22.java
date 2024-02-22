package basic;

/**
 * <h2>문제 : 조건에 맞게 수열 변환하기 3</h2>
 * <p>정수 배열 arr와 자연수 k가 주어집니다.
 * <p>
 * 만약 k가 홀수라면 arr의 모든 원소에 k를 곱하고, k가 짝수라면 arr의 모든 원소에 k를 더합니다.
 * <p>
 * 이러한 변환을 마친 후의 arr를 return 하는 solution 함수를 완성해 주세요.</p>
 */
public class Solution22 {
    public static void main(String[] args) {
        int[] res1 = solution(new int[]{1, 2, 3, 100, 99, 98}, 3);
        int[] res2 = solution(new int[]{1, 2, 3, 100, 99, 98}, 2);

        for (int value : res1) {
            System.out.print(value + " ");
        }
        System.out.println();
        for (int value : res2) {
            System.out.print(value + " ");
        }
    }

    private static int[] solution(int[] arr, int k) {
        if (k % 2 == 1) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] *= k;
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                arr[i] += k;
            }
        }
        return arr;
    }
}
