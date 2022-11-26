package Algrorithm.codewebs.codeforce.global_round_23;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            int be = 0;
            int ed = n - 1;
            int cnt = 0;
            while (be < ed) {
                while (a[be] != 1&&be < ed) {
                    be++;
                }
                while (a[ed] != 0&&be < ed) {
                    ed--;
                }
                if (ed > be) {
                    cnt++;
                    be++;
                    ed--;
                }
            }
            System.out.println(cnt);
        }
    }
}
