package basic.day11;

/**
 * <h2>문제 : 특별한 이차원 배열 2</h2>
 * <p>
 * n × n 크기의 이차원 배열 arr이 매개변수로 주어질 때,
 * arr이 다음을 만족하면 1을 아니라면 0을 return 하는 solution 함수를 작성해 주세요.
 * </p>
 */
public class Solution64 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{5, 192, 33}, {192, 72, 95}, {33, 95, 999}})); // 3 X 3 배열
        System.out.println(solution(new int[][]{{19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723}, {587, 754, 723, 81}})); // 4 X 4 배열
    }

    private static int solution(int[][] arr) {
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == arr[j][i]) check=true;
                else {
                    check = false;
                    break;
                }
            }
            if(!check) break;
        }
        if(check){
            return 1;
        }else{
            return 0;
        }
    }
}
