package Algrorithm.codewebs.codeforce.round768;

import java.util.Scanner;

public class Min_Max_Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                b[j]=sc.nextInt();
            }
            int ans=0;
            int a1=0;
            int b1=0;
            for (int j = 0; j < n; j++) {
                if(b[j]<a[j]){
                    int temp=b[j];
                    b[j]=a[j];
                    a[j]=temp;
                }
                if(a1<a[j]){
                    a1=a[j];
                }
                if(b1<b[j]){
                    b1=b[j];
                }
            }
            ans=a1*b1;
            System.out.println(ans);
        }
    }
}
