package Algrorithm.codewebs.saikr;

import java.util.Scanner;

public class liwu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int ans=a[0];
        for (int i=1;i<n;i++){
            if(a[i]>ans){
                ans=a[i];
            }
        }
        System.out.println(ans);
    }
}
