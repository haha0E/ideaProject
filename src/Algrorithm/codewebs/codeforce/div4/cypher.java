package Algrorithm.codewebs.codeforce.div4;

import java.util.Scanner;

public class cypher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int[] x=new int[n];
            for(int j=0;j<n;j++){
                x[j]=sc.nextInt();
            }
            String[] operates=new String[n];
            for(int j=0;j<n;j++){
                int c=sc.nextInt();
                operates[j]=sc.next();
            }
            for(int j=0;j<n;j++){
                int ds=operates[j].length()-operates[j].replaceAll("D","").length();
                int us=operates[j].length()-ds;
                x[j]=x[j]+ds-us;
                if(x[j]<0){
                    while(x[j]<0) {
                        x[j] += 10;
                    }
                }else if(x[j]>0){
                    x[j]%=10;
                }
            }
            for(int it:x){
                System.out.print(it+" ");
            }
            System.out.println();
        }
    }
}
