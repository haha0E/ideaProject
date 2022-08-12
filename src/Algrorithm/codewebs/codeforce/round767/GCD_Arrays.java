package Algrorithm.codewebs.codeforce.round767;

import java.time.Year;
import java.util.Scanner;

public class GCD_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int k = sc.nextInt();
            int len=r-l+1;
            int n;
            if (l % 2 == 0 && r % 2 == 0) {
                n = (r - l + 1) / 2;
            } else if (l % 2 != 0 && r % 2 != 0) {
                n = (r - l + 1) / 2 + 1;
            } else {
                n = (r - l + 1) / 2;
            }
            if (k >= n) {
                System.out.println("YES");
            } else if (len == 1 && l > 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
