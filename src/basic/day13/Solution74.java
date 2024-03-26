package basic.day13;

import java.io.*;

/**
 * <h2>문제 : 문자열 돌리기</h2>
 * <p>
 * 문자열 str이 주어집니다.
 * 문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
 * </p>
 */
public class Solution74 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputStr = br.readLine();

        String[] splitStr = inputStr.split("");

        for (String s : splitStr) {
            bw.write(s+"\n");
            bw.flush();
        }
    }
}


