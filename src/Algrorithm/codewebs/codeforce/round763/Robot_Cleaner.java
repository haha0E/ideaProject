package Algrorithm.codewebs.codeforce.round763;

import java.util.Scanner;

public class Robot_Cleaner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int bx=sc.nextInt();
            int by=sc.nextInt();
            int dx=sc.nextInt();
            int dy=sc.nextInt();
            int count;
            int sx;
            int sy;
            if(bx<=dx){
                sx=dx-bx;
            }else {
                sx=n-dx+n-bx;
            }
            if(by<=dy){
                sy=dy-by;
            }else {
                sy=m-dy+m-by;
            }
            count=Math.min(sx,sy);
            System.out.println(count);
        }
    }
}
