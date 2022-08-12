package Algrorithm.codewebs.codeforce.other;

import java.util.Scanner;

public class Not_shading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int r = sc.nextInt();
            int c = sc.nextInt();
            char[][] s = new char[n][m];
            boolean f=false;
            for (int j = 0; j < n; j++) {
                s[j] = sc.next().toCharArray();
            }
            if(s[r-1][c-1]=='B'){
                System.out.println(0);
                continue;
            }
            if(!f) {
                for (int j = 0; j < m; j++) {
                    if (s[r-1][j] == 'B') {
                        System.out.println(1);
                        f=true;
                        break;
                    }
                }
            }
            if(!f) {
                for (int j = 0; j < n; j++) {
                    if (s[j][c-1] == 'B') {
                        System.out.println(1);
                        f=true;
                        break;
                    }
                }
            }
            if(!f) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < m; k++) {
                        if (s[j][k] == 'B') {
                            System.out.println(2);
                            f=true;
                            break;
                        }
                    }
                    if(f)
                        break;
                }
            }
            if(!f) {
                System.out.println(-1);
            }
        }
    }
}
