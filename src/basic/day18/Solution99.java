package basic.day18;

import java.io.*;

/**
 * <h2>문제 : 문자열 반복해서 출력하기</h2>
 * <p>
 * 문자열 str과 정수 n이 주어집니다.
 * <p>
 * str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.
 * </p>
 */
public class Solution99 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String[] split = input.split(" ");

        for (int i = 0; i < Integer.valueOf(split[1]); i++) {
            bw.write(split[0]);
        }
        bw.flush();

        bw.close();
        br.close();
    }
}
