package Algrorithm.codewebs.codeforce.other;

import java.util.Scanner;

public class Not_sitting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int d = 0;
            int mid = n % 2 == 0 ? 2 : 1;
            int l = m % 2 == 0 ? 2 : 1;
            int tmid = mid;
            int tl = l;
            d = n / 2 + m / 2;
            int p = l*mid;
            int ll=l;
            int rr=mid;
            for (int j = 0; j < n * m; j++) {
                int c = 0;
                if (mid * 2 - tmid > n) {
                    int temp = (mid * 2 - tmid - n) / 2;
//                    while (temp > 0) {
//                        c += tl * 2;
//                        tl += 2;
//                        temp--;
//                    }
                    c+=temp*(tl+tl+(temp-1)*2);
//                    tl = m % 2 == 0 ? 2 : 1;
                }
                if (l * 2 - tl > m) {
                    int temp = (l * 2 - tl - m) / 2;
//                    while (temp > 0) {
//                        c += tmid * 2;
//                        tmid += 2;
//                        temp--;
//                    }
                    c+=temp*(tmid+tmid+(temp-1)*2);
                    tmid= n % 2 == 0 ? 2 : 1;
                }
                if (j < p - c) {
                    System.out.print(d + " ");
                } else {
                    if (tl % 2 == 1 || tmid % 2 == 1) {
                        mid++;
                        l++;
                    } else {
                        mid++;
                        l++;
                        int temp=ll;
                        ll = ll < rr ? ll + 2 : ll;
                        rr = temp < rr ? rr : rr + 2;
                    }
                    if (tl % 2 == 1 || tmid % 2 == 1) {
                        p = l * mid + (mid - 1) * (l - 1);
                    } else {
                        int bl = ll < rr ? ll: ll - 2;
                        int br= l < rr ? rr - 2 : rr;
                        p = ll * rr + bl * br;
                    }
                    d += 1;
                    System.out.print(d + " ");
                }
            }
            System.out.println();
        }
    }
}
