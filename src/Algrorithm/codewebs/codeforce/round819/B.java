package Algrorithm.codewebs.codeforce.round819;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            if(n>m){
                System.out.println("No");
            }else if(m%n==0){
                for (int j = 0; j < n; j++) {
                    System.out.print(m/n+" ");
                }
                System.out.println();
            }else{
                System.out.println("Yes");
                for (int j = 0; j < n; j++) {
                    int temp=0;
                    while(m>0){
                       temp=temp*2+(m%2==0?1:0);
                       m=m/2;
                    }
                    System.out.print(temp+" ");
                    m=temp;
                }
                System.out.println();
            }
        }
    }

}
