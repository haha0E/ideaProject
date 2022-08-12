package Algrorithm.codewebs.codeforce.round767;

import java.util.Scanner;

public class Download_more_ram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n];
            int [] b=new int[n];
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                b[j]=sc.nextInt();
            }
            boolean[] f=new boolean[n];
            for (int j = 0; j < n; j++) {
                f[j]=false;
            }
            int kb=0;
            while (kb<k) {
                kb=k;
                for (int j = 0; j < n; j++) {
                    if (!f[j] && a[j] <= k) {
                        f[j] = true;
                        k += b[j];
                    }
                }
            }
            System.out.println(k);
        }
    }
}
