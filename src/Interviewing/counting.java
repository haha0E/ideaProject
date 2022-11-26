package Interviewing;

import java.util.Scanner;

public class counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x=new int[]{20,3,8,7,1,4,2,13,5,6,11,12,18};
        findmin(x);

    }
    public static void findmin(int[] num){
        int[] tar=new int[10000000];
        for(int x:num){
            tar[x]=x;
        }
        int ans=0;
        for(int i=1;i<num.length;i++){
            if(tar[i]==0){
                System.out.println(i);
                break;
            }
        }
    }
}
