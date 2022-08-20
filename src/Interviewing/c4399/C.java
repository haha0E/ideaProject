package Interviewing.c4399;

import java.util.Arrays;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        battle2(new int[]{7,10}, new int[]{0, 2,3}, 1, 5);
    }

    public static void battle2(int[] A, int[] B, int num, int power) {
        Arrays.sort(A);
        Arrays.sort(B);
        int a = A.length;
        int b = B.length;
        int j = 0;
        int cnt = 0;
        for (int i = 0; i < b; i++) {
            for (; j < a; j++) {
                if (B[i] >= A[j]) {
                    cnt++;
                    A[j] = Integer.MAX_VALUE;
                    B[i] = Integer.MAX_VALUE;
                    break;
                }
            }
        }
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < b; i++) {
            for (j = 0; j < a; j++) {
                if (B[i] +power>= A[j]&&num>0) {
                    cnt++;
                    A[j] = Integer.MAX_VALUE;
                    B[i] = Integer.MAX_VALUE;
                    num--;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
