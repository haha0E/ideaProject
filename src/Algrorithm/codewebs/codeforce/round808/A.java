package Algrorithm.codewebs.codeforce.round808;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int[] a=new int[n];
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextInt();
            }
            boolean flag=true;
            for (int j = 1; j < n; j++) {
                if(a[j]%a[0]!=0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
