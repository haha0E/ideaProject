package Algrorithm.codewebs.codeforce.hello2022;


import java.util.Scanner;

public class Stable_Arrangement_of_Rooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            char[][] c=new char[n][n];
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < n; l++) {
                    c[j][l]='.';
                }
            }
            int temp=k;
            for (int j = 0; j < n; j+=2) {
                if(temp>0) {
                    c[j][j] = 'R';
                    temp--;
                }
            }
            int count=0;
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < n; l++) {
                    if(c[j][l]=='R'){
                        count++;
                    }
                }
            }
            if(count!=k){
                System.out.println(-1);
            }else {
                for (int j = 0; j < n; j++) {
                    for (int l = 0; l < n; l++) {
                        System.out.print(c[j][l]);
                    }
                    System.out.println();
                }
            }
        }
    }
}

