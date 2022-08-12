package Algrorithm.Vol.V_BackTrack;

import java.util.Scanner;

public class colorring {
    static int n;//节点数
    static int m;//颜色数
    static int[][] g;
    static int[] x;//当前节点的着色方案
    static long sum;//总的着色方案

    public static long m_coloring(int mm, int nn, int[][] gg) {
        n = nn;
        m = mm;
        x = new int[n + 1];
        g = gg;
        sum = 0;
        backtrack(1);
        return sum;
    }

    public static void backtrack(int i) {
        if (i > n) {
            sum++;
            //输出具体着色方案
//            for (int j = 1; j < n; j++) {
//                System.out.println("第" + j + "个节点涂上第" + x[j] + "个颜色");
//            }
//            System.out.println();
        } else {
            for (int j = 1; j <= m; j++) {
                x[i] = j;
                if (judgecolor(i))
                    backtrack(i+1);
                x[i] = 0;
            }
        }
    }

    public static boolean judgecolor(int k) {
        for (int i = 1; i <= n; i++) {
            if (g[k][i] == 1 && x[k] == x[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int color;
        int node;
        int[][] graph;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入颜色的数量");
//        color=sc.nextInt();
//        System.out.println("请输入节点的数量");
//        node=sc.nextInt();
//        graph=new int[node+1][node+1];
//        System.out.println("请输入图的邻接矩阵：");
//        for (int i = 1; i <= node ; i++) {
//            for (int j = 0; j <= node; j++) {
//                graph[i][j]=sc.nextInt();
//            }
//        }
        node = 6;
        int[][] gg = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 1, 1},
                {0, 1, 0, 1, 1, 1, 0},
                {0, 0, 1, 0, 1, 0, 0},
                {0, 0, 1, 1, 0, 1, 0},
                {0, 1, 1, 0, 1, 0, 1},
                {0, 1, 0, 0, 0, 1, 0},
        };
        for (color = 3; color <= 5; color++) {
            long ans = m_coloring(color, node, gg);
            System.out.println("当一共有"+color+"种颜色时，着色方案一共有"+ans+"种");
        }
    }
}
