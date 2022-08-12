package Algrorithm.codewebs.codeforce.other;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int minus = 0;
            if (Math.abs(a - b) == Math.abs(b - c)) {
                System.out.println("YES");
                continue;
            }
            if ((Math.abs(a - c) / 2 + Math.min(a, c)) % b == 0) {
                int B = Math.abs(a - c) / 2 + Math.min(a, c);
                if (B/b>0&&a - B == B - c) {
                    System.out.println("YES");
                    continue;
                }
            }
            if ((Math.abs(b - c) + b) % a == 0 || (b - Math.abs(b - c)) % a == 0) {
                minus = Math.abs(c - b);
                int A = b >= c ? b + minus : b - minus;
                if (A/a>0&&A - b == b - c) {
                    System.out.println("YES");
                    continue;
                }
            }
            if ((Math.abs(b - a) + b) % c == 0 || (b - Math.abs(b - a)) % c == 0) {
                minus = Math.abs(a - b);
                int C = a >= b ? b - minus : b + minus;
                if (C/c>0&&a - b == b - C) {
                    System.out.println("YES");
                    continue;
                }
            }
            System.out.println("NO");
        }
    }
}
