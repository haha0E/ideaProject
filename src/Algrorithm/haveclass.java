package Algrorithm;

import java.util.Scanner;

public class haveclass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] classes =new int[2*m];
        for(int i=0;i<m;i++){
            classes[i]=sc.nextInt();
        }
    }
}
