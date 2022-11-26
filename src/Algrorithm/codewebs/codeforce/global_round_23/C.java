package Algrorithm.codewebs.codeforce.global_round_23;

import java.util.Scanner;

public class C {
    static int sum = 0;
    static int n = 0;
    static int target = 0;
    static int ansSum = 0;
    static int[] a;
    static int[] ans;
    static int[] x;
    static int minus = Integer.MAX_VALUE;//与最终和的差


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入有几个数字：");
        n = sc.nextInt();
        System.out.println("请分别输入这几个数字：");
        a = new int[n];
        ans = new int[n];
        x = new int[n];
        for (int j = 0; j < n; j++)
            a[j] = sc.nextInt();
        System.out.println("请输入目标数字：");
        target = sc.nextInt();
        dfs(0);
        System.out.println("：" + ansSum + "/" + target);
        for (int i = 0; i < n; i++) {
            if (ans[i] == 1)
                System.out.println("第" + i + "：" + ans[i]);
        }
    }

    public static void dfs(int i) {
        if (i == n) {
            if (Math.abs(sum - target) < minus) {
                minus = Math.abs(sum - target);
                for (int j = 0; j < n; j++)
                    ans[j] = x[j];
                ansSum=sum;
            }
            return;
        }
        if (Math.abs(sum+a[i] - target) < minus) {
            x[i] = 1;
            sum += a[i];
            dfs(i + 1);
            sum -= a[i];
        }
        x[i] = 0;
        dfs(i + 1);
    }
}
