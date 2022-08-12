package Algrorithm.codewebs.codeforce.other;

import java.util.Scanner;

public class Ancient_Civilization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int l = sc.nextInt();
            int[] x = new int[n];
            for (int j = 0; j < n; j++) {
                x[j] = sc.nextInt();
            }
            char[][] s = new char[n][l];
            for (int j = 0; j < n; j++) {
                String temp = Integer.toBinaryString(x[j]);
                while (temp.length() < l) {
                    temp = "0" + temp;
                }
                s[j] = temp.toCharArray();
            }
            String a = "";
            for (int j = 0; j < l; j++) {
                int total = 0;
                for (int k = 0; k < n; k++) {
                    if (s[k][j] == '1') {
                        total++;
                    }
                }
                if (total > n / 2) {
                    a += "1";
                } else {
                    a += "0";
                }
            }
            int ans = Integer.parseInt(a, 2);
            System.out.println(ans);
        }
    }
}
