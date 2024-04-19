package basic.day19;

import java.util.Arrays;

public class Solution103 {
    public static void main(String[] args) {
        solution("Programmers");
    }

    private static int[] solution(String my_string) {
        int[] result = new int[52];

        for(char c : my_string.toCharArray()) {
            if (c >= 'A' && c <= 'Z') result[c - 65]++;
            else if (c >= 'a' && c <= 'z') result[(c - 97) + 26]++;
        }
        return result;
    }
}
