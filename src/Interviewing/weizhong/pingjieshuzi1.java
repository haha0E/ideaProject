package Interviewing.weizhong;


import java.util.Arrays;
import java.util.Scanner;

public class pingjieshuzi1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] s=new String[n];
        for (int i = 0; i < n; i++) {
            s[i]=sc.next();
        }
        for (int i = 0; i < n; i++) {
            Arrays.sort(s,i,n);
            for (int j = i+1; j < n; j++) {
                if(s[i].length()>s[j].length()){
                    String t=s[i];
                    s[i]=s[j];
                    s[j]=t;
                }
            }
        }
        String ans="";
        Arrays.sort(s,n-3,n);
        for (int i = n-1; i > n-1-3; i--) {
            ans+=s[i];
        }
        System.out.println(ans);
    }

}
