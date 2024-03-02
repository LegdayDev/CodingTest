package basic.day09;

/**
 * <h2>문제 : 문자열 바꿔서 찾기</h2>
 * <p>
 * 문자 "A"와 "B"로 이루어진 문자열 myString과 pat가 주어집니다.
 * myString의 "A"를 "B"로, "B"를 "A"로 바꾼 문자열의 연속하는 부분 문자열 중 pat이 있으면 1을 아니면 0을 return 하는 solution 함수를 완성하세요.
 * </p>
 */
public class Solution52 {
    public static void main(String[] args) {
        System.out.println(solution("ABBAA","AABB"));
        System.out.println(solution("ABAB","ABAB"));
    }

    private static int solution(String myString, String pat) {
        char[] charArray = myString.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'A') charArray[i] = 'B';
            else if (charArray[i] == 'B') charArray[i] = 'A';
        }
        myString = String.valueOf(charArray);
        if(myString.contains(pat)) return 1;
        else return 0;

        /**
         * <h3>베스트 방법</h3>
         * myString.replace("A","a").replace("B","A").replace("a","B");
         * swap 방식과 비슷하다
         */
    }
}
