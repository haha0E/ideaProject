package Algrorithm.codewebs.codeforce.div4;

import java.util.Scanner;

public class yes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String x=sc.next();
            if(x.toLowerCase().equals("yes")){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
