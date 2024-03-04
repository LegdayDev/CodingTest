package basic.day10;

/**
 * <h2>문제 : A 강조하기</h2>
 * <p>
 * 문자열 myString이 주어집니다.
 * myString에서 알파벳 "a"가 등장하면 전부 "A"로 변환하고, "A"가 아닌 모든 대문자 알파벳은 소문자 알파벳으로 변환하여 return 하는 solution 함수를 완성하세요.
 * </p>
 */
public class Solution58 {
    public static void main(String[] args) {
        System.out.println(solution("abstract algebra"));
        System.out.println(solution("PrOgRaMmErS"));
    }

    private static String solution(String myString) {

        char[] charArray = myString.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'a') charArray[i] = String.valueOf(charArray[i]).toUpperCase().charAt(0);
            else if ((charArray[i] >= 'A' && charArray[i]<='Z') && charArray[i] != 'A')
                charArray[i] = String.valueOf(charArray[i]).toLowerCase().charAt(0);
        }
        return String.valueOf(charArray);

        /**
         * <h2>베스트</h2>
         * return myString.toLowerCase().replace("a","A");
         */
    }
}
