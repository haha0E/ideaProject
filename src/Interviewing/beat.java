package Interviewing;

import java.util.Arrays;
import java.util.Scanner;

public class beat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] monsters =new int[n];
        for(int i=0;i<n;i++){
            monsters[i]=sc.nextInt();
        }
        int attack=1;
        Arrays.sort(monsters);
        int ans=0;
        for(int i=0;i<n;i++){
            while(monsters[i]>0){
                monsters[i]-=attack;
                ans++;
            }
            attack++;
        }
        System.out.println(ans);
    }
}
