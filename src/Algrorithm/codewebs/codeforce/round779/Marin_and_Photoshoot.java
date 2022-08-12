package Algrorithm.codewebs.codeforce.round779;

import java.util.Scanner;

public class Marin_and_Photoshoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            String s=sc.next();
            int x=s.length();
            while(s.contains("00")||s.contains("010")){
                s=s.replaceAll("00","0110");
                s=s.replaceAll("010","0110");
            }
            System.out.println(s.length()-x);
        }
    }
}
