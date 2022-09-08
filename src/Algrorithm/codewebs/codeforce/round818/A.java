package Algrorithm.codewebs.codeforce.round818;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int ans=n/2*2+n/3*2+n;
            System.out.println(ans);
        }
    }
}
