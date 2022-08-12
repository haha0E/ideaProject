package Algrorithm.codewebs.codeforce.goodbye2021;

import java.util.Scanner;

public class Mirror_in_the_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            String s=sc.next();
            char[] c=s.toCharArray();
            String ans="";
            int index=n-1;
            for (int j = 0; j < n-1; j++) {
                if(c[j]<c[j+1]||c[j]==c[j+1]&&j==0) {
                    index = j;
                    break;
                }
//                if(c[j]<c[j+1]){
//                    index=j;
//                    break;
//                }else if(c[j]==c[j+1]&&j==0){
//                    index=j;
//                    break;
//                }
            }
//            ans+=s.substring(0,index+1);
//            for (int j = index; j >= 0; j--) {
//                ans+=c[j];
//            }
//            System.out.println(ans);
            for(int j=0;j<index+1;j++){
                System.out.print(c[j]);
            }
            for (int j = index; j >= 0; j--) {
                System.out.print(c[j]);
            }
            System.out.println();

        }
    }
}
