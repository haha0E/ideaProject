package Algrorithm.codewebs.codeforce.other;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            boolean[] f = new boolean[n + 1];
            for (int j = 1; j <= n; j++) {
                for (int k = 0; k < n; k++) {
                    if (a[k] > n) {
                        while (a[k] > n) {
                            a[k] /= 2;
                        }
                        while (f[a[k]] == true && a[k] > 0) {
                            a[k] /= 2;
                        }
                        f[a[k]] = true;
                    } else if (a[k] == j) {
                            f[j] = true;
                            break;
                    }
                }
            }
            boolean ans = true;
            for (int j = 1; j <= n; j++) {
                ans = ans && f[j];
            }
            if (ans) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
