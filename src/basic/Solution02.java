package basic;

import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%2==0)  System.out.println(n+" is even");
        else if(n%2==1)  System.out.println(n+" is odd");
    }
}