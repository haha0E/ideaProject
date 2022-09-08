package Interviewing.Gbit;

import java.util.Arrays;
import java.util.Scanner;

//分杯子
public class Ait {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int m=sc.nextInt();
        int[] wc=new int[n];int[] ac=new int[m];
        for(int i=0;i<n;i++){
            wc[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            ac[i]=sc.nextInt();
        }
        Arrays.sort(wc);Arrays.sort(ac);
        int iw=0,ia=0,ans=0;
        while(iw<n&&ia<m){
            if(wc[iw]<=ac[ia]){
                iw++;
                ia++;
                ans++;
            }else if(wc[iw]>ac[ia]){
                ia++;
            }
        }
        System.out.println(ans);
    }
}
