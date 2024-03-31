package basic.day15;

/**
 * <h2>문제 : 날짜 비교하기</h2>
 * <p>
 * 정수 배열 date1과 date2가 주어집니다. 두 배열은 각각 날짜를 나타내며 [year, month, day] 꼴로 주어집니다.
 * 각 배열에서 year는 연도를, month는 월을, day는 날짜를 나타냅니다.
 * <p>
 * 만약 date1이 date2보다 앞서는 날짜라면 1을, 아니면 0을 return 하는 solution 함수를 완성해 주세요.
 * </p>
 */
public class Solution82 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2021, 12, 28}, new int[]{2021, 12, 29}));
        System.out.println(solution(new int[]{1024, 10, 24}, new int[]{1024, 10, 24}));
    }

    private static int solution(int[] date1, int[] date2) {
        if (date1[0] < date2[0]) {
            return 1; // 년도가 앞선다면
        }
        else if (date1[0] == date2[0]) { // 년도가 같다면, 월 비교
            if (date1[1] < date2[1]){
                return 1; // 월이 앞선다면
            }
            else if (date1[1] == date2[1]) { // 월이 같다면, 일 비교
                if (date1[2] < date2[2]){
                    return 1;
                }
                else{
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}
