package Algrorithm.codewebs.codeforce.div4;

import java.util.Scanner;

public class ballons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            String s=sc.next();
            char[] x=s.toCharArray();
            String uniq="";
            for(char c:x){
                if(!uniq.contains(c+"")){
                    uniq+=c;
                }
            }
            System.out.println(uniq.length()+s.length());
        }
    }
}
