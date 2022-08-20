package Interviewing.c4399;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {
    static int ans = 0;
    static int M = 0;
    static int N = 0;
    static int C = 3;
    static List<String> s = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        dfs(1);
        System.out.println(ans);
    }

    public static void dfs(int i) {
        if ((N == 0 && M == 0) || (C <= 0)) {
            System.out.println(s);
            if (C == 0 && N == 0 && M == 0) {
                ans++;
                System.out.println("true");
            } else {
                System.out.println(" false");
            }
        } else {
            if (N > 0) {
                N--;
                C--;
                s.add("N");
                dfs(i + 1);
                s.remove(s.size() - 1);
                C++;
                N++;
            }
            if (M > 0) {
                M--;
                C *= 2;
                s.add("M");
                dfs(i + 1);
                s.remove(s.size() - 1);
                C /= 2;
                M++;
            }
        }
    }
}
