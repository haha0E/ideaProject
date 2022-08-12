package Algrorithm.codewebs.nowcoder;

import java.util.Scanner;

public class zuowen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        String[] a=new String[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.next();
        }
        int ans=0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < i+k+2&&j<n; j++) {
                if(a[i].equals(a[j])){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
