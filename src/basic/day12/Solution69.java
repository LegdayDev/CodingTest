package basic.day12;

import java.io.*;

/**
 * <h2>문제 : 덧셈식 출력하기</h2>
 * <p>
 * 두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.
 * </p>
 */
public class Solution69 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputDatas = br.readLine().split(" ");
        int a = Integer.parseInt(inputDatas[0]);
        int b = Integer.parseInt(inputDatas[1]);

        bw.write(a+" + " + b + " = " + (a+b));
        bw.flush();

        bw.close();
        br.close();
    }
}
