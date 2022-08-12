package Algrorithm.codewebs.codeforce.round807;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int c=sc.nextInt();
            int q=sc.nextInt();
            String s=sc.next();
            for (int j = 0; j < c; j++) {
                int l=sc.nextInt();
                int r=sc.nextInt();
                String temp=s.substring(l-1,r);
                s+=temp;
            }
            for (int j = 0; j < q; j++) {
                int k=sc.nextInt();
                System.out.println(s.charAt(k-1));
            }
        }
    }
}
