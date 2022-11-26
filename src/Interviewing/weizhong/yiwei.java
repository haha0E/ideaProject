package Interviewing.weizhong;

import java.util.Scanner;

public class yiwei {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a=sc.nextInt();
            String aa=Integer.toBinaryString(a);
            int b=sc.nextInt();
            String bb=Integer.toBinaryString(b);
            String l=aa.length()>bb.length()?aa:bb;
            String s=aa.length()<bb.length()?aa:bb;
            if(l.substring(0,s.length()).equals(s)){
                int ans=Math.abs(aa.length()-bb.length());
                if(ans%3==0){
                    ans=ans/3;
                }else{
                    ans=ans/3+1;
                }
                System.out.println(ans);
            }else{
                System.out.println(-1);
            }
        }
    }
}
