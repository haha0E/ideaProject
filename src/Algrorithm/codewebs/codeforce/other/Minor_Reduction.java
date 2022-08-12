package Algrorithm.codewebs.codeforce.other;

import java.util.Scanner;

public class Minor_Reduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            String ans = "";
            for (int j = 0; j < s.length() - 1; j++) {
                char[] c = s.toCharArray();
                int a = c[j]-'0';
                int b = c[j + 1]-'0';
                int re = a + b;
                String cha = String.valueOf(re);
                char[] d = cha.toCharArray();
                if (d.length > 1) {
                    c[j] = d[0];
                    c[j + 1] = d[1];
                    ans = new String(c);
                } else {
                    c[j] = '\0';
                    c[j + 1] = d[0];
                    String ta = new String(c);
                    ta = ta.replace("\0", "");
                    if(j==0){
                        ans=ta;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
