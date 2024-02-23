package basic.day01;

import java.util.Scanner;

/**
 * <h2>문제 : 홀짝 출력하기</h2>
 */
public class Solution02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%2==0)  System.out.println(n+" is even");
        else if(n%2==1)  System.out.println(n+" is odd");
    }
}
