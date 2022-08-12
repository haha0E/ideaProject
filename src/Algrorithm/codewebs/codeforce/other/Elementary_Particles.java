package Algrorithm.codewebs.codeforce.other;

import java.util.Arrays;
import java.util.Scanner;

public class Elementary_Particles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int[] a=new int[n];
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextInt();
            }
            int len=-1;
            for (int j = 0; j < n-j; j++) {
                for (int k = j+1; k < n; k++) {
                    if(a[j]==a[k]){
                        int l=Math.min(j,k);
                        int r=Math.min(n-j-1,n-k-1);
                        if(l+r+1>len&&l+r+1<n)
                            len=l+r+1;
                        break;
                    }
                    if(len==n-1)
                        break;
                }
            }
            System.out.println(len);
        }
    }
}
