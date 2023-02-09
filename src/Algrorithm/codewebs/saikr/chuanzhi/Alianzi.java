package Algrorithm.codewebs.saikr.chuanzhi;

import java.util.Scanner;

public class Alianzi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        System.out.println(fun(a,b));
    }
    public static  long fun(long a,long b){
        long sgn=b<0?-1:1;
        a=a<0?-a:a;
        return sgn*a;
    }
}