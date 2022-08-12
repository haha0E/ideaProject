package Algrorithm.codewebs.codeforce.div4;

import java.util.*;

public class doubleStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String[] s=new String[n];
            HashSet<String> conn=new HashSet<>();
            for (int j = 0; j < n; j++) {
                s[j]=sc.next();
                conn.add(s[j]+s[j]);
            }
            for (int j = 0; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    conn.add(s[j]+s[k]);
                    conn.add(s[k]+s[j]);
                }
            }
            for (int j = 0; j < n; j++) {
                if(conn.contains(s[j])){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
