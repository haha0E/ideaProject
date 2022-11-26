package Algrorithm.codewebs.saikr.chuanzhi;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int  l=Math.max(n,m);
        int[] a=new int[l+1];
        int[] b=new int[l+1];
        for(int i=l-n+1;i<l+1;i++){
            a[i]= sc.nextInt();
        }
        for(int i=l-m+1;i<l+1;i++){
            b[i]= sc.nextInt();
        }
        int t=2;
        int o=0;
        int[] ans=new int[l+1];
        for(int i=l;i>0;i--){
            ans[i]=(a[i]+b[i])%t+o;
            o=(a[i]+b[i])/t;
            t++;
        }
        boolean x=false;
        for(int i:ans){
            if(i>0)
                x=true;
            if(x)
                System.out.print(i+" ");
        }
    }


}
