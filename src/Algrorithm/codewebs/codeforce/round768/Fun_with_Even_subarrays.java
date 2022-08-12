package Algrorithm.codewebs.codeforce.round768;

import java.util.Scanner;

//连题目都看不懂，老大难
public class Fun_with_Even_subarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            int ans = 0;
            int k=1;
            int index=n-1;
            while(index>=0){
                if(a[index]!=a[n-1]){

                }
            }
            System.out.println(ans);
        }
    }
}
