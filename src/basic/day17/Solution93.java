package basic.day17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <h2>문제 : 배열의 길이를 2의 거듭제곱으로 만들기</h2>
 * <p>
 * 정수 배열 arr이 매개변수로 주어집니다. arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가하려고 합니다.
 * <p>
 * arr에 최소한의 개수로 0을 추가한 배열을 return 하는 solution 함수를 작성해 주세요.
 * </p>
 */
public class Solution93 {
    public static void main(String[] args) {
        int[] res1 = solution(new int[]{1, 2, 3, 4, 5, 6});// 6 -> 8 / 16 / 32 ...
        int[] res2 = solution(new int[]{58, 172, 746, 89});

        for (int v : res1) {
            System.out.print(v + ", ");
        }
        System.out.println();
        for (int v : res2) {
            System.out.print(v + ", ");
        }
    }

    // TODO : 테스트22에서 실패로 뜬다.(정확성95.5) 추후 해결
    private static int[] solution(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int len = arr.length;
        int count = 0;
        int num = 2;
        while (true) {
            if (num > 1024) break;
            if (len <= num) {
                count = num - len;
                break;
            }
            num *= 2;
        }
        for (int i = 0; i < count; i++) {
            list.add(0);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
