package Algrorithm.codewebs.codeforce.round767;

import java.util.Arrays;
import java.util.Scanner;

public class Meximum_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            StringBuilder ans = new StringBuilder();
            int count = 0;
            //循环体
            while (a.length != 0) {
                int[] mex = new int[n];//通过一次遍历找到断开的位置
                for (int j = 0; j < n; j++) {
                    int[] temp = new int[j + 1];
                    for (int k = 0; k < j + 1; k++) {
                        temp[k] = a[k];
                    }
//                    mex[j] = Mex(temp);
                    System.out.println();
                    mex[j]=Mex(Arrays.copyOfRange(a,0,j));
                }
                int index = n - 1;
                for (int j = 0; j < n - 1; j++) {
                    if (mex[j] == mex[n - 1]) {
                        index = j;
                        break;
                    }
                }
                ans.append(String.valueOf(mex[n - 1])).append(" ");
                count++;
                int len = n - index - 1;
                int[] ne = new int[len];
                for (int j = index + 1; j < n; j++) {
                    ne[j - index - 1] = a[j];
                }
                a = ne;
                n = len;
            }
            System.out.println(count);
            System.out.println(ans);
        }
    }
    public static int Mex(int[] x) {
        Arrays.sort(x);
        int mex=0;
        for (int i = 0; i < x.length; i++) {
            if(x[i]==mex){
                mex++;
            }
        }
        return mex;
    }
}
