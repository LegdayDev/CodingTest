package basic.day18;

/**
 * <h2>문제 : 문자열 묶기</h2>
 * <p>
 * 문자열 배열 strArr이 주어집니다.
 * <p>
 * strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 가장 개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.
 * </p>
 */
public class Solution95 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"a", "bc", "d", "efg", "hi"}));
    }

    private static int solution(String[] strArr) {
        int[] groupCount = new int[30]; // 원소의 길이가 1부터 30 까지의 숫자를 그룹으로 묶었을 때 카운팅하여 추가
        int maxCount = 0;

        for (int i = 0; i < strArr.length; i++) {
            groupCount[strArr[i].length()-1] += 1;
        }
        for (int i : groupCount) {
            if(i!=0){
                if(maxCount<=i) maxCount=i;
            }
        }
        return maxCount;
    }
}
