package Algrorithm.codewebs.nowcoder;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ziduanhe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            if(a[i]==0){
                System.out.println("NO");
                System.exit(0);
            }
        }
        List<Integer> minus=new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            if (a[i]<0){
                minus.add(a[i]);
                a[i]=0-a[i];
            }
        }
        boolean[] flag=new boolean[minus.size()];
        for(int i=0;i<minus.size();i++){
            flag[i]=false;
        }
        int index=0;
        while(index<minus.size()){
            int x=minus.get(index);
            for (int i = 0; i < n; i++) {
                if(x+a[i]!=0){
                    flag[index]=true;
                    break;
                }
            }
            index++;
        }
        boolean x=true;
        for (int i = 0; i < minus.size(); i++) {
            x=x&flag[i];
        }
        if(x){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
