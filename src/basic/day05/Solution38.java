package basic.day05;

/**
 * <h2>문제 : 배열 비교하기</h2>
 * <p>이 문제에서 두 정수 배열의 대소관계를 다음과 같이 정의합니다.</p>
 * <ul>
 *     <li>두 배열의 길이가 다르다면, 배열의 길이가 긴 쪽이 더 큽니다.</li>
 *     <li>배열의 길이가 같다면 각 배열에 있는 모든 원소의 합을 비교하여 다르다면 더 큰 쪽이 크고, 같다면 같습니다.</li>
 * </ul>
 * <p>두 정수 배열 arr1과 arr2가 주어질 때, 위에서 정의한 배열의 대소관계에 대하여 arr2가 크다면 -1, arr1이 크다면 1, 두 배열이 같다면 0을 return 하는 solution 함수를 작성해 주세요.</p>
 */
public class Solution38 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{49, 13}, new int[]{70, 11, 2}));
        System.out.println(solution(new int[]{100, 17, 84, 1}, new int[]{55, 12, 65, 36}));
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}, new int[]{3, 3, 3, 3, 3}));
    }

    private static int solution(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            if (arr1.length > arr2.length) return 1;
            else return -1;
        } else {
            int totalOfArr1 = 0;
            int totalOfArr2 = 0;
            for (int value : arr1) {
                totalOfArr1 += value;
            }
            for (int value : arr2) {
                totalOfArr2 += value;
            }
            if(totalOfArr1>totalOfArr2) return 1;
            else if(totalOfArr1<totalOfArr2) return -1;
            else return 0;
        }
    }
}
