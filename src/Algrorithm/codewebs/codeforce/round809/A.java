package Algrorithm.codewebs.codeforce.round809;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a=new int[n];
            char[] c=new char[m];
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextInt();

            }
            for (int j = 0; j < m; j++) {
                c[j]='B';
            }
            boolean[] b=new boolean[m];
            for (int j = 0; j < n; j++) {
                int min= Math.min(a[j] - 1, m - a[j]);
                int max= Math.max(a[j] - 1, m - a[j]);
                if(!b[min]){
                    b[min]=true;
                    c[min]='A';
                }else{
                    b[max]=true;
                    c[max]='A';
                }
            }
            System.out.println(new String(c));
        }
    }
}
