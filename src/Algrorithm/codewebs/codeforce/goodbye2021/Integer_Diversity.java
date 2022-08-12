package Algrorithm.codewebs.codeforce.goodbye2021;

import java.util.Arrays;
import java.util.Scanner;

public class Integer_Diversity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int[] a=new int[n];
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextInt();
            }
            int[] count=new int[201];
            Arrays.fill(count,0);
            for (int j = 0; j < n; j++) {
                count[a[j]+100]++;
            }
            int ans=0;
            for (int j = 0; j < 201; j++) {
                if(count[j]>1){
                    count[j]--;
                    if(j<100){
                        count[j+(100-j)*2]++;
                    }else{
                        count[j-(j-100)*2]++;
                    }
                }
            }
            for (int j = 0; j < 201; j++) {
                if(count[j]>0){
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
