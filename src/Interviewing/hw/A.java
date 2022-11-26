package Interviewing.hw;

import java.util.*;
public class A {
    static int[] a = new int [100010];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        int x = sc.nextInt();
        if (sum <= x) {
            System.out.println(-1);
        } else {
            System.out.println(x / n);
        }
    }
}
