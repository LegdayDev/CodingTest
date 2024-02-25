package basic.day06;


/**
 * <h2>문제 : 글자 이어 붙여 문자열 만들기</h2>
 * <p>
 *     문자열 my_string과 정수 배열 index_list가 매개변수로 주어집니다. my_string의 index_list의 원소들에 해당하는 인덱스의 글자들을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
 * </p>
 */
public class Solution40 {
    public static void main(String[] args) {
        System.out.println(solution("cvsgiorszzzmrpaqpe",new int[]{16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7}));
        System.out.println(solution("zpiaz",new int[]{1, 2, 0, 0, 3}));
    }
    private static String solution(String my_string, int[] index_list){
        String empty="";
        for (int i = 0; i < index_list.length ; i++) {
            empty+=my_string.charAt(index_list[i]);
        }
        return empty;
    }
}
