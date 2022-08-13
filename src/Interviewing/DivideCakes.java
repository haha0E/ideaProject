package Interviewing;

import java.util.Scanner;

public class DivideCakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ans = Math.min(a, Math.min(b, (a + b) / 3));
            System.out.println(ans);
            System.out.println(another(a,b));
        }
    }

    public static int another(int a, int b) {
        int ans;
        int x = Math.max(a, b);
        int y = Math.min(a, b);
        if (x >= 2 * y) {
            ans = y;
        } else if (x > y && x < 2 * y) {
            int cha = x - y;
            ans = cha;
            x -= cha * 2;
            ans += same(x);
        }else {
            ans=same(x);
        }
        return ans;
    }

    public static int same(int x) {
        int z ;
        if (x % 3 == 2) {
            z=x/3*2+1;
        }else{
            z=x/3*2;
        }
        return z;
    }
}
