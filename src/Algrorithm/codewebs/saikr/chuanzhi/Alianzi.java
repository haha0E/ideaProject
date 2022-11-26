package Algrorithm.codewebs.saikr.chuanzhi;

import java.util.Scanner;

public class Alianzi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(fun(a,b));
    }
    public static  int fun(int a,int b){
        int sgn=0;
        if (b<0){
            sgn=-1;
        } else{
            sgn=1;
        }
        return sgn*Math.abs(a);
    }
}
