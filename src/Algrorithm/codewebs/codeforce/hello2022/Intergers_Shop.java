package Algrorithm.codewebs.codeforce.hello2022;

import java.util.Scanner;

public class Intergers_Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] l = new int[n];
            int[] r = new int[n];
            int[] c = new int[n];
            for (int j = 0; j < n; j++) {
                l[j] = sc.nextInt();
                r[j] = sc.nextInt();
                c[j] = sc.nextInt();
            }
            int cc = c[0];
            int ll = l[0];
            int rr = r[0];
            System.out.println(cc);
            int llc = c[0];
            int rrc = c[0];
            int lindex = 0;
            int rindex = 0;
            int bigl=l[0];
            int bigr=r[0];
            int bigindex=0;
            for (int j = 1; j < n; j++) {
                if (l[j] < ll) {
                    ll = l[j];
                    llc = c[j];
                    lindex = j;
                } else if (l[j] == ll) {
                    if (c[j] < llc) {
                        llc = c[j];
                        lindex = j;
                    }
                }
                if (r[j] > rr) {
                    rr = r[j];
                    rrc = c[j];
                    rindex = j;
                } else if (r[j] == rr) {
                    if (c[j] < rrc) {
                        rrc = c[j];
                        rindex = j;
                    }
                }
                if(r[j]-l[j]>bigr-bigl){
                    bigindex=j;
                    bigl=l[j];
                    bigr=r[j];
                }else if(r[j]-l[j]==bigr-bigl){
                    if(c[j]<c[bigindex]){
                        bigindex=j;
                        bigl=l[j];
                        bigr=r[j];
                    }
                }
                if (lindex == rindex) {
                    cc = llc;
                }
                else if(bigl==ll&&bigr==rr){
                    cc = Math.min(llc + rrc,c[bigindex]);
                }else{
                    cc=llc+rrc;
                }

                System.out.println(cc);
            }
        }
    }
}
