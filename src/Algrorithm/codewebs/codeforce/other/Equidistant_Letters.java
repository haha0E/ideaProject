package Algrorithm.codewebs.codeforce.other;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Equidistant_Letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s=sc.next();
            char[] c=s.toCharArray();
            StringBuilder ans= new StringBuilder();
            for (int j = 0; j < c.length; j++) {
                for (int k = j+1; k < c.length; k++) {
                    if(c[j]!='0'&&c[j]==c[k]){
                        ans.append(c[j]);
                        ans.append(c[k]);
                        c[j]='0';
                        c[k]='0';
                    }
                }
            }
            for (int j = 0; j < c.length; j++) {
                if(c[j]!='0')
                    ans.append(c[j]);
            }
            System.out.println(ans);
        }
    }
}
