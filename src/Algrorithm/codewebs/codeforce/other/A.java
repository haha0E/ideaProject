package Algrorithm.codewebs.codeforce.other;

import java.util.Scanner;

public class A {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int[] a=new int[n];
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextInt();
            }
            int ans=0;
            int max=a[0];
            int min=a[0];
            for (int j = 1; j < n; j++) {
                if(a[j]<min){
                    min=a[j];
                }
                if(max<a[j]){
                    max=a[j];
                }
            }
            ans=max-min;
            System.out.println(ans);
        }
    }
}
