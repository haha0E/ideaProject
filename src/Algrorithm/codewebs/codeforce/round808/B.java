package Algrorithm.codewebs.codeforce.round808;

import java.util.Scanner;

public class B {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            solve();
        }
    }
    public static void solve(){
        int n=sc.nextInt();
        int l=sc.nextInt();
        int r= sc.nextInt();
        int[] ans=new int[n];
        for (int j = 1; j <= n; j++) {
            int x=j*(r/j);
            if(x<l){
                System.out.println("NO");
                return;
            }else{
                ans[j-1]=x;
            }
        }
        System.out.println("YES");
        for (int j = 0; j < n; j++) {
            System.out.printf(ans[j]+" ");
        }
        System.out.println();
    }
}
