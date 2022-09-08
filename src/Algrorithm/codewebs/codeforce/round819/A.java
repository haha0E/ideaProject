package Algrorithm.codewebs.codeforce.round819;


import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int max = 0;
            int index = 0;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
                if (a[j] > max) {
                    max = a[j];
                    index = j;
                }
                if (a[j] < min) {
                    min = a[j];
                }
            }
            if (index == n - 1 || min == a[0]) {
                System.out.println(max - min);
            } else {
                int min2 = a[0];
                int max2 = a[n - 1];
                for (int j = 0; j < n; j++) {
                    if (a[j] == max) {
                        min2 = Math.min(min2, a[j + 1]);
                    }
                    if (a[j] == min) {
                        max2 = Math.max(max2, a[j - 1]);
                    }
                }
                int ans1 = max - min2;
                int ans2 = max2 - min;
                int ans = Math.max(ans1, ans2);
                System.out.println(ans);
            }
        }
    }
}
