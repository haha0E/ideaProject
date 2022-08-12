package Algrorithm.codewebs.codeforce.round809;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] c = new int[n];
            int m = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                c[j] = sc.nextInt();
                if (m < c[j]) {
                    m = c[j];
                }
            }
            int[] ans=new int[m];
            int[] before=new int[m];
            int[][] dp=new int[m][n];
            for (int j = 0; j < m; j++) {
                before[j]=-1;
            }
            for (int j = 0; j < n; j++) {
                if(before[c[j]-1]==-1){
                    before[c[j]-1]=j;
                    ans[c[j]-1]=1;
                }else{
                    before[c[j]-1]=j;
                    if(j-before[c[j]-1]%2!=0){

                    }
                }

            }
        }
    }
}
