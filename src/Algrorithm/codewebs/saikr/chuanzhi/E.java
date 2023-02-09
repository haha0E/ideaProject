package Algrorithm.codewebs.saikr.chuanzhi;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        for(int i=0;i<t;i++){
            long k=sc.nextLong();
            long c=0;
            long x;
            long r=10000000;
            long l=0;
            while(r>l){
                long m=l+(r-l)/2;
                x=1+(m-1)*4;
                long sm=((1+x)*m)/2;
                if(k<sm){
                    r=m-1;
                }else {
                    l=m+1;
                }
            }
            long sl=((1+1+l*4)*(l+1))/2;
            x=1+l*4;
            while(sl>k){
                sl-=x;
                x-=4;
            }
            k-=sl;
            x+=4;
            long ans=0;
            if(k-1>x/2){
                ans-=Math.min(x-k,k-1-x/2);
            }else{
                ans+=Math.min(k-1,x/2-k+1);
            }
            System.out.println(ans);
        }
    }
}
