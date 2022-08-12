package Algrorithm.codewebs.codeforce.round807;


import java.util.Arrays;
import java.util.Scanner;

public class A {
//    mark the photographer
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int x=sc.nextInt();
            int[] a=new int[2*n];
            for (int j = 0; j < 2*n; j++) {
                a[j]=sc.nextInt();
            }
            Arrays.sort(a);
            boolean f=true;
            for (int j = 0; j < n; j++) {
                if(a[j+n]-a[j]<x){
                    f=false;
                    System.out.println("NO");
                    break;
                }
            }
            if(f) {
                System.out.println("YES");
            }
        }
    }
}
